package mycalculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str1= request.getParameter("num1");
		String str2= request.getParameter("num2");
		String str3= request.getParameter("bt");
		
		//type convert
		int a= Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		double sum;
		
		if(str3.equals("1")) sum=a+b;
		else if (str3.equals("2")) sum=a-b;
		else if (str3.equals("3")) sum=a*b;
		else  sum=a/b;
		
		//response.getWriter().append("Served at: "+sum);
		response.sendRedirect("NewFile.jsp?sum="+sum);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
