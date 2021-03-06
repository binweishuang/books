<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>modify-b</title>
    <style type="text/css">
        .div1{
            text-align: center;
            line-height: 60px;
            height: 120px;
            border-bottom: 2px solid #BABABA;
        }
        .div2{
            display: inline-block;
            width: 10%;
            border-right: 2px solid #BABABA;
            height: 100%;
        }
        .div3{
            display: inline-block;
            vertical-align:top;
            padding: 5px;
        }
        .ul1 li{
            margin-bottom: 10px;
        }
        .ul2,.ul3{
            list-style-type: none;
            display: none;
            margin-bottom: 50px;
        }
          td{

        }
        table{
            text-align: center;
        }
        #b_div{
            text-align: center;
        }
        .b_class1{
            width: 130px;
        }
        .b_class2{
            width: 70px;
        }
    </style>
    <script src="jquery-1.12.0.min.js"></script>
    <script type="text/javascript">
    $(document).ready(function () {
        $(".li1").click(function () {
        $(".ul2").toggle("slow");
        })
        $(".li2").click(function () {
        $(".ul3").toggle("slow");
        })
        $(".id1").click(function(){
        $(".div3").load("book_type_mod.jsp");
        });
       
        $(".id3").click(function(){
            $(".div3").load("book_mod.jsp");
        });
       
    })
    </script>
</head>
<body>
<div class="div1">
    <h1>网站后台管理</h1>
</div>
<div class="div2">
    <ul class="ul1">
        <li class="li1"><a href="#">分类管理</a></li>
              <ul class="ul2">
                  <li class="id1"><a href="#">添加分类</a></li>
                  <li class="id2"><a href="book_type?method=listAll">查看分类</a></li>
              </ul>
        <li class="li2"><a href="#">图书管理</a></li>
        <ul class="ul3">
            <li class="id3"><a href="#">添加图书</a></li>
            <li class="id4"><a href="books?method=listAll">查看图书</a></li>
        </ul>

        <li><a href="#">订单管理</a></li>
    </ul>
</div>
<div class="div3" style="width: 900px">
<div id="b_div" >
    <h2>图书信息</h2>
    <table border="1" align="center">
        <tr>
            <td class="b_class1">图书名称</td>
            <td class="b_class2">作者</td>
            <td class="b_class2">价格</td>
            <td class="b_class1">图片</td>
            <td class="b_class2">描述</td>
            <td class="b_class2">操作</td>
        </tr>
        <c:forEach var="c" items="${bookType }">
	<tr>
		<td>${c.name}</td>
		<td>${c.writer}</td>
		<td>${c.price}</td>
		<td>${c.image}</td>
		<td>${c.descroption}</td>
		<td>
			<a href="books?method=delete&id=${c.id}">删除</a>
			<a href="books?method=find&id=${c.id}">修改</a>
		</td>
	</tr>
</c:forEach>
    </table>
</div>
</div>

</body>
</html>