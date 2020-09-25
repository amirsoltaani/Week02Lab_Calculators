package servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String second = request.getParameter("second");

        try {
            if (first == null || first.equals("") || second == null || second.equals("")) {
                String result = "invalid";
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
                return;
            }
            int firstNumber = Integer.parseInt(first);
            int secondNumber = Integer.parseInt(second);

            String action = request.getParameter("action");

            if ("+".equals(action)) {
                int result = firstNumber + secondNumber;
                request.setAttribute("result", result);
            } else if ("-".equals(action)) {
                int result = firstNumber - secondNumber;
                request.setAttribute("result", result);
            } else if ("*".equals(action)) {
                int result = firstNumber * secondNumber;
                request.setAttribute("result", result);
            } else if ("%".equals(action)) {
                int result = firstNumber / secondNumber;
                request.setAttribute("result", result);
            }
        } catch (RuntimeException e) {
            String result = "Invalid";
            request.setAttribute("result", result);
        }


        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}


