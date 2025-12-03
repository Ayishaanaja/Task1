<%@page import="java.util.ArrayList"%>

<%@page import="com.example.web.bean.FlightBean"%>

<html>

	<body bgcolor="mediumseagreen">

 <%ArrayList<FlightBean> all= (ArrayList<FlightBean>)request.getAttribute("aaa");%>

<table border="4">

 <tr><th>FlightID</th><th>FlightName</th><th>SeatingCapacity</th><th>ReservationCapacity</th></tr>

 <%

 for(FlightBean fb:all)

 {

 %>

 <tr><td><%=fb.getFlightID()%></td><td><%=fb.getFlightName()%></td><td><%=fb.getSeatingCapacity()%></td><td><%=fb.getReservationCapacity()%></td></tr>

 <%}%>

 </table>

 </body>

 </html>

