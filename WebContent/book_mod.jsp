<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%request.setCharacterEncoding("UTF-8");%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>books</title>
    <style type="text/css">
        #b_div{
            border: 1px solid   silver;
            padding: 5px;
            width: 500px;
        }
        .b_span{
            display: inline-block;
            width: 100px;
        }
        .b_select{
            width: 146px;
            height: 25px;
            margin-left: -5px;
        }
        .in1{
            margin-top: 5px;
        }
    </style>
</head>
<body>
<div id="b_div">
	<form action="books?method=add" method="post">
    <span class="b_span" >图书名称</span><input type="text" name="booktype_n"><br>
    <span class="b_span">作者    </span><input type="text" name="booktype_w"><br>
    <span class="b_span">售价    </span><input type="text" name="booktype_p"><br>
    <span class="b_span">图片</span><input type="file" value="选择文件" name="booktype_i"><br>
    <span class="b_span">图书描述</span><textarea rows="6" cols="40" name="booktype_d"></textarea><br>
    <span class="b_span">所属分类</span>
    <select class="b_select" name="booktype_c">
        <option>文学类书籍</option>
        <option>人文社科</option>
        <option>哲学类书籍</option>
    </select><br>
    <input class="in1" type="reset" value="清空">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input class="in1" type="submit" value="添加">
	</form>
</div>
</body>
</html>