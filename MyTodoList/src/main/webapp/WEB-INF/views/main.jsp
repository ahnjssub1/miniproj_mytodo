<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ page import="java.util.List" %> 
 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
li{
    display: list-item;
}
body{
    background-color:#EAEAEA;
}
section{
	padding-top: 30px;
	background-color:white ;
	margin-left: 17%;
	margin-right: 17%;
}
h1{
	text-align:center;
	font-size: 32px;
}
.newtodoform{
	text-align:right;
}
.newtodo{
    float: right;
    margin-left: 8px;
    border:none;
    color: white;
    background-color: #99A799;
    border-radius: 3px;
}
#project-app .depth01 > li{
    margin-right: 10px;
    width:33% 
}
#project-app{
	width:90%;
	margin:0;
	
	margin-left:10%;
}
.depth01, .depth02{
   padding: 0;
    list-style: none;
    margin:0;
}
.depth01{
    display: flex;
}
#app-block{
    background-color : #D3E4CD;
    width: auto;
}
#title-block{
    background-color : #ADC2A9;   
}
.data,h2{
    margin : 0;
    margin-bottom : 10px;
    padding: 20px;
}
h2{
	color:white;
}
p{
	margin:0;
}
.titled{
    font-size: 25px;
}
.subd{
	font-size:13px;
}
.modiB{
	float: right;
	background-color : #99A799;
	color : white;
	border:none;
	
}
</style>
</head>
<body>
<section>
   <h1>나만의 Todo</h1>
   <div id="button-app">
			<form action="addlist" accept-charset="utf-8" method="post"	class="newtodoform">
				<input class="newtodo" type="submit" value="새로운 todo 등록" name="newtodo">
				&nbsp;&nbsp;&nbsp;
			</form>
	</div>
	 <br><br><br>
<nav id="project-app">	
   <ul class="depth01">
 <li>
	<div class="todo">
		<h2 class="h2 web" id="title-block">TODO</h2>
		<ul class="depth02">
			<c:if test="${fn:length(todos) gt 0}">
				<c:forEach items="${todos}" var="item">
					<c:if test="${item.state eq 'TODO'}">
						<li>
							<div class="data" id="app-block">
								<p class="titled">${item.title }</p>
								<p class="subd"> ${item.memo }</p>
									<form action="mod" accept-charset="utf-8" method="post" class="modiform">
									<input type="hidden" value=${item.no } name="no">
									<input type="hidden" value="DONE" name="state">
									<input class="modiB" type="submit" value="→" name=modi>
									</form>
								
							</div>
						</li>
					</c:if>
				</c:forEach>
			</c:if>
		</ul>
	</div>
</li>
<li>
	<div class="done">
		<h2 class="h2 web" id="title-block">DONE</h2>
		<ul class="depth02">
			<c:if test="${fn:length(todos) gt 0}">
				<c:forEach items="${todos }" var="item">
					<c:if test="${item.state eq 'DONE' }">
						<li>
							<div class="data" id="app-block">
								<p class="titled">${item.title }</p>
								<p class="subd">${item.memo } </p>
									<form action="mod" accept-charset="utf-8" method="post" class="modiform">
									<input type="hidden" value=${item.no } name="no">													
									<input class="modiB" type="submit" value="del" name=modi>
									</form>
								
								</div>
							</li>
						</c:if>
					</c:forEach>
				</c:if>
			</ul>
		</div>
</li>
   </ul>
  </nav>
</section>
</body>
</html>