<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSelectMemberClubActionProxyid" scope="session" class="com.carpool.action.SelectMemberClubActionProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSelectMemberClubActionProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleSelectMemberClubActionProxyid.getEndpoint();
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
        sampleSelectMemberClubActionProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.carpool.action.SelectMemberClubAction getSelectMemberClubAction10mtemp = sampleSelectMemberClubActionProxyid.getSelectMemberClubAction();
if(getSelectMemberClubAction10mtemp == null){
%>
<%=getSelectMemberClubAction10mtemp %>
<%
}else{
        if(getSelectMemberClubAction10mtemp!= null){
        String tempreturnp11 = getSelectMemberClubAction10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String memberPhoneNumber_1id=  request.getParameter("memberPhoneNumber16");
            java.lang.String memberPhoneNumber_1idTemp = null;
        if(!memberPhoneNumber_1id.equals("")){
         memberPhoneNumber_1idTemp  = memberPhoneNumber_1id;
        }
        java.lang.String getClubName13mtemp = sampleSelectMemberClubActionProxyid.getClubName(memberPhoneNumber_1idTemp);
if(getClubName13mtemp == null){
%>
<%=getClubName13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getClubName13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
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