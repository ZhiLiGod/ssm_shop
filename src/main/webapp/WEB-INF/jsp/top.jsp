<nav id="mainNavbar"  class="navbar navbar-default navbar-fixed-top">
    <div class="container" >
        <div class="col-md-12" >
            <div class="navbar-header" >
                <button class="navbar-toggle" data-target=".navbar-collapse" data-toggle="collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="${pageContext.request.contextPath}/index"><img src="${pageContext.request.contextPath}/img/logo.jpg" height="50px"></a>
            </div>
            <div class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li><a href="${pageContext.request.contextPath}/index" class="active">Home</a></li>
                    <li class="dropdown">
                        <a href="" class="dropdown-toggle" data-toggle="dropdown">Products
                            <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">Games</a></li>
                            <li><a href="#">PlayStations</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Contact</a></li>
                    <li><a href="#">About</a></li>
                </ul>
                <form id="form1" name="form1" action="${pageContext.request.contextPath}/searchItem/1" method="post" class="navbar-form navbar-left" role="search">
                    <div class="form-group">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Search" name="search" />
                            <span class="input-group-addon"><a href="javascript:form1.submit()"><span class="glyphicon glyphicon-search"></span></a></span>
                        </div>
                    </div>
                </form>
                <ul class="nav navbar-nav navbar-right">
                	<c:if test="${username==null }">
                		<li><a href="${pageContext.request.contextPath}/login">Sign in</a></li>
                    	<li><a href="${pageContext.request.contextPath}/register">Register</a></li>
                	</c:if>
                	<c:if test="${username!=null }">
                		<li><a>Welcome ${username }</a></li>
                		<li><a href="${pageContext.request.contextPath}/myCart/1">My Cart</a></li>
                		<li><a href="">My Order</a></li>
                		<li><a href="${pageContext.request.contextPath}/logout">Sign out</a></li>
                	</c:if>
               </ul>
            </div>
        </div>
    </div>
</nav>