var map;//전역변수처리

function initMap(){
		var ll={lat:37.50002, lng:127.03560};
		map=new google.maps.Map(
			document.getElementById('map'),
			{zoom:17,center:ll}
		);
		new google.maps.Marker(
			{position:ll, map:map, label:"필기"}
		);
	}
	initMap();//구글맵 생성
	
	//api키는 다른 적용페이지에 기입 (회원가입,에러페이)
