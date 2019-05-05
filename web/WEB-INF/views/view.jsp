<%--
  Created by IntelliJ IDEA.
  User: Stanislav_Tarasov
  Date: 5/5/2019
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    Object string = request.getAttribute("String");
    out.println(string);
%>
</body>
</html>
