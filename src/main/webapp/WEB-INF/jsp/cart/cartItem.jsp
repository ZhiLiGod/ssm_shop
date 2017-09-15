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
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css" type="text/css"></link>
    
    <script type="text/javascript">
        $(function () {
        	
        	showTotal();
        	
            $('#mytab a').click(function (e) {
                e.preventDefault();//阻止a链接的跳转行为
                $(this).tab('show');//显示当前选中的链接及关联的content
            });
            
            //set click on selectAll
            $("#selectAll").click(function(){
        		var bool = $("#selectAll").prop("checked");
        		setItemCheckBox(bool);
        		setJieSuan(bool);
        		showTotal();
        	});
            
        });

        $(document).ready(function () {
            $('#imageCarousel').carousel();
        });
        //set all items
		function setItemCheckBox(bool){
			$(":checkbox[name=checkboxBtn]").prop("checked", bool);
		}
        
        
        //measure subtotal
        function showTotal(){
			/*
			1.获取所有被勾选的条目 复选框 循环便利之	
			*/
			
			var total = 0;
			$("input[name = checkboxBtn]:checked").each(function(){
				var id = $(this).val();
				var text = $("#" + id + "subtotal").text();
				total += Number(text);
			});
			//alert(total);
			$("#count").text($("input[name = checkboxBtn]:checked").size());
			$("#total").text(round(total,2));//round（）把 total 保留2 位小数
			//alert(total);
		}
        

        function go(){
        	//alert("哈哈");
        	var all = $(":checkbox[name = checkboxBtn]").size();
        	var selected = $(":checkbox[name = checkboxBtn]:checked").size();
        	if(all == selected){
        		$("#selectAll").prop("checked",true);
        		setJieSuan(true);
        	}else if(selected == 0){
        		$("#selectAll").prop("checked",false);
        		setJieSuan(false);
        	}else{
        		$("#selectAll").prop("checked",false);
        		setJieSuan(true);
        	}
        	showTotal();
        }
        
        function setJieSuan(bool){
       	 if(bool) {
       			$("#jiesuan").removeClass("btn disabled btn-block").addClass("btn btn-primary btn-block");
       			//$("#jiesuan").unbind("click");//撤消当前元素止所有click事件
       		} else {
       			$("#jiesuan").removeClass("btn btn-primary btn-block").addClass("btn disabled btn-block");
       			//$("#jiesuan").click(function() {return false;});
       		}	
       }
    </script>
</head>
<body data-spy="scroll" data-target="#mainNavbar" data-offset="10">
<%@include file="../top.jsp" %>

<!--Body-->
<div class="modal-body">
    <div class="container" style="margin-top: 50px;">
        <form id="form1" name="form1" action="${pageContext.request.contextPath}/preOrder" method="post">
        <div class="col-md-12 col-sm-12 col-lg-12">
        	<c:if test="${ fn:length(cart.clist) > 0}">
        		<table class="table table-striped table-hover">
            	 <thead>
            	
                <tr>
                <th>
                <div class="checkbox">
                	<label><input type="checkbox" id="selectAll" checked="checked"/> All</label>
                </div>
                </th>
                <th width="10%">

                </th>
                    <th width="45%">

                    </th>
                    <th width="20%">
                        Price
                    </th>
                    <th width="20%">
                        Quantity
                    </th></tr>

                </thead>
                <tbody>
                	<c:forEach items="${cart.clist }" var="c">
                		<tr>
                		<td>
							<input onclick="go()" id="cBtn" value="${c.cid }" type="checkbox" name="checkboxBtn" checked="checked"/>
						</td>
                        <td>
                            <img src="${pageContext.request.contextPath}/img/${c.items.pic}" class="img-responsive">
                        </td>
                        <td>
                        	<ul class="list-unstyled">
				                <li><strong>${c.items.name }</strong></li>
				                <li>${c.items.detail}</li>
				                <li><font color = "orange">This item released on <fmt:formatDate value="${c.items.createtime }" pattern="dd MMM. yyyy"/> </font></li>
				                <li class="text-muted">Eligible for FREE Ireland Delivery</li>
				                <li><br></li>
				                <li><a href="${pageContext.request.contextPath}/deleteCartItem/${c.cid}">Delete</a></li>
				            </ul>
                        </td>
                        <td>
                            <font color="red"><span><b>€</b></span><span id="${c.cid }subtotal"><strong>${c.total }</strong></span></font>
                        </td>
                        <td>
                            &nbsp;&nbsp;&nbsp;
                            &nbsp;
                            <span>${c.quantity}</span>
                        </td>
                    	</tr> 
                	</c:forEach>   
                </tbody>
            </table>
            
            <!-- <div class="text-center">
		        <ul class="pagination">
		        	<c:if test="${!cart.page.isFirstPage }">
		        		<li><a href="${pageContext.request.contextPath}/myCart/${cart.page.pageNum-1}">Previous</a></li>
		        	</c:if>
		        	<c:forEach begin="1" end="${cart.page.pages }" var="i">
		        		<li <c:if test="${cart.page.pageNum == i}">class="active"</c:if>><a href="${pageContext.request.contextPath}/myCart/${i}">${i }</a></li>
		        	</c:forEach>         
		            <c:if test="${!cart.page.isLastPage }">
		            	<li><a href="${pageContext.request.contextPath}/myCart/${cart.page.pageNum+1}">Next</a></li>
		            </c:if>
		            
		        </ul>
		    </div> -->
            <hr />
        	</c:if>
            <c:if test="${fn:length(cart.clist) == 0}">
            <div class="col-md-8" style="height: 380px;">
            	<h1 class="page-header">Your Shopping Basket is empty.</h1>
            	<p>
            		Your Shopping Basket lives to serve. Give it purpose--fill it with books, CDs, videos, DVDs, toys, electronics, and more.<br/>
					Continue shopping on the GameStore homepage, learn about today's deals, or visit your Wish List.<br/>
					<br/><small>The price and availability of items at Amazon.co.uk are subject to change. The shopping basket is a temporary place to store a list of your items and reflects each item's most recent price.
					<br/>Do you have a gift card or promotional code? We'll ask you to enter your claim code when it's time to pay.</small>
            	</p>
            </div>
            	
            </c:if>
        </div>
        <c:if test="${ fn:length(cart.clist) > 0}">
        	<div class="pull-right col-md-4" >
	            <div class="thumbnail" >
	            <h3 class="page-header">Subtotal (<span id="count"></span>  items): €<span id="total"></span></h3>
                <input id="jiesuan" type="submit" class="btn btn-primary btn-block" value="Proceed to Checkout"><!-- btn btn-primary btn-block -->
	            <br/>
	            <!--<div>
	            	<div class="col-md-12">
                        
                    </div>
	            </div>
	                 <form action="" method="" class="form-horizontal"> 
	                    <div class="form-group">-->
	                        
	                   <!-- </div>
	                 </form> -->
	            </div>
        	</div>
        </c:if>
      </form>  
    </div>
</div>

<%@include file="../foot.jsp" %>
</body>
</html>