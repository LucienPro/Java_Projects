

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<HEAD><TITLE>SimpleServlet");
        out.println("</TITLE></HEAD><BODY>");
        out.println("<H1>Une servlet simple</H1>");
        out.println("<P>C'est la sortie de la servlet</P>");
        out.println("<H1> Resquest method: " + request.getMethod() + "</H1>");
        out.println("<H1> Resquest URI: " + request.getRequestURI() + "</H1>");
        out.println("<H1> Resquest Protocol: " + request.getProtocol() + "</H1>");
        out.println("<H1> Adresse IP client: " + request.getRemoteAddr() + "</H1>");
        out.println("<H1> Nom client: " + request.getRemoteHost() + "</H1>");
        out.println("</BODY>");
        
        

        out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
