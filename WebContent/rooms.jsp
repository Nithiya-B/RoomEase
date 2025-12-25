<%@ page import="java.sql.ResultSet" %>
<%
    ResultSet rs = (ResultSet) request.getAttribute("rooms");
%>
<table border="1">
<tr>
<th>ID</th><th>Room</th><th>Type</th><th>Rent</th><th>Status</th>
</tr>
<% while(rs.next()) { %>
<tr>
<td><%=rs.getInt("id")%></td>
<td><%=rs.getString("room_no")%></td>
<td><%=rs.getString("type")%></td>
<td><%=rs.getDouble("rent")%></td>
<td><%=rs.getString("status")%></td>
</tr>
<% } %>
</table>
