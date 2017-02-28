<html>
<%@page import="com.kosta.antlr.svet.SvetCl" %>
<%! SvetCl ccl=null ;
%>
<%!
public void jspInit(){
ccl=SvetCl.getInstance();
}
%>
<%
String str=request.getParameter("data");
//String str=s.replace('p','+');
//String s="2+3*4-1";
double d=ccl.calculate(str);
out.println(d);
//char p=s.charAt(1);
%>
</html>