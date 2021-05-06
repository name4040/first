<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e981072 (moven)
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<%@include file="nav.jsp"%>
	</div>
	<div class="container">
		<div class="card  text-center">
			<h5 class="card-header text-white bg-dark mb-3"
				value="${userbuy.fdnm}">
				基金购买| <input type="text" readonly
					class="card-header text-white bg-dark" style="border: none"
					value="${userbuy.fdnm}">
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				现金分红
			</h5>
			<div class="col-sm-10"></div>
			<div class="card-body">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">基金代码：</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${userbuy.fdcd}">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">基金名称：</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${userbuy.fdnm}">
								</div>
							</div>
						</div>
						<div class="w-100">
							<br>
						</div>
						<div class="col">
							<div class="input-group mb-3">
								<label for="inputEmail3" class="col-sm-3 col-form-label">购买金额：</label>
								<input type="text" class="col-sm-3 col-form-label"
									placeholder="不少于1000元">
								<div class="input-group-append">
									<span class="input-group-text">元</span>
								</div>
							</div>
						</div>
						<div class="w-100"></div>
						<div class="col">
							<div class="card w-50">
								<div class="card-body">
									<h5 class="card-title">支付方式：</h5>
									<div class="btn-group mr-2" role="group"
										aria-label="First group">
										<button type="button"
											style="background: url(pay1.jpg); border-style: none; width: 180px; height: 100px"></button>
									</div>
									<div class="btn-group mr-2" role="group"
										aria-label="Second group">
										<button type="button"
											style="background: url(pay2.jpg); border-style: none; width: 180px; height: 100px"></button>
									</div>
								</div>
							</div>
						</div>
						<div class="w-100">
							<br>
						</div>
						<div class="col">
							<input type="checkbox" name="vehicle" value="Bike">阅读并同意《基金购买条款》<br> 
						</div>
						<div class="w-100">
							<br>
						</div>
						<div class="col">
							<a href="#" class="btn btn-info  btn-lg">购买</a>
						</div>

					</div>
				</div>


			</div>
		</div>
	</div>
</body>
<<<<<<< HEAD
=======
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<%@include file="nav.jsp"%>
	</div>
	<div class="container">
		<div class="card  text-center">
			<h5 class="card-header text-white bg-dark mb-3"
				value="${userbuy.fdnm}">
				基金购买| <input type="text" readonly
					class="card-header text-white bg-dark" style="border: none"
					value="${userbuy.fdnm}">
				&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
				现金分红
			</h5>
			<div class="col-sm-10"></div>
			<div class="card-body">
				<div class="container">
					<div class="row">
						<div class="col">
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">基金代码：</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${userbuy.fdcd}">
								</div>
							</div>
							<div class="form-group row">
								<label for="staticEmail" class="col-sm-2 col-form-label">基金名称：</label>
								<div class="col-sm-10">
									<input type="text" readonly class="form-control-plaintext"
										id="staticEmail" value="${userbuy.fdnm}">
								</div>
							</div>
						</div>
						<div class="w-100">
							<br>
						</div>
						<div class="col">
							<div class="input-group mb-3">
								<label for="inputEmail3" class="col-sm-3 col-form-label">购买金额：</label>
								<input type="text" class="col-sm-3 col-form-label"
									placeholder="不少于1000元">
								<div class="input-group-append">
									<span class="input-group-text">元</span>
								</div>
							</div>
						</div>
						<div class="w-100"></div>
						<div class="col">
							<div class="card w-50">
								<div class="card-body">
									<h5 class="card-title">支付方式：</h5>
									<div class="btn-group mr-2" role="group"
										aria-label="First group">
										<button type="button"
											style="background: url(pay1.jpg); border-style: none; width: 180px; height: 100px"></button>
									</div>
									<div class="btn-group mr-2" role="group"
										aria-label="Second group">
										<button type="button"
											style="background: url(pay2.jpg); border-style: none; width: 180px; height: 100px"></button>
									</div>
								</div>
							</div>
						</div>
						<div class="w-100">
							<br>
						</div>
						<div class="col">
							<input type="checkbox" name="vehicle" value="Bike">阅读并同意《基金购买条款》<br> 
						</div>
						<div class="w-100">
							<br>
						</div>
						<div class="col">
							<a href="#" class="btn btn-info  btn-lg">购买</a>
						</div>

					</div>
				</div>


			</div>
		</div>
	</div>
</body>
>>>>>>> 8f677bb (moven)
>>>>>>> e981072 (moven)
</html>