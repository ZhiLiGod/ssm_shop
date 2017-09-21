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
    <form class="form-horizontal" action="" method="post">
	    <div class="container" style="margin-top: 50px;">
	         <div class="col-md-12">
                <font size="4px"><a href="${pageContext.request.contextPath}/myOrder/All/1">Orders</a>&nbsp; | &nbsp;<a href="${pageContext.request.contextPath}/myOrder/Deliveried/1">Delivered Orders</a>&nbsp; | &nbsp;<a href="${pageContext.request.contextPath}/myOrder/Cancelled/1">Cancelled Orders</a></font>
                <hr/>
            </div>
            <div class="col-md-6 col-sm-6 col-lg-6">
                <font size="4px">${page.startO+1 }-${page.endO } of over ${page.total } results</font>
            </div>
            <div class="col-md-12">
                <br/>
                <table class="table table-responsive table-hover">
                    <tbody>
                    	<c:forEach items="${page.list }" var="p">
                    		<tr style="background-color: ghostwhite">
                            <td class="text-muted">ORDER PLACED<br/><fmt:formatDate value="${p.createtime }" pattern="dd MMM. yyyy" /></td>
                            <td class="text-muted">TOTAL<br/>€${p.total}${p.id }</td>
                            <td class="text-muted">DISPATCH TO<br/>${p.address }, ${p.city }, ${p.country }, ${p.sendname } </td>
                            <td class="text-muted text-right">ORDER #${p.number }
                            	<br/>
                            	STATUS: 
                                       	<c:if test="${p.status == 1 }">Unpaid</c:if>
                                       	<c:if test="${p.status == 2 }">Paid</c:if>
                                       	<c:if test="${p.status == 3 }">Cancelled</c:if>
                                       	<c:if test="${p.status == 4 }">Deliveried</c:if>
                                       	<c:if test="${p.status == 5 }">Confirmed Receipt</c:if>
                            </td>
                        	</tr>
                        <tr>
                            <td colspan="4">
                                <div class="col-md-12">
                                    <div class="col-md-4">
                                    	<c:if test="${p.status == 1 }">
                                    		<h3><b>No Delivery</b></h3>
                                    		<h4>Wait to pay</h4>
                                    	</c:if>
                                    	<c:if test="${p.status == 2 }">
	                                        <h3><b>Delivery in 5 days</b></h3>
	                                        <h4>Order has been paid</h4>
	                                    </c:if>
                                    </div>

                                    <div class="col-md-8">
                                        <div class="btn-group" style="margin-left:280px; margin-top: 20px;">
                                            <input type="button" style="width: 130px" class="btn btn-info" onclick="location.href='${pageContext.request.contextPath}/pay/${p.id}'" value="Pay Now">
                                            <input data-toggle="modal" data-target="#myModal${p.id }" type="button" style="width: 130px" class="btn btn-info" value="Cancel Order">
			                                    <div class="modal fade" id="myModal${p.id }" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
												<div class="modal-dialog">
												<div class="modal-content">
												<div class="modal-header">
												<button  type="button" class="close" data-dismiss="modal" aria-hidden="true">
													&times;
												</button>
												<h4 class="modal-title" id="myModalLabel">
													Please Confirm
												</h4>
												</div>
												<div class="modal-body">
													Do you want to cancel this order?
												</div>
												<div class="modal-footer">
												<button type="button" class="btn btn-default" data-dismiss="modal">Close
												</button>
												<input type="button" value="Cancel" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/cancel/${p.id }'">
												</div>
												</div>
												</div>
												</div>
                                            
                                            <input data-toggle="modal" data-target="#myModal1${p.id }" type="button" style="width: 130px" class="btn btn-info" value="Confirm Receipt">
                                       			<div class="modal fade" id="myModal1${p.id }" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
												<div class="modal-dialog">
												<div class="modal-content">
												<div class="modal-header">
												<button  type="button" class="close" data-dismiss="modal" aria-hidden="true">
													&times;
												</button>
												<h4 class="modal-title" id="myModalLabel">
													Please Confirm
												</h4>
												</div>
												<div class="modal-body">
													Do you want to confirm receipt?
												</div>
												<div class="modal-footer">
												<button type="button" class="btn btn-default" data-dismiss="modal">Close
												</button>
												<input type="button" value="Confirm" class="btn btn-primary" onclick="location.href='${pageContext.request.contextPath}/confirm/${p.id }'">
												</div>
												</div>
												</div>
												</div>
                                       
                                        </div>
                                    </div>
									
									<c:forEach items="${p.orderDetailList }" var="od">
										<div class="col-md-12" style="margin-bottom: 10px;">
	                                        <div class="col-md-2">
	                                            <img src="${pageContext.request.contextPath}/img/${od.items.pic}" class="img-responsive">
	                                        </div>
	                                        <div class="col-md-10">
	                                            <ul class="list-unstyled">
	                                                <li><font size="4px"><a href="#"><b>${od.items.name }</b></a></font></li>
	                                                <li><font size="3px">${od.items.detail }</font></li>
	                                                <li class="text-muted">Sold by: GameStore EU &nbsp; | &nbsp; Product question? <a href="#">Ask Seller</a></li>
	          
	                                                <li>Quantity: ${od.itemsNum }</li>
	                                                <li><b><font color="red">€${od.subtotal }</font></b></li>
	                                            </ul>
	                                        </div>
	                                    </div>
									</c:forEach>
                                    
                                    

                                </div>
                            </td>

                        </tr>
                    	</c:forEach>
                        
                    </tbody>
                </table>
            </div>
	    </div>
	    <div class="text-center">
        <ul class="pagination">
        	<c:if test="${page.pageNo!=1 }">
        		<li><a href="${pageContext.request.contextPath}/myOrder/<c:if test="${page.status == 3 }">Cancelled</c:if><c:if test="${page.status == 0 }">All</c:if>/${page.pageNo-1}">Previous</a></li>
        	</c:if>
        	<c:forEach begin="1" end="${page.totalPage }" var="i">
        		<li <c:if test="${page.pageNo == i}">class="active"</c:if>><a href="${pageContext.request.contextPath}/myOrder/<c:if test="${page.status == 3 }">Cancelled</c:if><c:if test="${page.status == 0 }">All</c:if>/${i}">${i }</a></li>
        	</c:forEach>         
            <c:if test="${page.pageNo!=page.totalPage }">
            	<li><a href="${pageContext.request.contextPath}/myOrder/<c:if test="${page.status == 3 }">Cancelled</c:if><c:if test="${page.status == 0 }">All</c:if>/${page.pageNo+1}">Next</a></li>
            </c:if>
            
        </ul>
    </div>
    </form>
</div>


<%@include file="../foot.jsp" %>
</body>
</html>