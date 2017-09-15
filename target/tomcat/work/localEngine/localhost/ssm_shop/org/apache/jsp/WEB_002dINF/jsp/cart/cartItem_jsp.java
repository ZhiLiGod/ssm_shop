package org.apache.jsp.WEB_002dINF.jsp.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cartItem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

static private org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/WEB-INF/jsp/cart/../top.jsp");
    _jspx_dependants.add("/WEB-INF/jsp/cart/../foot.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\" type=\"text/css\"></link>\r\n");
      out.write("    <title>Online Shop</title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("    <!-- <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.5.1.js\"></script> -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/round.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\" type=\"text/css\"></link>\r\n");
      out.write("    \r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function () {\r\n");
      out.write("        \t\r\n");
      out.write("        \tshowTotal();\r\n");
      out.write("        \t\r\n");
      out.write("            $('#mytab a').click(function (e) {\r\n");
      out.write("                e.preventDefault();//阻止a链接的跳转行为\r\n");
      out.write("                $(this).tab('show');//显示当前选中的链接及关联的content\r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("            //set click on selectAll\r\n");
      out.write("            $(\"#selectAll\").click(function(){\r\n");
      out.write("        \t\tvar bool = $(\"#selectAll\").prop(\"checked\");\r\n");
      out.write("        \t\tsetItemCheckBox(bool);\r\n");
      out.write("        \t\tsetJieSuan(bool);\r\n");
      out.write("        \t\tshowTotal();\r\n");
      out.write("        \t});\r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            $('#imageCarousel').carousel();\r\n");
      out.write("        });\r\n");
      out.write("        //set all items\r\n");
      out.write("\t\tfunction setItemCheckBox(bool){\r\n");
      out.write("\t\t\t$(\":checkbox[name=checkboxBtn]\").prop(\"checked\", bool);\r\n");
      out.write("\t\t}\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        //measure subtotal\r\n");
      out.write("        function showTotal(){\r\n");
      out.write("\t\t\t/*\r\n");
      out.write("\t\t\t1.获取所有被勾选的条目 复选框 循环便利之\t\r\n");
      out.write("\t\t\t*/\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar total = 0;\r\n");
      out.write("\t\t\t$(\"input[name = checkboxBtn]:checked\").each(function(){\r\n");
      out.write("\t\t\t\tvar id = $(this).val();\r\n");
      out.write("\t\t\t\tvar text = $(\"#\" + id + \"subtotal\").text();\r\n");
      out.write("\t\t\t\ttotal += Number(text);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t//alert(total);\r\n");
      out.write("\t\t\t$(\"#count\").text($(\"input[name = checkboxBtn]:checked\").size());\r\n");
      out.write("\t\t\t$(\"#total\").text(round(total,2));//round（）把 total 保留2 位小数\r\n");
      out.write("\t\t\t//alert(total);\r\n");
      out.write("\t\t}\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("        function go(){\r\n");
      out.write("        \t//alert(\"哈哈\");\r\n");
      out.write("        \tvar all = $(\":checkbox[name = checkboxBtn]\").size();\r\n");
      out.write("        \tvar selected = $(\":checkbox[name = checkboxBtn]:checked\").size();\r\n");
      out.write("        \tif(all == selected){\r\n");
      out.write("        \t\t$(\"#selectAll\").prop(\"checked\",true);\r\n");
      out.write("        \t\tsetJieSuan(true);\r\n");
      out.write("        \t}else if(selected == 0){\r\n");
      out.write("        \t\t$(\"#selectAll\").prop(\"checked\",false);\r\n");
      out.write("        \t\tsetJieSuan(false);\r\n");
      out.write("        \t}else{\r\n");
      out.write("        \t\t$(\"#selectAll\").prop(\"checked\",false);\r\n");
      out.write("        \t\tsetJieSuan(true);\r\n");
      out.write("        \t}\r\n");
      out.write("        \tshowTotal();\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        function setJieSuan(bool){\r\n");
      out.write("       \t if(bool) {\r\n");
      out.write("       \t\t\t$(\"#jiesuan\").removeClass(\"btn disabled btn-block\").addClass(\"btn btn-primary btn-block\");\r\n");
      out.write("       \t\t\t//$(\"#jiesuan\").unbind(\"click\");//撤消当前元素止所有click事件\r\n");
      out.write("       \t\t} else {\r\n");
      out.write("       \t\t\t$(\"#jiesuan\").removeClass(\"btn btn-primary btn-block\").addClass(\"btn disabled btn-block\");\r\n");
      out.write("       \t\t\t//$(\"#jiesuan\").click(function() {return false;});\r\n");
      out.write("       \t\t}\t\r\n");
      out.write("       }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body data-spy=\"scroll\" data-target=\"#mainNavbar\" data-offset=\"10\">\r\n");
      out.write("<nav id=\"mainNavbar\"  class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("    <div class=\"container\" >\r\n");
      out.write("        <div class=\"col-md-12\" >\r\n");
      out.write("            <div class=\"navbar-header\" >\r\n");
      out.write("                <button class=\"navbar-toggle\" data-target=\".navbar-collapse\" data-toggle=\"collapse\">\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/index\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.jpg\" height=\"50px\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"navbar-collapse collapse\">\r\n");
      out.write("                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                    <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/index\" class=\"active\">Home</a></li>\r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Products\r\n");
      out.write("                            <span class=\"caret\"></span></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li><a href=\"#\">Games</a></li>\r\n");
      out.write("                            <li><a href=\"#\">PlayStations</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li><a href=\"#\">Contact</a></li>\r\n");
      out.write("                    <li><a href=\"#\">About</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <form id=\"form1\" name=\"form1\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/searchItem/1\" method=\"post\" class=\"navbar-form navbar-left\" role=\"search\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"search\" />\r\n");
      out.write("                            <span class=\"input-group-addon\"><a href=\"javascript:form1.submit()\"><span class=\"glyphicon glyphicon-search\"></span></a></span>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                \t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("               </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--Body-->\r\n");
      out.write("<div class=\"modal-body\">\r\n");
      out.write("    <div class=\"container\" style=\"margin-top: 50px;\">\r\n");
      out.write("        <form id=\"form1\" name=\"form1\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/preOrder\" method=\"post\">\r\n");
      out.write("        <div class=\"col-md-12 col-sm-12 col-lg-12\">\r\n");
      out.write("        \t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            ");
      if (_jspx_meth_c_005fif_005f6(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      if (_jspx_meth_c_005fif_005f7(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </form>  \r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal-footer\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"col-md-3 col-sm-6 col-xs-12 text-center\" >\r\n");
      out.write("            <ul class=\"list-unstyled\">\r\n");
      out.write("                <li><strong>Get to Know Us</strong></li>\r\n");
      out.write("                <li>Careers</li>\r\n");
      out.write("                <li>About Us</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3 col-sm-6 col-xs-12 text-center\">\r\n");
      out.write("            <ul class=\"list-unstyled\">\r\n");
      out.write("                <li><strong>Make Money with Us</strong></li>\r\n");
      out.write("                <li>Advertise Your Products</li>\r\n");
      out.write("                <li>Associates Programme</li>\r\n");
      out.write("                <li>Sell on Game Store</li>\r\n");
      out.write("                <li>Independently Publish with Us</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3 col-sm-6 col-xs-12 text-center\">\r\n");
      out.write("            <ul class=\"list-unstyled\">\r\n");
      out.write("                <li><strong>Payment Methods</strong></li>\r\n");
      out.write("                <li>Gift Cards</li>\r\n");
      out.write("                <li>Top Up Your Accounts</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3 col-sm-6 col-xs-12 text-center\">\r\n");
      out.write("            <ul class=\"list-unstyled\">\r\n");
      out.write("                <li><strong>Let Us Help You</strong></li>\r\n");
      out.write("                <li>Track Packages</li>\r\n");
      out.write("                <li>Delivery Rates</li>\r\n");
      out.write("                <li>Help</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-8 col-md-offset-2 text-center\" style=\"margin-top: 30px;\">\r\n");
      out.write("            <span><strong>Copyright © 2017 GameStore</strong></span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/jsp/cart/../top.jsp(35,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username==null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/login\">Sign in</a></li>\r\n");
        out.write("                    \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/register\">Register</a></li>\r\n");
        out.write("                \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /WEB-INF/jsp/cart/../top.jsp(39,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username!=null }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                \t\t<li><a>Welcome ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${username }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a></li>\r\n");
        out.write("                \t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/myCart/1\">My Cart</a></li>\r\n");
        out.write("                \t\t<li><a href=\"\">My Order</a></li>\r\n");
        out.write("                \t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/logout\">Sign out</a></li>\r\n");
        out.write("                \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f2.setParent(null);
    // /WEB-INF/jsp/cart/cartItem.jsp(102,9) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:length(cart.clist) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
    if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t\t<table class=\"table table-striped table-hover\">\r\n");
        out.write("            \t <thead>\r\n");
        out.write("            \t\r\n");
        out.write("                <tr>\r\n");
        out.write("                <th>\r\n");
        out.write("                <div class=\"checkbox\">\r\n");
        out.write("                \t<label><input type=\"checkbox\" id=\"selectAll\" checked=\"checked\"/> All</label>\r\n");
        out.write("                </div>\r\n");
        out.write("                </th>\r\n");
        out.write("                <th width=\"10%\">\r\n");
        out.write("\r\n");
        out.write("                </th>\r\n");
        out.write("                    <th width=\"45%\">\r\n");
        out.write("\r\n");
        out.write("                    </th>\r\n");
        out.write("                    <th width=\"20%\">\r\n");
        out.write("                        Price\r\n");
        out.write("                    </th>\r\n");
        out.write("                    <th width=\"20%\">\r\n");
        out.write("                        Quantity\r\n");
        out.write("                    </th></tr>\r\n");
        out.write("\r\n");
        out.write("                </thead>\r\n");
        out.write("                <tbody>\r\n");
        out.write("                \t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("   \r\n");
        out.write("                </tbody>\r\n");
        out.write("            </table>\r\n");
        out.write("            \r\n");
        out.write("            <!-- <div class=\"text-center\">\r\n");
        out.write("\t\t        <ul class=\"pagination\">\r\n");
        out.write("\t\t        \t");
        if (_jspx_meth_c_005fif_005f3(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t        \t");
        if (_jspx_meth_c_005fforEach_005f1(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("         \r\n");
        out.write("\t\t            ");
        if (_jspx_meth_c_005fif_005f5(_jspx_th_c_005fif_005f2, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t            \r\n");
        out.write("\t\t        </ul>\r\n");
        out.write("\t\t    </div> -->\r\n");
        out.write("            <hr />\r\n");
        out.write("        \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/cart/cartItem.jsp(127,17) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.clist }", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/cart/cartItem.jsp(127,17) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("c");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                \t\t<tr>\r\n");
          out.write("                \t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t<input onclick=\"go()\" id=\"cBtn\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.cid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" type=\"checkbox\" name=\"checkboxBtn\" checked=\"checked\"/>\r\n");
          out.write("\t\t\t\t\t\t</td>\r\n");
          out.write("                        <td>\r\n");
          out.write("                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.items.pic}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" class=\"img-responsive\">\r\n");
          out.write("                        </td>\r\n");
          out.write("                        <td>\r\n");
          out.write("                        \t<ul class=\"list-unstyled\">\r\n");
          out.write("\t\t\t\t                <li><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.items.name }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</strong></li>\r\n");
          out.write("\t\t\t\t                <li>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.items.detail}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</li>\r\n");
          out.write("\t\t\t\t                <li><font color = \"orange\">This item released on ");
          if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write(" </font></li>\r\n");
          out.write("\t\t\t\t                <li class=\"text-muted\">Eligible for FREE Ireland Delivery</li>\r\n");
          out.write("\t\t\t\t                <li><br></li>\r\n");
          out.write("\t\t\t\t                <li><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/deleteCartItem/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\">Delete</a></li>\r\n");
          out.write("\t\t\t\t            </ul>\r\n");
          out.write("                        </td>\r\n");
          out.write("                        <td>\r\n");
          out.write("                            <font color=\"red\"><span><b>€</b></span><span id=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.cid }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("subtotal\"><strong>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.total }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</strong></span></font>\r\n");
          out.write("                        </td>\r\n");
          out.write("                        <td>\r\n");
          out.write("                            &nbsp;&nbsp;&nbsp;\r\n");
          out.write("                            &nbsp;\r\n");
          out.write("                            <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</span>\r\n");
          out.write("                        </td>\r\n");
          out.write("                    \t</tr> \r\n");
          out.write("                \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/jsp/cart/cartItem.jsp(139,69) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${c.items.createtime }", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/cart/cartItem.jsp(139,69) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("dd MMM. yyyy");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/cart/cartItem.jsp(160,11) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!cart.page.isFirstPage }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
    if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t        \t\t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/myCart/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.page.pageNum-1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">Previous</a></li>\r\n");
        out.write("\t\t        \t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/cart/cartItem.jsp(163,11) name = begin type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setBegin(1);
    // /WEB-INF/jsp/cart/cartItem.jsp(163,11) name = end type = int reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.page.pages }", java.lang.Integer.class, (PageContext)_jspx_page_context, null, false)).intValue());
    // /WEB-INF/jsp/cart/cartItem.jsp(163,11) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f1.setVar("i");
    int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
      if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t        \t\t<li ");
          if (_jspx_meth_c_005fif_005f4(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
            return true;
          out.write("><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("/myCart/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${i }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a></li>\r\n");
          out.write("\t\t        \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fend_005fbegin.reuse(_jspx_th_c_005fforEach_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /WEB-INF/jsp/cart/cartItem.jsp(164,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.page.pageNum == i}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
    if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("class=\"active\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
    // /WEB-INF/jsp/cart/cartItem.jsp(166,14) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!cart.page.isLastPage }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
    if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t            \t<li><a href=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("/myCart/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cart.page.pageNum+1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">Next</a></li>\r\n");
        out.write("\t\t            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f6.setParent(null);
    // /WEB-INF/jsp/cart/cartItem.jsp(174,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(cart.clist) == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
    if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("            <div class=\"col-md-8\" style=\"height: 380px;\">\r\n");
        out.write("            \t<h1 class=\"page-header\">Your Shopping Basket is empty.</h1>\r\n");
        out.write("            \t<p>\r\n");
        out.write("            \t\tYour Shopping Basket lives to serve. Give it purpose--fill it with books, CDs, videos, DVDs, toys, electronics, and more.<br/>\r\n");
        out.write("\t\t\t\t\tContinue shopping on the GameStore homepage, learn about today's deals, or visit your Wish List.<br/>\r\n");
        out.write("\t\t\t\t\t<br/><small>The price and availability of items at Amazon.co.uk are subject to change. The shopping basket is a temporary place to store a list of your items and reflects each item's most recent price.\r\n");
        out.write("\t\t\t\t\t<br/>Do you have a gift card or promotional code? We'll ask you to enter your claim code when it's time to pay.</small>\r\n");
        out.write("            \t</p>\r\n");
        out.write("            </div>\r\n");
        out.write("            \t\r\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent(null);
    // /WEB-INF/jsp/cart/cartItem.jsp(187,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ fn:length(cart.clist) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("        \t<div class=\"pull-right col-md-4\" >\r\n");
        out.write("\t            <div class=\"thumbnail\" >\r\n");
        out.write("\t            <h3 class=\"page-header\">Subtotal (<span id=\"count\"></span>  items): €<span id=\"total\"></span></h3>\r\n");
        out.write("                <input id=\"jiesuan\" type=\"submit\" class=\"btn btn-primary btn-block\" value=\"Proceed to Checkout\"><!-- btn btn-primary btn-block -->\r\n");
        out.write("\t            <br/>\r\n");
        out.write("\t            <!--<div>\r\n");
        out.write("\t            \t<div class=\"col-md-12\">\r\n");
        out.write("                        \r\n");
        out.write("                    </div>\r\n");
        out.write("\t            </div>\r\n");
        out.write("\t                 <form action=\"\" method=\"\" class=\"form-horizontal\"> \r\n");
        out.write("\t                    <div class=\"form-group\">-->\r\n");
        out.write("\t                        \r\n");
        out.write("\t                   <!-- </div>\r\n");
        out.write("\t                 </form> -->\r\n");
        out.write("\t            </div>\r\n");
        out.write("        \t</div>\r\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }
}
