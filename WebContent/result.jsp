<%@ taglib uri="http://struts.apache.org/tags-html-el" prefix="html-el" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>JSP Page</title>

</head>

<body>

<h2>Hello World!</h2>

<h2>Bạn đã chuyển sang trang result.jsp</h2>

<html:form action="book.do">

  First name: <%= request.getParameter("name")%>
  Last name: <%= request.getParameter("age")%>

</html:form>

</body>

</html>