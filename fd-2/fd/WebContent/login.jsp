<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
.main {
	text-align: center;
	border-radius: 20px;
	width: 300px;
	height: 350px;
	margin: auto;
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
}
/* body {
   background:url("back.jpg")  no-repeat center center;   /*加载背景图*/
	/* 背景图不平铺 */
background-size
:cover
; /* 让背景图基于容器大小伸缩 */

   
background-attachment
:fixed
; /* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */
  
 
}
* /
 #login_click {
	margin-top: 32px;
	height: 40px;
}

#login_click button {
	text-decoration: none;
	background: #2f435e;
	color: #f2f2f2;
	padding: 10px 30px 10px 30px;
	font-size: 16px;
	font-family: 微软雅黑, 宋体, Arial, Helvetica, Verdana, sans-serif;
	font-weight: bold;
	border-radius: 3px;
	-webkit-transition: all linear 0.30s;
	-moz-transition: all linear 0.30s;
	transition: all linear 0.30s;
}

#login_click button:hover {
	background: #385f9e;
}

input {
	border: 1px solid #708090; /*设置输入框边框，边缘线的颜色、大小、及实线虚线*/
	height: 36px;
	border-radius: 10px;
	width: 200px;
	padding-left: 5px; /*让光标距离左边5个像素*/
}
</style>
<script type="text/javascript">
	function myReload() {
		document.getElementById("CreateCheckCode").src = document
				.getElementById("CreateCheckCode").src
				+ "?nocache=" + new Date().getTime();
	}
</script>

</head>
<body bgcolor="#F8F8FF">
	<div class="main"> 
		<p style="font-family: SimHei; font-size: 200%;">登录</p>
		<p style="color: #FF0000">${errormsg}</p>
		<form method="post" action="LoginServlet">
			<p style="font-family: SimHei; font-size: 120%;">
				姓名：<input placeholder="姓名" type="text" name="username" value="">
			</p>
			<p style="font-family: SimHei; font-size: 120%;">
				密码：<input placeholder="密码" type="password" name="password" value="">
			</p>
			<p class="font tdheight" style="font-family:SimHei;font-size:120%;">
				验证码：<input type="text" name="checkCode" placeholder="验证码"
					style="width: 80px; height: 35px;"> <img
					src="ResponseImage" id="CreateCheckCode" align="middle"
					style="margin-top: -10px;">
			</p>
			<div id="login_click">
				<button id="btlogin" >登录</button>
			</div>
			<p>
				还没有账号？ <a href="reg.html"
					style="font-size: 12px; color: red; margin-left: 10px;">立即注册</a>
			</p>
		</form>
	</div>

</body>
=======
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style>
.main {
	text-align: center;
	border-radius: 20px;
	width: 300px;
	height: 350px;
	margin: auto;
	position: absolute;
	top: 0;
	left: 0;
	right: 0;
	bottom: 0;
}
/* body {
   background:url("back.jpg")  no-repeat center center;   /*加载背景图*/
	/* 背景图不平铺 */
background-size
:cover
; /* 让背景图基于容器大小伸缩 */

   
background-attachment
:fixed
; /* 当内容高度大于图片高度时，背景图像的位置相对于viewport固定 */
  
 
}
* /
 #login_click {
	margin-top: 32px;
	height: 40px;
}

#login_click button {
	text-decoration: none;
	background: #2f435e;
	color: #f2f2f2;
	padding: 10px 30px 10px 30px;
	font-size: 16px;
	font-family: 微软雅黑, 宋体, Arial, Helvetica, Verdana, sans-serif;
	font-weight: bold;
	border-radius: 3px;
	-webkit-transition: all linear 0.30s;
	-moz-transition: all linear 0.30s;
	transition: all linear 0.30s;
}

#login_click button:hover {
	background: #385f9e;
}

input {
	border: 1px solid #708090; /*设置输入框边框，边缘线的颜色、大小、及实线虚线*/
	height: 36px;
	border-radius: 10px;
	width: 200px;
	padding-left: 5px; /*让光标距离左边5个像素*/
}
</style>
<script type="text/javascript">
	function myReload() {
		document.getElementById("CreateCheckCode").src = document
				.getElementById("CreateCheckCode").src
				+ "?nocache=" + new Date().getTime();
	}
</script>

</head>
<body bgcolor="#F8F8FF">
	<div class="main"> 
		<p style="font-family: SimHei; font-size: 200%;">登录</p>
		<p style="color: #FF0000">${errormsg}</p>
		<form method="post" action="LoginServlet">
			<p style="font-family: SimHei; font-size: 120%;">
				姓名：<input placeholder="姓名" type="text" name="username" value="">
			</p>
			<p style="font-family: SimHei; font-size: 120%;">
				密码：<input placeholder="密码" type="password" name="password" value="">
			</p>
			<p class="font tdheight" style="font-family:SimHei;font-size:120%;">
				验证码：<input type="text" name="checkCode" placeholder="验证码"
					style="width: 80px; height: 35px;"> <img
					src="ResponseImage" id="CreateCheckCode" align="middle"
					style="margin-top: -10px;">
			</p>
			<div id="login_click">
				<button id="btlogin" >登录</button>
			</div>
			<p>
				还没有账号？ <a href="reg.html"
					style="font-size: 12px; color: red; margin-left: 10px;">立即注册</a>
			</p>
		</form>
	</div>

</body>
>>>>>>> ef24faa (new)
</html>