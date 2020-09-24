package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String age = request.getParameter("age");

        request.setAttribute("age", age);

        try {

            if (age == null || age.equals("")) {
                request.setAttribute("message", "You must give your current age");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }

            int ageInt = Integer.parseInt(age);


            if (ageInt <= 0) {
                request.setAttribute("message", "You must give your current age");
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }

            ageInt = ++ageInt;
            
            request.setAttribute("result", "Your age next birthday will be " + ageInt);

        } catch (RuntimeException e) {
            request.setAttribute("message2", "You must enter a number");
        }

        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

}
