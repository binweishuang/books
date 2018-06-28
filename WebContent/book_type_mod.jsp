<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%request.setCharacterEncoding("UTF-8");%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>books</title>
</head>
<body>
<div style="line-height:50px;">
	<form action="book_type?method=add" method="post">
    <span>分类名称：</span><input type="text" name="confbooktype_n"><br>
    <span>分类描述：</span><textarea name="confbooktype_d" rows="3" cols="30"></textarea>
    <input type="submit" value="添加" >
    </form>
</div>
</body>
</html>