<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML>
 <html class="no-js">
	<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>文章展示</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	 
	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">	
	<!-- Animate.css -->
	<link rel="stylesheet" href="css/animate.css">
	<!-- Icomoon Icon Fonts-->
	<link rel="stylesheet" href="css/icomoon.css">
	<!-- Bootstrap  -->
	<link rel="stylesheet" href="css/bootstrap.css">
	<!-- Superfish -->
	<link rel="stylesheet" href="css/superfish.css">

	<link rel="stylesheet" href="css/mystyle.css">


	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	
	</head>
	<body>
		<div id="fh5co-wrapper">
		<div id="fh5co-page">
		<%@ include file="header.jsp" %>

		<div class="fh5co-hero">
			<div class="container">
				
<!-- 文章样式排版 -->		
     <div class="article">
		<s:iterator value="listNews">
		<h1 align="center"><s:property value="title"/></td></h1>
		<table border="0" width="100%">
		<tr>
		   	<td>作者：<s:property value="author"/></td>
			<td align="right">时间：<s:property value="createtime"/></td>
		</tr> 
		</table>
		<p>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
		<s:property value="context"/>
		</p>
		</s:iterator>
		</div>
<!-- 排版结束 -->
<!-- 评论区 -->
<div class="comment">
<p>评论人XXX</p>
 <div class="col-lg-12">
<input type="text" name="username" placeholder="请输入评论" class="form-control" >
</div>
</div>
			</div>	
		</div>
	
</div>
	<!-- END fh5co-page -->
	</div>
	



	<!-- END fh5co-wrapper -->

	<!-- jQuery -->


	<script src="js/jquery.min.js"></script>
	<!-- jQuery Easing -->
	<script src="js/jquery.easing.1.3.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Stellar -->
	<script src="js/jquery.stellar.min.js"></script>
	<!-- Superfish -->
	<script src="js/hoverIntent.js"></script>
	<script src="js/superfish.js"></script>

	<!-- Main JS (Do not remove) -->
	<script src="js/main.js"></script>
	</body>
</html>

