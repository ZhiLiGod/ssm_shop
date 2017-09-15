<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1, user-scalable=no">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Register</title>
    <script src="${pageContext.request.contextPath}/js/jquery-2.2.4.min.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<script type="text/javascript">
	function checkUsername(){
		//alert("哈哈哈哈");
		// 获得文件框值:
		var username = document.getElementById("username").value;
		// 1.创建异步交互对象
		var xhr = createXmlHttp();
		// 2.设置监听
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4){
				if(xhr.status == 200){
					document.getElementById("span1").innerHTML = xhr.responseText;
				}
			}
		};
		// 3.打开连接 time="+new Date().getTime()+"&
		xhr.open("GET","${pageContext.request.contextPath}/findUserByName.action?time="+new Date().getTime()+"&username="+username,true);
		// 4.发送
		xhr.send(null);
	}
	
	function createXmlHttp(){
		   var xmlHttp;
		   try{ // Firefox, Opera 8.0+, Safari
		        xmlHttp=new XMLHttpRequest();
		    }
		    catch (e){
			   try{// Internet Explorer
			         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
			      }
			    catch (e){
			      try{
			         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
			      }
			      catch (e){}
			      }
		    }
	
			return xmlHttp;
	}

</script>
</head>
<body>
<div class="container">
    <div class="col-md-12 text-center" >
        <a href="${pageContext.request.contextPath}/index"><img src="img/logo1.jpg"></a>
    </div>
</div>

<div class="modal-body">
    <div class="container">
        <div class="thumbnail col-md-6 col-md-offset-3" >
            <form action="${pageContext.request.contextPath}/registerUser.action" method="post" class="form-horizontal">
                <h2 class="page-header">&nbsp;<strong>Register</strong></h2>
                <c:if test="${allErrors!=null}">
				<c:forEach items="${allErrors}" var="error">
					<font size="2px" color="red"><center><b>${error.defaultMessage}</b></center></font> <br/>
				</c:forEach>
				</c:if>
				<font size="2px" color="red"><center><b>${error }</b></center></font>
                <div class="form-group" >
                    <div class="col-md-10 col-md-offset-1" >
                        <label class="control-label">Your name</label>
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
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-1">
                        <label class="control-label">Confirm password</label>
                        <div>
                            <input type="password" name="repassword" class="form-control" placeholder="Confirm password">
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-1">
                        <label class="control-label">Birthday</label>
                        <div>
                            <input type="date" name="birthday" class="form-control" placeholder="">
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-1">
                        <label class="control-label col-md-1" >Sex</label>
                        <div class="col-md-6" >
                            <label class="radio-inline"><input type="radio" name="sex" value="1" >Male</label>
                            <label class="radio-inline"><input type="radio" name="sex" value="2" >Female</label>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-1">
                        <label class="control-label">Address</label>
                        <div>
                            <input type="text" name="address" class="form-control" placeholder="Enter address">
                            <br/>
                        </div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-1">
                        <input type="submit" value="Create your account" class="btn btn-primary btn-block">
                    </div>
                </div>
                <hr>
                <div class="form-group">
                    <div class="col-md-10 col-md-offset-1">
                        <span class="text-muted">Already have an account? <a href="${pageContext.request.contextPath}/login">Sign in</a>  </span><br><br>
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>


<%@include file="foot.jsp" %>
</body>
</html>