<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<link rel="shortcut icon" href="assets/ico/favicon.png">
<title>Welcome</title>

<!-- Bootstrap core CSS -->
<link href="resources/css/bootstrap.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="resources/css/soon.css" rel="stylesheet">
<link
	href='http://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic'
	rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:400,300,700'
	rel='stylesheet' type='text/css'>
</head>


<!-- START BODY -->
<body class="nomobile">

	<!-- START HEADER -->
	<section id="header">
	<div class="container">
		<header> <!-- HEADLINE -->
		<h1 data-animated="GoIn">
			<%
			HttpSession mysession = request.getSession(false);
				String mail = (String) mysession.getAttribute("mail");
			%>
			<b>Welcome</b>
			<%=mail%>
		</h1>
		</header>
		<br><br><br><br>
		<!-- START TIMER -->
			<a href="addCV.jsp"><div class="timer_box"><h4>Add Resume<br><br></h4></div></a>
			<a href="listCV.jsp"><div class="timer_box"><h4>All Resumes<br><br></h4></div></a>
			<a href="/hdata"><div class="timer_box"><h4>Sign    out<br><br></h4></div></a>
			
			
		<!-- END TIMER -->
		<div class="col-lg-4 col-lg-offset-4 mt centered">
			<h4></h4>
		
		</div>

	</div>
	<!-- LAYER OVER THE SLIDER TO MAKE THE WHITE TEXTE READABLE -->
	<div id="layer"></div>
	<!-- END LAYER --> <!-- START SLIDER -->
	<div id="slider" class="rev_slider">
		<ul>
			<li data-transition="slideleft" data-slotamount="1"
				data-thumb="resources/img/slider/6.jpg"><img
				src="resources/img/slider/6.jpg"></li>
		
			
		</ul>
	</div>
	<!-- END SLIDER --> </section>
	<!-- END HEADER -->

	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="resources/js/jquery.min.js"></script>
	<script type="text/javascript" src="resources/js/modernizr.custom.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>
	<script src="resources/js/soon/plugins.js"></script>
	<script src="resources/js/soon/jquery.themepunch.revolution.min.js"></script>
	<script src="resources/js/soon/custom.js"></script>
</body>
<!-- END BODY -->
</html>



