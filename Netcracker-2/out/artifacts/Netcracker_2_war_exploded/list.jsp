<%@ page import="java.util.ArrayList" %>
<%@ page import="DAO_Layer.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <% ArrayList<Car> carList = (ArrayList<Car>)(request.getAttribute("carList")); %>


    <table>
        <tr>
            <th>Model</th>
            <th>Country</th>
            <th>Count</th>
        </tr>

      <%for (Car car: carList )
        {%>
        <tr>
            <td>   <%= car.getModel()  %> </td>
            <td>   <%= car.getCountry()  %> </td>
            <td>   <%= car.getCount()  %> </td>

            <td>
                <form class="login_form" name="Edit" action="ButtonEdit" method="POST">
                    <input type = "hidden" name = "id" value="<%=car.getId()%>">
                    <input type="submit" value="Edit" />
                </form>
            </td>
            <td>
                <form class="login_form" name="Delete" action="ButtonDelete" method="POST">
                    <input type = "hidden" name = "id" value="<%=car.getId()%>">
                    <input type="submit" value="Delete" />
                </form>
            </td>
        </tr>
      <%}%>
    </table>


    <form class="login_form" name="Add" action="ButtonAdd" method="GET">
        <input type="submit" value="Add" />
    </form>



</body>
</html>
