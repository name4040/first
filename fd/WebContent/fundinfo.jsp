<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e981072 (moven)
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="card">

			<div class="card-body" style="padding: 0px">


				<table class="table table-bordered table-dark">
					<thead>
						<tr>
							<th scope="col">序号</th>
							<th scope="col">基金代码</th>
							<th scope="col">基金名称</th>
							<th scope="col">当前状态</th>
							<th scope="col">开盘价</th>
							<th scope="col">最高价</th>
							<th scope="col">最低价</th>
							<th scope="col">收盘价</th>
							<th scope="col">涨跌</th>
							<th scope="col">涨跌幅</th>
							<!-- <th scope="col"></th> -->
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users}" var="item">
							<tr>
								<th scope="row">${item.id }</th>
								<td>${item.fdcd }</td>
								<td>${item.fdnm}</td>
								<td>${item.status}</td>
								<td>${item.oppr}</td>
								<td>${item.hipr}</td>
								<td>${item.lopr}</td>
								<td>${item.clpr}</td>
								<td>${item.prchg}</td>
								<td>${item.chgpct}</td>
								<!-- <td><button type="button" class="btn btn-outline-success" style='font-size:20px'>+</button></td> -->
								<td><a type="button" href="UserBuy?id=${item.id}" class="btn btn-primary">购买</a>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
<<<<<<< HEAD
=======
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div class="card">

			<div class="card-body" style="padding: 0px">


				<table class="table table-bordered table-dark">
					<thead>
						<tr>
							<th scope="col">序号</th>
							<th scope="col">基金代码</th>
							<th scope="col">基金名称</th>
							<th scope="col">当前状态</th>
							<th scope="col">开盘价</th>
							<th scope="col">最高价</th>
							<th scope="col">最低价</th>
							<th scope="col">收盘价</th>
							<th scope="col">涨跌</th>
							<th scope="col">涨跌幅</th>
							<!-- <th scope="col"></th> -->
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users}" var="item">
							<tr>
								<th scope="row">${item.id }</th>
								<td>${item.fdcd }</td>
								<td>${item.fdnm}</td>
								<td>${item.status}</td>
								<td>${item.oppr}</td>
								<td>${item.hipr}</td>
								<td>${item.lopr}</td>
								<td>${item.clpr}</td>
								<td>${item.prchg}</td>
								<td>${item.chgpct}</td>
								<!-- <td><button type="button" class="btn btn-outline-success" style='font-size:20px'>+</button></td> -->
								<td><a type="button" href="UserBuy?id=${item.id}" class="btn btn-primary">购买</a>
								
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
>>>>>>> 8f677bb (moven)
>>>>>>> e981072 (moven)
		</div>