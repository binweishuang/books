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
            width: 180px;
        }
        table{
            text-align: center;
        }
        #b_t_div{
            text-align: center;
        }
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
<div id="b_div">
	<form action="books?method=update" method="post">
    <span class="b_span" >图书名称</span><input type="text" name="booktype_n" value="${hh.name}"><br>
    <span class="b_span">作者    </span><input type="text" name="booktype_w" value="${hh.writer}"><br>
    <span class="b_span">售价    </span><input type="text" name="booktype_p" value="${hh.price}"><br>
    <span class="b_span">图片</span><input type="button" value="选择文件" name="booktype_i"><br>
    <span class="b_span">图书描述</span><textarea rows="6" cols="40" name="booktype_d">${hh.descroption}</textarea><br>
    <span class="b_span">所属分类</span>
    <select class="b_select" name="booktype_c">
        <option>文学类书籍</option>
        <option>人文社科</option>
        <option>哲学类书籍</option>
    </select><br>
    <input class="in1" type="reset" value="清空">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input class="in1" type="submit" value="修改">
	<input type="hidden" name="booktypeup_i" value=${hh.id }>
	</form>
</div>
</div>

</body>
</html>