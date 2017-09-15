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
<body data-spy="scroll" data-target="#mainNavbar" data-offset="10">
<%@include file="../top.jsp" %>

<div class="modal-body">
    <div class="container" style="margin-top: 50px;">
        <div class="container" style="margin-bottom: 5px;">
            <div class="row">
                <div class="col-md-6 col-sm-6 col-lg-6">
                    <font size="4px">${plist.pageNum }-${plist.endRow } of over ${plist.total } results</font>
                </div>
                <div class="col-md-6" >
                    <div class="col-md-5 pull-right">
                        <form class="form-inline">
                            <label class="control-label">Category</label>
                            <select class="form-control">
                                <option selected></option>
                                <option>PS4</option>
                                <option>XBox360</option>
                            </select>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <c:forEach items="${plist.list }" var="item">
        	<div class="col-md-3 col-sm-6 col-xs-12">
	            <div class="thumbnail">
	                <a href="${pageContext.request.contextPath}/findItemsById/${item.id}">
                    <img src="${pageContext.request.contextPath}/img/${item.pic}" class="img-responsive">
                </a>
                <h3>${item.name }</h3>
                <ul class="list-unstyled">
                	<li><font color="red">Price: €${item.price }</font></li>
                	<li>Desc: ${item.detail }</li>
                	<li><font color="green">Released Date: <fmt:formatDate value="${item.createtime}" pattern="dd MMM. yyyy"/></font></li>
                	<!--<fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss"/>-->
                </ul>
	       </div>
        	</div>
        </c:forEach>
    </div>
    <div class="text-center">
        <ul class="pagination">
        	<c:if test="${!plist.isFirstPage }">
        		<li><a href="${pageContext.request.contextPath}/myCart/${plist.pageNum-1}">Previous</a></li>
        	</c:if>
        	<c:forEach begin="1" end="${plist.pages }" var="i">
        		<li <c:if test="${plist.pageNum == i}">class="active"</c:if>><a href="${pageContext.request.contextPath}/myCart/${i}">${i }</a></li>
        	</c:forEach>         
            <c:if test="${!plist.isLastPage }">
            	<li><a href="${pageContext.request.contextPath}/myCart/${plist.pageNum+1}">Next</a></li>
            </c:if>
            
        </ul>
    </div>
</div>


<%@include file="../foot.jsp" %>
</body>
</html>