package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Action.Action;
import Action.ActionForward;
import dao.Follow_dao;
import dao.Product_dao;
import dao.User_dao;
import vo.Follow_vo;
import vo.Product_vo;
import vo.User_vo;

public class ArtistAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		ActionForward forward = new ActionForward();
		boolean result = false;
		forward.setPath("/artist.jsp");
		forward.setRedirect(false);
		ArrayList<Product_vo> pdatas = new ArrayList<Product_vo>();
		String uuid = req.getParameter("uuid");
		String loginuser = req.getParameter("loginuuid");

		Product_dao pdao = new Product_dao();
		Product_vo pvo = new Product_vo();
		User_vo uvo = new User_vo();
		User_dao udao = new User_dao();
		Follow_dao fdao = new Follow_dao();
		Follow_vo fvo = new Follow_vo();
		ArrayList<User_vo> udatas = new ArrayList<User_vo>();
		ArrayList<Follow_vo> fdatas = new ArrayList<Follow_vo>();
		udatas = udao.selectAll_user_seller(uvo);

		// ✔︎ 팔로우 상태 확인
		// View에서 넘어온 해당 작가페이지의 작가(UUID)가
		// 현재 로그인중인 ID의 팔로우 목록에 존재한다면, result=true
		fvo.setFollower(loginuser);
		System.out.println(loginuser);
		fdatas = fdao.selectAll_follow(fvo);

		for (Follow_vo v : fdatas) {
			System.out.println(v.getFollowed());
			if (v.getFollowed().equals(uuid)) {
				result = true;
				System.out.println(result);
			}
		}

		// VIEW에서 특정 작가의 페이지라고 지정해주지 않았다면(UUID에 값이 없다면),
		// "전체작가보기"이기 때문에 pdatas를 전체 제품목록으로 넘겨주고,
		// VIEW에서도 버튼 표시를 없앨 분기가 필요하므로 UUID를 null로 하여 다시 VIEW로 반환 한다.
		System.out.println(result);
		System.out.println(uuid);
		if (uuid == null || uuid.equals("")) {
			pdatas = pdao.selectAll_product(pvo);
			uuid = null;
			//해당 항목이 null이여야 뷰에서 팔로우 버튼이 없어진다
		} else {
			pvo.setPuid(uuid);
			pdatas = pdao.selectAll_product_seller(pvo);
		}

		if (pdatas.size() == 0) {
			System.out.println("로그 : 작품 없음");
			forward = null;
			req.setAttribute("jsmsg", "해당 작가의 작품은 존재하지 않습니다");
			req.setAttribute("jsAction", "history.go(-1)");
			return forward;
		}

		req.setAttribute("pdatas", pdatas);
		req.setAttribute("udatas", udatas);
		req.setAttribute("uuid", uuid);
		req.setAttribute("res", result);

		return forward;
	}

}
