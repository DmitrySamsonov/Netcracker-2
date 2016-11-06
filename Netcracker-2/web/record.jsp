<%@ page import="DAO_Layer.Car" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div>
    hello Guys!
</div>

    <% String Action = "ButtonCreate";
        String Model = "";
        String Country = "";
        String Count = "";
        int id = 0;
        String Button = "Create";

    %>
    <% if( request.getAttribute("wherefrom") == "ButtonEdit") {
        Action = "ButtonSave";

        Car car = (Car)(request.getAttribute("car"));
        Model = car.getModel();
        Country = car.getCountry();
        Count = car.getCount();
        id = car.getId();
        Button = "Save";
    } %>

    <div class="input_div">
        <p class="title">Введите SQL-запрос:</p>
        <form class="login_form" name="newCar" action= "<%=Action%>"  method="POST">
            <p> Model <input type="text-area" name="Model" value="<%=Model%>" size="40" /> </p>
            <p> Country <input type="text-area" name="Country" value="<%=Country%>" size="40" /> </p>
            <p> Count <input type="text-area" name="Count" value="<%=Count%>" size="40" /> </p>

            <input type = "hidden" name = "id" value="<%=id%>">

            <input type="submit" value="<%=Button%>" />
        </form>
    </div>
</body>
</html>
