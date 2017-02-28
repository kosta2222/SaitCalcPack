<html>
<head>
<title>Calc</title>
</head>
<body>
<%@page import="com.kosta.antlr.CalcCl" %>
<%! CalcCl ccl=null ;
%>
<%!
public void jspInit(){
ccl=CalcCl.getInstance();
}
%>
<%
String s=request.getParameter("data");
String str=s.replace('p','+');
//String s="2+3*4-1";
double d=ccl.calculate(str);
out.println(d);
char p=s.charAt(1);
%>

