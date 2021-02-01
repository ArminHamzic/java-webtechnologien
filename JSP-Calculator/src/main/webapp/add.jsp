<%--
  Created by IntelliJ IDEA.
  User: armin
  Date: 30.01.21
  Time: 19:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String str = request.getParameter("r1");
    int num1;
    int num2;
    int tot=0;

    num1 = Integer.parseInt(request.getParameter("num1"));
    num2 = Integer.parseInt(request.getParameter("num2"));

    if ("add".equals(str))
    {
        tot = num1 + num2;
    }
    else  if ("min".equals(str))
    {
        tot = num1 - num2;
    }
    else  if ("sub".equals(str))
    {
        tot = num1 * num2;
    }
    else  if ("div".equals(str))
    {
        tot = num1 / num2;
    }
    Integer result = new  Integer(tot);
    out.println(result.toString());
%>

