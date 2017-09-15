package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1, user-scalable=no\">\r\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("    <title>Register</title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-2.2.4.min.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\">\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction checkUsername(){\r\n");
      out.write("\t\t//alert(\"哈哈哈哈\");\r\n");
      out.write("\t\t// 获得文件框值:\r\n");
      out.write("\t\tvar username = document.getElementById(\"username\").value;\r\n");
      out.write("\t\t// 1.创建异步交互对象\r\n");
      out.write("\t\tvar xhr = createXmlHttp();\r\n");
      out.write("\t\t// 2.设置监听\r\n");
      out.write("\t\txhr.onreadystatechange = function(){\r\n");
      out.write("\t\t\tif(xhr.readyState == 4){\r\n");
      out.write("\t\t\t\tif(xhr.status == 200){\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"span1\").innerHTML = xhr.responseText;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t};\r\n");
      out.write("\t\t// 3.打开连接 time=\"+new Date().getTime()+\"&\r\n");
      out.write("\t\txhr.open(\"GET\",\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/findUserByName.action?time=\"+new Date().getTime()+\"&username=\"+username,true);\r\n");
      out.write("\t\t// 4.发送\r\n");
      out.write("\t\txhr.send(null);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction createXmlHttp(){\r\n");
      out.write("\t\t   var xmlHttp;\r\n");
      out.write("\t\t   try{ // Firefox, Opera 8.0+, Safari\r\n");
      out.write("\t\t        xmlHttp=new XMLHttpRequest();\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    catch (e){\r\n");
      out.write("\t\t\t   try{// Internet Explorer\r\n");
      out.write("\t\t\t         xmlHttp=new ActiveXObject(\"Msxml2.XMLHTTP\");\r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t\t    catch (e){\r\n");
      out.write("\t\t\t      try{\r\n");
      out.write("\t\t\t         xmlHttp=new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t\t      catch (e){}\r\n");
      out.write("\t\t\t      }\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\r\n");
      out.write("\t\t\treturn xmlHttp;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"col-md-12 text-center\" >\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/index\"><img src=\"img/logo1.jpg\"></a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"modal-body\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"thumbnail col-md-6 col-md-offset-3\" >\r\n");
      out.write("            <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/registerUser.action\" method=\"post\" class=\"form-horizontal\">\r\n");
      out.write("                <h2 class=\"page-header\">&nbsp;<strong>Register</strong></h2>\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t<font size=\"2px\" color=\"red\"><center><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("</b></center></font>\r\n");
      out.write("                <div class=\"form-group\" >\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\" >\r\n");
      out.write("                        <label class=\"control-label\">Your name</label>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Enter username\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <label class=\"control-label\">Password</label>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Enter password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <label class=\"control-label\">Confirm password</label>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"password\" name=\"repassword\" class=\"form-control\" placeholder=\"Confirm password\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <label class=\"control-label\">Birthday</label>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"date\" name=\"birthday\" class=\"form-control\" placeholder=\"\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <label class=\"control-label col-md-1\" >Sex</label>\r\n");
      out.write("                        <div class=\"col-md-6\" >\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"sex\" value=\"1\" >Male</label>\r\n");
      out.write("                            <label class=\"radio-inline\"><input type=\"radio\" name=\"sex\" value=\"2\" >Female</label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <label class=\"control-label\">Address</label>\r\n");
      out.write("                        <div>\r\n");
      out.write("                            <input type=\"text\" name=\"address\" class=\"form-control\" placeholder=\"Enter address\">\r\n");
      out.write("                            <br/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <input type=\"submit\" value=\"Create your account\" class=\"btn btn-primary btn-block\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                    <div class=\"col-md-10 col-md-offset-1\">\r\n");
      out.write("                        <span class=\"text-muted\">Already have an account? <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("/login\">Sign in</a>  </span><br><br>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
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
      out.write("</div>\r\n");
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
    // /WEB-INF/jsp/register.jsp(69,16) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allErrors!=null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\r\n");
        out.write("\t\t\t\t");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /WEB-INF/jsp/register.jsp(70,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/jsp/register.jsp(70,4) '${allErrors}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${allErrors}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/jsp/register.jsp(70,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("error");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t<font size=\"2px\" color=\"red\"><center><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${error.defaultMessage}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</b></center></font> <br/>\r\n");
          out.write("\t\t\t\t");
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
}
