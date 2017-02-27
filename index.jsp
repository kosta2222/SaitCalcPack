<html>
<head>
<title>Calc</title>
</head>
<body>
<%@page import="com.kosta.antlr.calc.CalcCl" %>
<%! CalcCl ccl=null ;
%>
<%!
public void jspInit(){
ccl=CalcCl.getInstance();
}
%>
<%
//String s=request.getParameter("photo");
String s="sin(90) +45*3";
double d=ccl.calculate(s);
out.println(d);
%>
</body>
</html>
