<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- bt框架 -->
<%@ include file="bt.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<%@include file="nav.jsp" %>
		<ul class="nav nav-tabs">
			<li class="nav-item"><a class="nav-link" href="fundmy.jsp">我的基金</a></li>
			<li class="nav-item"><a class="nav-link" href="fundkf.jsp">开放式基金净值</a></li>
			<li class="nav-item"><a class="nav-link" href="fundfof.jsp">FOF</a></li>
			<li class="nav-item"><a class="nav-link" href="fundfb.jsp">封闭式基金净值</a></li>
			<li class="nav-item"><a class="nav-link active" href="fundfj.jsp">分级基金净值</a></li>
			<li class="nav-item"><a class="nav-link" href="fundhb.jsp">货币型基金净值</a></li>
		</ul>
	</div>
<div class="container">
<img src="data/9.png">
</div>
<div class="col">	
</div>
</body>
</html>