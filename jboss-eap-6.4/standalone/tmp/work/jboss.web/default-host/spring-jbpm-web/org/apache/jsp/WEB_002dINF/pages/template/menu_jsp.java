package org.apache.jsp.WEB_002dINF.pages.template;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.release();
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
      response.setContentType("text/html");
      response.addHeader("X-Powered-By", "JSP/2.2");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<ul style=\"list-style:none;line-height:28px;\">\n");
      out.write("\n");
      out.write("\t<li>\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${homeUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Home</a>\n");
      out.write("\t</li>\n");
      out.write("\n");
      out.write("\t<li>\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${deploymentListUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Deployment List</a>\n");
      out.write("\t\t<li>\n");
      out.write("    \t\t");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t&nbsp;&nbsp;<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${newDeployment}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">New deployment</a>\n");
      out.write("\t\t</li>\n");
      out.write("\t</li>\n");
      out.write("\t<li>\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${processDefList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Process Definitions</a>\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("\t<li>\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${processInstanceList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Process Instances</a>\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("\t<li>\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${taskList}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">My Tasks</a>\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("\t\t<li>\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logout}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write("\">Logout</a>\n");
      out.write("\t</li>\n");
      out.write("</ul>");
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

  private boolean _jspx_meth_spring_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/pages/template/menu.jsp(5,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f0.setValue("/index");
    // /WEB-INF/pages/template/menu.jsp(5,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f0.setVar("homeUrl");
    // /WEB-INF/pages/template/menu.jsp(5,4) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f0.setHtmlEscape("true");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/pages/template/menu.jsp(10,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f1.setValue("/deployment/");
    // /WEB-INF/pages/template/menu.jsp(10,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f1.setVar("deploymentListUrl");
    // /WEB-INF/pages/template/menu.jsp(10,4) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f1.setHtmlEscape("true");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/pages/template/menu.jsp(13,6) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f2.setValue("/deployment/new");
    // /WEB-INF/pages/template/menu.jsp(13,6) name = var type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f2.setVar("newDeployment");
    // /WEB-INF/pages/template/menu.jsp(13,6) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f2.setHtmlEscape("true");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f3 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f3.setParent(null);
    // /WEB-INF/pages/template/menu.jsp(18,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f3.setValue("/processdef/");
    // /WEB-INF/pages/template/menu.jsp(18,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f3.setVar("processDefList");
    // /WEB-INF/pages/template/menu.jsp(18,4) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f3.setHtmlEscape("true");
    int[] _jspx_push_body_count_spring_005furl_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f3 = _jspx_th_spring_005furl_005f3.doStartTag();
      if (_jspx_th_spring_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f4 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f4.setParent(null);
    // /WEB-INF/pages/template/menu.jsp(23,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f4.setValue("/processinstance/");
    // /WEB-INF/pages/template/menu.jsp(23,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f4.setVar("processInstanceList");
    // /WEB-INF/pages/template/menu.jsp(23,4) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f4.setHtmlEscape("true");
    int[] _jspx_push_body_count_spring_005furl_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f4 = _jspx_th_spring_005furl_005f4.doStartTag();
      if (_jspx_th_spring_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f5 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f5.setParent(null);
    // /WEB-INF/pages/template/menu.jsp(28,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f5.setValue("/task/");
    // /WEB-INF/pages/template/menu.jsp(28,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f5.setVar("taskList");
    // /WEB-INF/pages/template/menu.jsp(28,4) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f5.setHtmlEscape("true");
    int[] _jspx_push_body_count_spring_005furl_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f5 = _jspx_th_spring_005furl_005f5.doStartTag();
      if (_jspx_th_spring_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f6 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f6.setParent(null);
    // /WEB-INF/pages/template/menu.jsp(33,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f6.setValue("/j_spring_security_logout");
    // /WEB-INF/pages/template/menu.jsp(33,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f6.setVar("logout");
    // /WEB-INF/pages/template/menu.jsp(33,4) name = htmlEscape type = null reqTime = true required = false fragment = false deferredValue = false deferredMethod = false expectedTypeName = null methodSignature = null 
    _jspx_th_spring_005furl_005f6.setHtmlEscape("true");
    int[] _jspx_push_body_count_spring_005furl_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f6 = _jspx_th_spring_005furl_005f6.doStartTag();
      if (_jspx_th_spring_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f6.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fhtmlEscape_005fnobody.reuse(_jspx_th_spring_005furl_005f6);
    }
    return false;
  }
}
