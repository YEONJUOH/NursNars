package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by OHBABY on 2016-10-15.
 */
@WebServlet(urlPatterns = "/hello")
public class ServletTest extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher view = this.getServletContext().getRequestDispatcher("/view/Hello.jsp");
        view.forward(request,response);
    }
}
