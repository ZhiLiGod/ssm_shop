<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1, user-scalable=no">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Sign in</title>
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type="text/javascript">
    	function test(){
    		window.location.href ="${pageContext.request.contextPath}/register";
    	}
    </script>
    <style>
        .btn-custom:focus,
        .btn-custom.focus {
            color: #e6e6e6;
            background-color: #c9302c;
            border-color: #761c19;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="col-md-12 text-center" >
        <a href="${pageContext.request.contextPath}/index.action"><img src="img/logo1.jpg"></a>
    </div>
</div>

<div class="modal-body">
    <div class="container">
        <div class="thumbnail col-md-6 col-md-offset-3" >
            <form action="${pageContext.request.contextPath}/loginUser.action" method="post" class="form-horizontal">
                <h2 class="page-header">&nbsp;<strong>Sign in</strong></h2>
                <c:if test="${allErrors!=null}">
				<c:forEach items="${allErrors}" var="error">
					${error.defaultMessage} <br/>
				</c:forEach>
				</c:if>
				<font color="red"><center><b>${error }</b></center></font>
                    <div class="form-group" >
                        <div class="col-md-10 col-md-offset-1" >
                            <label class="control-label">Username</label>
                            <div>
                                <input type="text" name="username" class="form-control" placeholder="Enter username">
                            </div>
                        </div>

                    </div>
                    <div class="form-group">
                        <div class="col-md-10 col-md-offset-1">
                            <label class="control-label">Password</label>
                            <div>
                                <input type="password" name="password" class="form-control" placeholder="Enter password">
                                <br>
                            </div>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="col-md-10 col-md-offset-1">
                            <input type="submit" value="Sign in" class="btn btn-primary btn-block">
                        </div>
                    </div>
                <hr>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-1">
                        <span class="text-muted">New to GameStore?</span><br><br>
                        <input type="button" onclick="test()" class="btn btn-default btn-block" value="Create your account">
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>


<%@include file="foot.jsp" %>
</body>
</html>