<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>사람 정보 입력</h1>
<hr />

<form action="insert.do" method="POST">
		<table border=1 width=300>
			<tr>
				<th>아이디</th>
				<td><input type="text" name = "id"  /></td>
			</tr>
			<tr>
				<th>이름</th>
				<td><input type="text" name = "name"  /></td>
			</tr>
			<tr>
				<th>나이</th>
				<td><input type="text" name = "age"  /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력" /></td>
			</tr>
		</table>
	</form>
</body>
<a href="list.do">취소</a>

</html>