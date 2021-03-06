<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ham" tagdir="/WEB-INF/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<title>Community Detail</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
<link rel="icon" type="image/png" sizes="96x96"
	href="images_1/favicon-96x96.png">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/iconic/css/material-design-iconic-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/linearicons-v1.0.0/icon-font.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/animsition/css/animsition.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/perfect-scrollbar/perfect-scrollbar.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--======================================CSS?????? ??????=================================================-->
<link rel="stylesheet" href="css_1/NewFile.css">
</head>
<body class="animsition">

	<!-- Header -->
	<header class="header-v4">
		<!-- Header desktop -->
		<div class="container-menu-desktop">
			<!-- Topbar -->
			<div class="top-bar">
				<div class="content-topbar flex-sb-m h-full container">
					<div class="left-top-bar"></div>

					<%-- ! ??????????????? ?????? ! --%>
					<ham:login_topbar type="web" />

				</div>
			</div>
			<div class="wrap-menu-desktop">
				<nav class="limiter-menu-desktop container">

					<!-- Logo desktop -->
					<a href="main.do" class="logo"> <img src="images_1/logo.png"
						alt="IMG-LOGO">
					</a>

					<!-- Menu desktop -->
					<div class="menu-desktop">

						<%-- ! ??????????????? ?????? ! --%>
						<ham:login_menudesk type="web" />

					</div>

					<!-- Icon header -->
					<div class="wrap-icon-header flex-w flex-r-m">
						<div
							class="icon-header-item cl2 hov-cl1 trans-04 p-l-22 p-r-11 js-show-modal-search">
							<i class="zmdi zmdi-search"></i>
						</div>
					</div>
				</nav>
			</div>
		</div>

		<!-- Header Mobile -->
		<div class="wrap-header-mobile">
			<!-- Logo moblie -->
			<div class="logo-mobile">
				<a href="main.do"><img src="images_1/logo.png" alt="IMG-LOGO"></a>
			</div>

			<!-- Icon header -->
			<div class="wrap-icon-header flex-w flex-r-m m-r-15">
				<div
					class="icon-header-item cl2 hov-cl1 trans-04 p-r-11 js-show-modal-search">
					<i class="zmdi zmdi-search"></i>
				</div>
			</div>

			<!-- Button show menu -->
			<div class="btn-show-menu-mobile hamburger hamburger--squeeze">
				<span class="hamburger-box"> <span class="hamburger-inner"></span>
				</span>
			</div>
		</div>


		<!-- Menu Mobile -->
		<div class="menu-mobile">
			<ul class="topbar-mobile">
				<li>
					<%-- ! ??????????????? ????????? ?????? ! --%> <ham:login_topbar type="mobile" />
				</li>
			</ul>

			<%-- ! ??????????????? ????????? ?????? ! --%>
			<ham:login_menudesk type="mobile" />

		</div>

		<!-- Modal Search -->
		<div
			class="modal-search-header flex-c-m trans-04 js-hide-modal-search">
			<div class="container-search-header">
				<button
					class="flex-c-m btn-hide-modal-search trans-04 js-hide-modal-search">
					<img src="images/icons/icon-close2.png" alt="CLOSE">
				</button>

				<form class="wrap-search-header flex-w p-l-15" action="psearch.do"
					method="post">
					<button class="flex-c-m trans-04">
						<i class="zmdi zmdi-search"></i>
					</button>
					<input class="plh3" type="text" name="search"
						placeholder="????????? ??????????????????">
				</form>
			</div>
		</div>
	</header>

	<%-- ????????? ?????? div --%>
	<!-- breadcrumb -->
	<div class="container">
		<div class="bread-crumb flex-w p-l-25 p-r-15 p-t-30 p-lr-0-lg">
			<a href="main.do" class="stext-109 cl8 hov-cl1 trans-04"> Main <i
				class="fa fa-angle-right m-l-9 m-r-10" aria-hidden="true"></i>
			</a> <a href="commu.do" class="stext-109 cl8 hov-cl1 trans-04">
				Community <i class="fa fa-angle-right m-l-9 m-r-10"
				aria-hidden="true"></i>
			</a> <span class="stext-109 cl4"> ${adata.atitle} </span>
			<%-- ??? ?????? ?????? --%>
		</div>
	</div>



	<%-- ??????????????? ???????????? ????????? adata??? ?????????????????? ??? --%>
	<!-- Content page -->
	<section class="bg0 p-t-52 p-b-20">

		<div class="container p-lr-300">

			<%-- if, ?????? ??? ????????? ?????? ??? ?????? ?????? ??????--%>
			<ham:if_seller_commu type="detail" />


			<div class="p-b-80">
				<div class="p-r-45 p-r-0-lg">
					<!--  -->
					<div class="wrap-pic-w how-pos5-parent">
						<img src="images_1/commu-07.JPG" alt="IMG-BLOG">
					</div>


					<%-- ????????? | ???????????? --%>
					<div class="p-t-32">
						<span class="flex-w flex-m stext-111 cl2 p-b-19"> <span>
								<span class="cl4">By</span> ${adata.auname} <span
								class="cl12 m-l-4 m-r-6">|</span>
						</span> <span> ${adata.adate} </span>
						</span>
						<%-- ????????? --%>
						<h4 class="ltext-109 cl2 p-b-28">${adata.atitle}</h4>

						<%-- ????????? --%>
						<p class="stext-117 cl6 p-b-26">${adata.atext}</p>
					</div>

					<!-- ???????????? -->
					<div class="p-t-40">
						<h5 class="mtext-113 cl2 p-b-12">????????? ???????????????</h5>

						<p class="stext-107 cl6 p-b-40">*????????? ??? ???????????? ???????????? ???????????????*</p>

						<%-- ????????? ???????????? ??????????????? ??????, ?????????????????? hidden?????? ???????????? --%>
						<form action="rinsert.do" method="post">
							<input type="hidden" name="canum" value="${adata.anum}">

							<c:choose>
								<c:when test="${udata_s.uuid != null}">
									<div class="bor19 m-b-20">
										<%-- ?????????????????????, ???????????? ?????? --%>
										<textarea class="stext-111 cl2 plh3 size-124 p-lr-18 p-tb-15"
											style="resize: none;" name="ctext"
											placeholder="?????? ????????? ??????????????????. (?????? 33???)" required maxlength="33"></textarea>
									</div>

									<div class="bor19 size-218 m-b-20">
										<input class="stext-111 cl2 plh3 size-116 p-lr-18" type="text"
											name="cuid" value="${udata_s.uuid}" readonly>
										<%-- ?????? ???????????? ????????? id, ?????? ????????? --%>
									</div>

									<input type="submit" value="?????? ??????"
										class="flex-c-m stext-101 cl0 size-125 bg3 bor2 hov-btn3 p-lr-15 trans-04 m-b-40">
										<hr class="m-b-40">
								</c:when>
								<c:otherwise>
									<div class="bor19 m-b-20">
										<%-- ????????????????????????, ???????????? ????????? --%>
										<textarea class="stext-111 cl2 plh3 size-124 p-lr-18 p-tb-15"
											name="ctext" style="resize: none;"
											placeholder="????????? ??? ?????? ???????????????." disabled></textarea>
									</div>
								</c:otherwise>
							</c:choose>


						</form>
					</div>

					<!-- ???????????? -->

					<div class="p-t-32 p-l-20" id="commentWrap"
						style="border: dotted 1px gray;">
						
						<%-- cdatas??? ???????????? ?????????, ???????????? ?????? --%>
						<c:if test="${fn:length(cdatas) == 0}">
							<p class="txt-center m-t-10 m-b-40">????????? ???????????? ????????????.</p>					
						</c:if>
						
						<c:forEach var="v" items="${cdatas}">
							<%-- ?????? ????????? ??? ???????????? ?????? id??? ?????????, --%>
							<c:if test="${udata_s.uuid==v.cuid}">
								<a href="rdelete.do?anum=${v.canum}&cnum=${v.cnum}">??????</a>
							</c:if>
							<%-- ?????????, ????????? | ???????????? --%>
							<p>${v.ctext}</p>
							<p class="fs-11">?????????: ${v.cuid} &nbsp; | &nbsp; ?????????:
								${v.cdate}</p>
							<hr>	
						</c:forEach>
						
						<%-- ????????? ???????????? ???????????? ????????? ???????????? ?????? --%>
						<c:if test="${fn:length(cdatas) != 0}">	
							<p class="txt-center m-t-10 m-b-20">????????? ?????? ?????????.</p>
						</c:if>
							
					</div>

				</div>
			</div>
		</div>
	</section>


	<!-- Footer -->
	<footer class="bg3 p-t-32 p-b-32">
		<div class="container">
			<p class="stext-107 cl6 txt-center">
				<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
				Copyright &copy;
				<script>
					document.write(new Date().getFullYear());
				</script>
				All rights reserved | Made with <i class="fa fa-heart-o"
					aria-hidden="true"></i> by <a href="https://colorlib.com"
					target="_blank">Colorlib</a> &amp; distributed by <a
					href="https://themewagon.com" target="_blank">ThemeWagon</a>
				<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
			</p>
		</div>
	</footer>

	<!-- Back to top -->
	<div class="btn-back-to-top" id="myBtn">
		<span class="symbol-btn-back-to-top"> <i
			class="zmdi zmdi-chevron-up"></i>
		</span>
	</div>
	<!--===============================================================================================-->
	<script src="vendor/jquery/jquery-3.2.1.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/animsition/js/animsition.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/bootstrap/js/popper.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/select2/select2.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/MagnificPopup/jquery.magnific-popup.min.js"></script>
	<!--===============================================================================================-->
	<script src="vendor/perfect-scrollbar/perfect-scrollbar.min.js"></script>
	<!--===============================================================================================-->
	<script src="js/main.js"></script>
	<!--=========================================??????====================================================-->
	<script src="js_1/select2.js"></script>
	<script src="js_1/scroll.js"></script>

	<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
	<script src="js_1/api_snsLogin.js"></script>
	<script src="js_1/api_weather.js"></script>

</body>
</html>
