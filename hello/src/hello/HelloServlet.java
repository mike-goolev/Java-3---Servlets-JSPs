package hello;

import java.io.*;                   // for IOException and PrintWriter
import java.util.Date;
import javax.servlet.*;             // for ServletException
import javax.servlet.http.*;        // for HttpServlet, HttpServletRequest, and HttpServletResponse

public class HelloServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // first, we have to tell the browser what kind of information is coming
        response.setContentType("text/html");

        // Then we can get a text stream to the browser and start sending stuff
        PrintWriter pw = response.getWriter();
        pw.println("<!DOCTYPE html>");
        pw.println("<html>");
        pw.println("<body>");
        pw.println("<h1>");

        Date now = new Date();
        pw.println(now);
        pw.println("\nWhy this text is not displayed on the new line?");

        pw.println("</h1>");
        pw.println("</body>");
        pw.println("</html>");

        // reaching the end of doGet() completes the response
    }
}
