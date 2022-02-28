<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사람 정보 수정</h1>
	<hr />

	<form action="update.do" method="POST">
		<table border=1 width=300>
		<input type = "hidden" name = "no" value = ${saram.no } />
			<tr>
				<th>아이디</th>
				<td><input type="text" name = "id" value=${saram.id } /></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name = "name" value=${saram.name } /></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" name = "age" value=${saram.age } /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정" /></td>
			</tr>
		</table>
	</form>
	
<a href="detail.do?no=${saram.no }">취소</a>
</body>
</html>