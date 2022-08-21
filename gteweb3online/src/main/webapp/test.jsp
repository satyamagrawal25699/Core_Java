Scriplet tags

Scriplet 
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%

	Date d=new Date();
	out.print(d);
	
	SayHello();
	
	out.println(name);
	
	String uname=request.getParameter("name");
	session.setAttribute("myname", uname);
	

%>

Declaration data goes outside service method we can use implicit object here
<%!
	String name="HarisInfo";

	public void SayHello(){
		System.out.println("Hello Method called ");
	}


%>

Expression

<%="Hello world" %>

<h1>
<%= session.getAttribute("myname") %>
</h1>
