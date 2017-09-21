<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css"></link>
    <title>Online Shop</title>
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <!-- <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.5.1.js"></script> -->
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/round.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/input-spinner.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/input-spinner.css" type="text/css"></link>
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"></link>
    
    <script type="text/javascript">
        $(function () {
        	//alert($("#ulId").size($("#ulId").size()));
        	$("#quantityItem").text($("input[name='hh']").size());
        	
            $('#mytab a').click(function (e) {
                e.preventDefault();//阻止a链接的跳转行为
                $(this).tab('show');//显示当前选中的链接及关联的content
            });
            
            
        });

        $(document).ready(function () {
            $('#imageCarousel').carousel();
        });

 
        
        
        function sendUpdateQuantity(id, quantity){
        	
        	id = Number(id);
        	$.ajax({
        		type:"post",
        		url:"${pageContext.request.contextPath}/changeQuantity",
        		contentType:"application/json;charset=utf-8",
        		data:JSON.stringify({cid:id, quantity:quantity}),
        		success:function(data){
        			alert(data);
        		}
        	});
        }
        
    </script>
</head>
<body data-spy="scroll" data-target="#mainNavbar" data-offset="10">
<%@include file="../top.jsp" %>

<div class="modal-body">
    <form class="form-horizontal">
	    <div class="container" style="margin-top: 20px;">
	         <div class="row">
                <h2 class="page-header">Confirm and Pay</h2>
                <div class="col-md-6">
                    <h3><b>Delivery 1 of 1</b></h3>
                    <h4>Dispatched by GameStore EU</h4>
                    <span class="text-muted">Dispatching to: ${o.address }, ${o.city}, ${o.country}, ${o.sendname } (${o.phone })</span>
                    <c:forEach items="${clist }" var="c">
                    	<input type="hidden" name="hh" />
                    	<ul id="ulId">
                        <br/>
                        <li>
                            <font size="4px">${c.items.name}</font><br/>
                            <font color="red"> ${c.items.price} </font>- <span class="text-muted">Quantity: ${c.quantity}</span><br/>
                            This item was released on <fmt:formatDate value="${c.items.createtime }" pattern="dd MMM. yyyy"/><br/>
                            Sold by: GameStore EU
                        </li>
                    </ul>
                    </c:forEach>
                    
                </div>

                <div class="col-md-6">
                    <h3><b>Choose a delivery option:</b></h3>
                    <div class="radio">
                        <label>
                            <input type="radio" checked name="radioGroup" value="1" />FREE Delivery (4-5 business days)
                        </label>
                    </div>
                    <div class="radio">
                        <label>
                            <input type="radio" name="radioGroup" value="1" />Standard Delivery (3 to 4 business days)
                        </label>
                    </div>
                </div>
            </div>


            <div class="row">
                <hr/>
                <div class="row">
                    <div class="col-md-3 pull-right" style="">
                        <div class="thumbnail" >
                                <h3 class="page-header">Total ( <span id="quantityItem"></span> items): €${o.total }</h3>
                                <input type="submit" class="btn btn-primary btn-block" value="Pay Online">
                        </div>
                    </div>
                </div>
            </div>
	    </div>
    </form>
</div>


<%@include file="../foot.jsp" %>
</body>
</html>