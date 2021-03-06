package Action;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.ArtistAction;
import controller.CartAction;
import controller.CartAddAction;
import controller.CartClearAction;
import controller.CartOrderAction;
import controller.CommuAction;
import controller.CommuDeleteAction;
import controller.CommuDetailAction;
import controller.CommuInsertAction;
import controller.CommuUpdateAction;
import controller.CommuUpdatePageAction;
import controller.FindIdAction;
import controller.FindPwAction;
import controller.FollowAction;
import controller.FollowUnAction;
import controller.IdCheckAction;
import controller.LoginAction;
import controller.LogoutAction;
import controller.MainAction;
import controller.MyPageAction;
import controller.ProductAction;
import controller.ProductDeleteAction;
import controller.ProductDetailAction;
import controller.ProductInsertAction;
import controller.ProductSearchAction;
import controller.ProductSelectOneAction;
import controller.ProductUpdateAction;
import controller.ReplyDeleteAction;
import controller.ReplyInsertAction;
import controller.ReviewDeleteAction;
import controller.ReviewInsertAction;
import controller.SnsLoginAction;
import controller.UserDeleteAction;
import controller.UserUpdateAction;
import controller.signUpAction;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FrontController() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		actionDo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		actionDo(request, response);
	}

	public void actionDo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uri = request.getRequestURI();
		String cp = request.getContextPath();
		String command = uri.substring(cp.length());
		System.out.println(command);
		request.setAttribute("flag", "true");
		ActionForward forward = null;
		System.out.println("?????? : ????????? ???????????? ??????");
		//// ??????
		if (command.equals("/main.do")) {
			System.out.println("??????????????? ??????");
			try {
				forward = new MainAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/main.do ??????!");
			}
		}

		//// User
		// ?????????
		else if (command.equals("/login.do")) {
			System.out.println("?????????????????? ??????");
			try {
				forward = new LoginAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/login.do ??????!");
			}
		}
		// ????????????
		else if (command.equals("/logout.do")) {
			System.out.println("????????????");
			try {
				forward = new LogoutAction().execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServletException("/logout.do ??????!");
			}
		}
		// ?????????????????????
		else if (command.equals("/signUp.do")) {
			System.out.println("????????????????????? ??????");
			try {
				forward = new signUpAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/signUp.do ??????!");
			}
		}
		// sns?????????
		else if (command.equals("/snslogin.do")) {
			System.out.println("sns ?????????");
			try {
				forward = new SnsLoginAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/snslogin.do ??????!");
			}
		}
		// ??????????????? ?????? ??? ??????
		// ??????????????? ????????? ????????? ????????? ??????????????? ??????????????? ????????? ???????????? ??????
		else if (command.equals("/myPage.do")) {
			System.out.println("???????????????");
			try {
				forward = new MyPageAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/myPage.do ??????!");
			}
		} else if (command.equals("/uupdate.do")) {
			System.out.println("?????? ??????");
			try {
				forward = new UserUpdateAction().execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServletException("/uupdate.do ??????!");
			}
		} else if (command.equals("/udelete.do")) {
			System.out.println("??????");
			try {
				forward = new UserDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/udelet.do ??????!");
			}
		} else if (command.equals("/findPw.do")) {
			System.out.println("???????????? ???????????????");
			try {
				forward = new FindPwAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/findPw.do ??????!");
			}
		} else if (command.equals("/findId.do")) {
			System.out.println("????????? ?????? ??????");
			try {
				forward = new FindIdAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/findId.do ??????!");
			}
		} else if (command.equals("/idCheck.do")) {
			System.out.println("????????? ?????? ??????");
			try {
				forward = new IdCheckAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/idCheck.do ??????!");
			}
		}

		//// Artist
		else if (command.equals("/artist.do")) {
			System.out.println("???????????????");
			try {
				forward = new ArtistAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/artist.do ??????!");
			}
		}

		//// Product
		// ?????????????????????
		else if (command.equals("/product.do")) {
			System.out.println("????????????????????? ??????");
			try {
				forward = new ProductAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/pdetail.do ??????!");
			}
		}
		// ???????????????
		else if (command.equals("/pdetail.do")) {
			System.out.println("?????? ?????? ????????? ??????");
			try {
				forward = new ProductDetailAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/pdetail.do ??????!");
			}
		}
		// ????????????
		else if (command.equals("/pinsert.do")) {
			// ?????? ?????? ????????? ????????? VIEW?????? ??????????????? ??????
			System.out.println("?????? ?????? ????????? ??????");
			try {
				forward = new ProductInsertAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/pinsert ??????!");
			}
		}
		// ????????????
		else if (command.equals("/product-update.do")) {
			System.out.println("?????? ?????? ????????? ??????");
			try {
				forward = new ProductSelectOneAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/product-update.do ??????!");
			}
		} else if (command.equals("/pupdate.do")) {
			System.out.println("?????? ?????? ??????");
			try {
				forward = new ProductUpdateAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/pupdate.do ??????!");
			}
		}
		// ????????????
		else if (command.equals("/pdelete.do")) {
			System.out.println("?????? ??????");
			try {
				forward = new ProductDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/pdelete.do ??????!");
			}
		}
		// ????????????
		else if (command.equals("/psearch.do")) {
			System.out.println("?????? ??????");
			try {
				forward = new ProductSearchAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/psearch.do ??????!");
			}
		}
		// ?????? ?????? ??? ??????
		else if (command.equals("/reviewinsert.do")) {
			System.out.println("?????? ??????");
			try {
				forward = new ReviewInsertAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/reviewinsert.do ??????!");
			}
		} else if (command.equals("/reviewdelete.do")) {
			System.out.println("?????? ??????");
			try {
				forward = new ReviewDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/reviewdelete.do ??????!");
			}
		}

		//// Community
		// ???????????????
		else if (command.equals("/commu.do")) {
			System.out.println("?????????");
			try {
				forward = new CommuAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/commu.do ??????!");
			}
		}
		// ???????????????
		else if (command.equals("/cdetail.do")) {
			System.out.println("????????? ???????????????");
			try {
				forward = new CommuDetailAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/cdetail.do ??????!");
			}
		}
		// ???????????????
		else if (command.equals("/cinsert.do")) {
			System.out.println("????????? ??????");
			try {
				forward = new CommuInsertAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/cinsert.do ??????!");
			}
		}
		// ???????????????
		else if (command.equals("/cdelete.do")) {
			System.out.println("????????? ??????");
			try {
				forward = new CommuDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/cdelete.do ??????!");
			}
		}
		// ???????????????
		else if (command.equals("/commu-update.do")) {
			System.out.println("????????? ?????? ????????? ??????");
			try {
				forward = new CommuUpdatePageAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/commu-update.do ??????!");
			}
		} else if (command.equals("/cupdate.do")) {
			System.out.println("????????? ??????");
			try {
				forward = new CommuUpdateAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/cupdate.do ??????!");
			}
		}
		// ?????? ?????? ??? ??????
		else if (command.equals("/rinsert.do")) {
			System.out.println("????????????");
			try {
				forward = new ReplyInsertAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/rinsert.do ??????!");
			}
		} else if (command.equals("/rdelete.do")) {
			System.out.println("????????????");
			try {
				forward = new ReplyDeleteAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/rdelete.do ??????!");
			}
		}
		//// Shopping-Cart
		else if (command.equals("/shopping-cartAdd.do")) {
			System.out.println("???????????? ??????");
			try {
				forward = new CartAddAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/shopping-cartAdd.do ??????!");
			}
		} else if (command.equals("/shopping-cart.do")) {
			System.out.println("???????????????????????? ??????");
			try {
				forward = new CartAction().execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ServletException("/shopping-cart.do ??????!");
			}
		} else if (command.equals("/order.do")) {
			System.out.println("????????????");
			try {
				forward = new CartOrderAction().execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServletException("/order.do ??????!");
			}
		} else if (command.equals("/shopping-cartDelete.do")) {
			System.out.println("???????????? ?????????");
			try {
				forward = new CartClearAction().execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServletException("/shopping-cartDelete.do ??????!");
			}
		}
		//// Follow
		else if (command.equals("/follow.do")) {
			System.out.println("?????????");
			try {
				forward = new FollowAction().execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServletException("/follow.do ??????!");
			}
		} else if (command.equals("/followUn.do")) {
			System.out.println("????????????");
			try {
				forward = new FollowUnAction().execute(request, response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				throw new ServletException("/followUn.do ??????!");
			}
		} else {
			System.out.println("????????? ??????!");
		}

		if (forward != null) {

			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			}

			RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
			dispatcher.forward(request, response);
		}
		String flag = (String) request.getAttribute("flag");
		if (flag.equals("true")) {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.print("<script>alert(\'" + (String) request.getAttribute("jsmsg") + "!\');"
					+ (String) request.getAttribute("jsAction") + ";</script>");
		}

	}

}