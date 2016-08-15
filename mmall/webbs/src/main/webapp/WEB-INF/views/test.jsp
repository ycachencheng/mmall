<%@ page language="java" import="java.util.*" pageEncoding="UTf-8"%>
<%
String path = request.getContextPath();
request.setAttribute("path", path);
%>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <title>test</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
    </head>

    <body>
    	this is test,${lis }
    </body>

</html>