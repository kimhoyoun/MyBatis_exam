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

<!-- 세가지 동일 -->
<!-- 가급적 action tag 또는 jstl을 사용하도록 함. -->
<c:out value = "Hello world - saram/list.jsp"></c:out>
<!-- 스크립트를 바로 넣는건 보안상 위험하다는 판단. 지양함(쓰지마세요) -->
<%-- <%= "hello world" %>
<%
out.println("hello world");
%> --%>

<!-- JSP에서 쓰는 대표적 내장객체 Scope : page, request, session, application -->
<!-- EL과 JSTL을 혼합 형태로 사용 권장 -->
<h1><c:out value = "${title }"></c:out></h1>
<hr />
<c:forEach var ="saram" items = "${saramList }">
	<%-- <c:out value = "${saram.name }"></c:out>	 --%>
	<p>${saram.no } | ${saram.id } | ${saram.name }</p>
	
</c:forEach>

</body>
</html>