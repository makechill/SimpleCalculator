package Calculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Multiplication extends HttpServlet {
	
	String num1;
	String num2;
	int result;
	
	public void init() throws ServletException{

	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		res.setContentType("text/html");
		
		
		PrintWriter pw = res.getWriter();

		num1 = req.getParameter("num1");
		num2 = req.getParameter("num2");
		result = Integer.parseInt(num1)*Integer.parseInt(num2);
		

		pw.print("<h3> Multiplication of " +num1+ " and " +num2+ " is " +result);
	}
	
	public void destroy(){
		
	}

}
