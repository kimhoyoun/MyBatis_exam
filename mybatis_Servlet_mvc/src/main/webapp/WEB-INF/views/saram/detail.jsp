<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사람 정보 상세보기</h1>
<hr />

<table border = 1 width = 300>
	<tr>
		<th>번호</th>
		<td>${saram.no }</td>
	</tr>
	<tr>
		<th>아이디</th>
		<td>${saram.id }</td>
	</tr>
	<tr>
		<th>이름</th>
		<td>${saram.name }</td>
	</tr>
	<tr>
		<th>나이</th>
		<td>${saram.age }</td>
	</tr>
</table>

<a href="update.do?no=${saram.no}">수정</a>
<a href="delete.do?no=${saram.no}">삭제</a>
<a href="list.do">목록</a>

</body>
</html>