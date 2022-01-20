<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
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
.put_info{
    padding-bottom:20px ;
    align-items: left;
    margin: 0 auto;
    width: 50%;
}
.buttons{
    margin: 0 auto;
    width: 50%;
    padding-bottom: 70px;
}
.put_info > div {
    padding-bottom: 5px;
}
#title, #memo{
	height: 30px;
    width:  100%;
    border-radius: 4px;
    border: 1px solid #ccc;
}
input[type="submit"]{
    width: 25%;
    height: 33px;
    float: right;
    margin-left: 10px;
    border:none;
    color: white;
    background-color: #99A799;
    border-radius: 4px;
}

</style>
</head>
<body>
<section>
	<h1>할일 등록</h1>
	<form action="insert" method="post">
	<div class="add_secttion">
	<div class="put_info">
		<div>무엇을 해야하나요?</div>
		<input type="text" name="title"  id="title" placeholder="할일을 입력해주세요" /><br>
	</div>
	<div class="put_info">
		<div>참고사항이 있나요?</div>
	 	<textarea cols="25" rows="5" name="memo" id="memo" placeholder="참고할 내용을 입력해주세요"></textarea><br>
	</div>
	</div> 
	<div class="buttons">
		<input type="submit" value="등록" />
	</div>
	</form>
</section>
</body>
</html>