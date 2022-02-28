<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1><c:out value = "${title }"></c:out></h1>
<hr />

<table border =1 width = 500>
	<tr>
		<th>번호</th>
		<th>아이디</th>
		<th>이름</th>
		<th>나이</th>
	</tr>

<c:forEach var ="saram" items = "${saramList }">
	<tr>
		<td>${saram.no }</td>
		<td><a href="detail.do?no=${saram.no }">${saram.id }</a></td>
		<td>${saram.name }</td>
		<td>${saram.age }</td>
	</tr>
	
</c:forEach>

</table>

<a href="insert.do">정보 입력</a>
</body>
</html>