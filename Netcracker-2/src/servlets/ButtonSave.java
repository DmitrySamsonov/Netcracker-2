package servlets;

import BL_Layer.BLClass;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ButtonSave extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String model= request.getParameter("Model");
        String country= request.getParameter("Country");
        String count= request.getParameter("Count");
        String id = request.getParameter("id");

        BLClass.EditElement(id, model, country, count);


        RequestDispatcher rd = request.getRequestDispatcher("ListServlet");
        rd.forward(request,response);
    }

}
