<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css"></link>
    <title>Online Shop</title>
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"></link>
    
    <script>
        $(function () {
            $('#mytab a').click(function (e) {
                e.preventDefault();//阻止a链接的跳转行为
                $(this).tab('show');//显示当前选中的链接及关联的content
            });
        });

        $(document).ready(function () {
            $('#imageCarousel').carousel();
        });

    </script>
</head>
<body data-spy="scroll" data-target="#mainNavbar" data-offset="10">
<%@include file="top.jsp" %>

<div class="modal-body">
    <div class="container" style="margin-top: 50px;">
        <div class="row">
            <div class="col-xs-8 col-xs-offset-2">
                <div id="imageCarousel" class="carousel slide" data-interval="2000" >
                    <ol class="carousel-indicators">
                        <li data-target="#imageCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#imageCarousel" data-slide-to="1"></li>
                        <li data-target="#imageCarousel" data-slide-to="2"></li>
                        <li data-target="#imageCarousel" data-slide-to="3"></li>
                        <li data-target="#imageCarousel" data-slide-to="4"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item active">
                            <a href=""><img class="img-responsive" src="${pageContext.request.contextPath}/img/2.jpg" /></a>
                            <div class="carousel-caption">
                                <h3>Nintendo Switch</h3>
                                <p>THE NINTENDO SWITCH IS A GREAT HANDHELD</p>
                            </div>
                        </div>
                        <div class="item">
                            <a href=""><img class="img-responsive" src="${pageContext.request.contextPath}/img/2.jpg" /></a>
                            <div class="carousel-caption">
                                <h3>Nintendo Switch</h3>
                                <p>THE NINTENDO SWITCH IS A GREAT HANDHELD</p>
                            </div>
                        </div>
                        <div class="item">
                            <a href=""><img class="img-responsive" src="${pageContext.request.contextPath}/img/2.jpg" /></a>
                            <div class="carousel-caption">
                                <h3>Nintendo Switch</h3>
                                <p>THE NINTENDO SWITCH IS A GREAT HANDHELD</p>
                            </div>
                        </div>
                        <div class="item">
                            <a href=""><img class="img-responsive" src="${pageContext.request.contextPath}/img/2.jpg" /></a>
                            <div class="carousel-caption">
                                <h3>Nintendo Switch</h3>
                                <p>THE NINTENDO SWITCH IS A GREAT HANDHELD</p>
                            </div>
                        </div>
                        <div class="item">
                            <a href=""><img class="img-responsive" src="${pageContext.request.contextPath}/img/2.jpg" /></a>
                            <div class="carousel-caption">
                                <h3>Nintendo Switch</h3>
                                <p>THE NINTENDO SWITCH IS A GREAT HANDHELD</p>
                            </div>
                        </div>
                    </div>
                    <a href="#imageCarousel" class="carousel-control left" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left"></span>
                    </a>
                    <a href="#imageCarousel" class="carousel-control right" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </a>
                </div>
            </div>
        </div>
    </div>

    <div class="container">
        <h2 class="page-header">New Coming</h2>
        <c:forEach items="${listItems }" var="item">
        	<div class="col-md-3 col-sm-6 col-xs-12">
            <div class="thumbnail">
                <a href="${pageContext.request.contextPath}/findItemsById/${item.id}">
                    <img src="${pageContext.request.contextPath}/img/${item.pic}" class="img-responsive">
                </a>
                <h3>${item.name }</h3>
                <ul class="list-unstyled">
                	<li><font color="red">Price: €${item.price }</font></li>
                	<li>Desc: ${item.detail }</li>
                	<li><font color="green">Released Date: ${item.releasedDate}</font></li>
                </ul>
            </div>
        	</div>
        </c:forEach>
        
        
         <div class="col-md-12 text-right">
            <a href="${pageContext.request.contextPath}/searchItem/1"><strong>See more...</strong></a>
        </div> 
    </div>
</div>

<%@include file="foot.jsp" %>

</body>
</html>