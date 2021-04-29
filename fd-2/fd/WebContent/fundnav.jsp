<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<ul class="nav nav-tabs">
			<li class="nav-item"><a class="nav-link nav-link-action ${menu_item=='Fundmy'?'active':''}" href="Fundmy">我的基金</a></li>
			<li class="nav-item"><a class="nav-link nav-link-action ${menu_item=='Fundall'?'active':''}" href="Fundall">全部基金</a></li>
			<li class="nav-item"><a class="nav-link nav-link-action ${menu_item=='Fundkf'?'active':''}" href="Fundkf">开放式基金净值</a></li>
			<li class="nav-item"><a class="nav-link nav-link-action ${menu_item=='FundFOF'?'active':''}" href="FundFOF">FOF</a></li>
			<li class="nav-item"><a class="nav-link nav-link-action ${menu_item=='Fundfb'?'active':''}" href="Fundfb">封闭式基金净值</a></li>
			<li class="nav-item"><a class="nav-link nav-link-action ${menu_item=='FundETF'?'active':''}" href="FundETF" >ETF</a></li>
			<li class="nav-item"><a class="nav-link nav-link-action ${menu_item=='FundLOF'?'active':''}" href="FundLOF">LOF</a></li>
		</ul>