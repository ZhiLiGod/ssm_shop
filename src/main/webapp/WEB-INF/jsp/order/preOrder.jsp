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
		//function setItemCheckBox(bool){
		//	$(":checkbox[name=checkboxBtn]").prop("checked", bool);
		//}
        
        
        //measure subtotal
        function showTotal(){
        	
			/*
				1.获取所有被勾选的条目 复选框 循环便利之	
			*/
			
			var total = 0;
			$("input[name = itemPic]").each(function(){
				
				var id = $(this).val();
				
				var text = $("#" + id + "subtotal").text();
				total += Number(text);
			});
			//alert(total);
			$("#count").text($("input[name = itemPic]").size());
			$("#total").text(round(total,2));//round（）把 total 保留2 位小数
			//alert(total);
		}
        

       /* function go(){
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
        }*/
        
        function setJieSuan(bool){
       	 if(bool) {
       			$("#jiesuan").removeClass("btn disabled btn-block").addClass("btn btn-primary btn-block");
       		} else {
       			$("#jiesuan").removeClass("btn btn-primary btn-block").addClass("btn disabled btn-block");
       		}	
       }
        
       $(".add").click(function(){
    	   var id = $(this).attr("id").substring(0, 32);
    	   alert(id);
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
    <form class="form-horizontal" action="${pageContext.request.contextPath}/order" method="post">
    <div class="container" style="margin-top: 20px;">
        <div class="col-md-6 col-sm-6 col-lg-6">
            <h2 class="page-header">Items</h2>
            <table class="table table-striped table-responsive table-hover">
                <thead>
                    <tr>
                        <th width="15%"></th>
                        <th width="45%"></th>
                        <th width="20%">Price</th>
                        <th width="20%">Quantity</th>
                    </tr>
                </thead>
                <tbody>
                	<c:forEach items="${clist }" var="c">
                		<tr >
                        <td>
                        	<input type="hidden" name="itemPic" value="${c.cid }">	
                            <img  name="" src="${pageContext.request.contextPath}/img/${c.items.pic}" class="img-responsive">
                        </td>
                        <td>
                            <ul class="list-unstyled">
                                <li><font size="4px">${c.items.name}</font></li>
                                <li><font color="green"><fmt:formatDate value="${c.items.createtime}" pattern="dd MMM. yyyy"/></font></li>
                                <li class="text-muted">${c.items.detail}</li>
                            </ul>
                        </td>
                        <td><font color="red"><span>€</span><span id="${c.cid }subtotal"><b>${c.total}</b></span></font></td>
                        <td>
                        	<input type="hidden" name="ssss" value="${c.cid }">
                            <!-- <select name="quantity" onchange="changeQuantity()" id="selectId"> 
                          
                                <c:forEach begin="1" end="10" var="i">
                                	
                                	<option id="${c.cid }opId" value="${i }" <c:if test="${c.quantity == i }">selected="selected"</c:if>>
                                		${i}
                                	</option>
                                </c:forEach>
                            </select> -->
                         	&nbsp;&nbsp;&nbsp;
                            &nbsp;
                            ${c.quantity }
                        </td>
                    	</tr>
                	</c:forEach>
                    
                </tbody>
            </table>
            <div class="text-right">
                <hr/>
                <h3><b>Total: (<span id="count"></span> Items) <font color="red">€<span id="total"></span></font></b></h3>
            </div>
        </div>

        <!--delivery detail-->
        <div class="col-md-6 col-sm-6 col-lg-6">
            <h2 class="page-header">Enter a delivery address</h2>
            <p class="text-muted">Enter the name and address you'd like your order to be delivered to.
                <br/>When finished, click the "Continue" button.
            </p>
            <div class="col-md-11 ">
                <div class="form-group">
                    <label class="control-label">Full name:</label>
                    <input class="form-control"  name="sendname">
                </div>
                <div class="form-group">
                    <label class="control-label">Address:</label>
                    <input class="form-control" name=address>
                </div>
                <div class="form-group">
                    <label class="control-label">Town/City:</label>
                    <input class="form-control" name="city">
                </div>
                <div class="form-group">
                    <label class="control-label">Country:</label>
                    <select class="form-control" name="country">
                        <option>Select country</option>
                        <option value="Ireland">Ireland</option>
                        <option value="UK">UK</option>
                        <option value="Italy">Italy</option>
                        <option value="Spain">Spain</option>
                    </select>
                </div>
                <div class="form-group">
                    <label class="control-label">Phone number:</label>
                    <input class="form-control" name="phone">
                </div>
                <div class="form-group">
                    <hr/>
                    <div class="pull-right">
                        <input type="submit" class="btn btn-primary" value="Continue">
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