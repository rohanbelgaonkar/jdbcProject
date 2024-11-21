<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<img alt="" src="D:\eclips1\calculator\src\main\webapp\image\undefined - Imgur.gif">

<h2 class=welcome>Your Answer is</h2>

<h3>Answer=<%=request.getParameter("sum")%></h3>
</body>
</html>