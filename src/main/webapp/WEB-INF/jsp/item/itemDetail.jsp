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
            })
        })

        $(document).ready(function () {
            $('#imageCarousel').carousel();
        });
</script>

</head>
<body data-spy="scroll" data-target="#mainNavbar" data-offset="10">
<%@include file="../top.jsp" %>

<!--Body-->
<div class="modal-body">
    <div class="container" style="margin-top: 50px;">
        <div class="row">
            <div class="col-md-6">
                <div class="pull-right">
                    <img src="${pageContext.request.contextPath}/img/${item.pic}" class="img-responsive">
                </div>
            </div>
            <div class="col-md-6">
                <div class="col-md-11">
                    <ul class="list-unstyled">
                        <li><h3 class="page-header">${item.name }</h3></li>
                        <li><h4><strong>Platform:</strong> PlayStation 4</h4></li>
                        <li><strong>Price:</strong><font color="#dc143c"> €${item.price }</font> & <b>FREE</b> Delivery in the Ireland </li>
                        <li><h4><font color="green"><b>This item released on <fmt:formatDate value="${item.createtime }" pattern="dd MMM. yyyy"/> </b></font></h4> </li>
                        <li class="text-muted">Dispatched from and sold by GameStore. Gift-wrap available.</li>
                    </ul>
                    <br/>
                </div>

                <div class="col-md-5">

                    <div class="thumbnail">
                        <form action="${pageContext.request.contextPath}/addToCart/1" method="post" class="form-horizontal">
                            <input type="hidden" name="id" value="${item.id }">
                            <div class="form-group" >
                                <div class="col-md-2"><label class="control-label">Quantity:</label></div>
                                <div class="col-md-5 col-md-offset-2">
                                    <select name="quantity" class="form-control">
                                        <option selected value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                        <option value="6">6</option>
                                        <option value="7">7</option>
                                    </select>
                                </div>
                            </div>
                            <div class="form-group">
                                <div class="col-md-12 ">
                                    <input type="submit" class="btn btn-primary btn-block" value="Add to my cart">
                                </div>
                            </div>
                        </form>
                    </div>


                </div>

                <div class="col-md-11">
                    <ul class="list-unstyled">
                        <li><h5><b>Note:</b> Physical products come sealed in their original packaging, directly from the manufacturer.</h5></li>
                    </ul>
                </div>

            </div>

        </div>
        
    </div>
</div>

<%@include file="../foot.jsp" %>
</body>

</html>