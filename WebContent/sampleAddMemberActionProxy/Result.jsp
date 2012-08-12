<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleAddMemberActionProxyid" scope="session" class="com.carpool.action.AddMemberActionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleAddMemberActionProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleAddMemberActionProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleAddMemberActionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.carpool.action.AddMemberAction getAddMemberAction10mtemp = sampleAddMemberActionProxyid.getAddMemberAction();
if(getAddMemberAction10mtemp == null){
%>
<%=getAddMemberAction10mtemp %>
<%
}else{
        if(getAddMemberAction10mtemp!= null){
        String tempreturnp11 = getAddMemberAction10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String firstName_1id=  request.getParameter("firstName16");
            java.lang.String firstName_1idTemp = null;
        if(!firstName_1id.equals("")){
         firstName_1idTemp  = firstName_1id;
        }
        String lastName_2id=  request.getParameter("lastName18");
            java.lang.String lastName_2idTemp = null;
        if(!lastName_2id.equals("")){
         lastName_2idTemp  = lastName_2id;
        }
        String phoneNumber_3id=  request.getParameter("phoneNumber20");
            java.lang.String phoneNumber_3idTemp = null;
        if(!phoneNumber_3id.equals("")){
         phoneNumber_3idTemp  = phoneNumber_3id;
        }
        sampleAddMemberActionProxyid.add(firstName_1idTemp,lastName_2idTemp,phoneNumber_3idTemp);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>