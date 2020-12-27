package Calculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Division extends HttpServlet {
	
	String num1;
	String num2;
	Double result;
	
	public void init() throws ServletException{

	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		res.setContentType("text/html");
		
		
		PrintWriter pw = res.getWriter();

		num1 = req.getParameter("num1");
		num2 = req.getParameter("num2");
		try{
			result = Double.parseDouble(num1)/Double.parseDouble(num2);
			pw.print("<h4> Division of " +num1+ " and " +num2+ " is " +result+ "</h4>");
		}
		catch(Exception e){
			pw.println("<h4> Exception occured - Divided by Zero </h4>");
		}
		
	}
	
	public void destroy(){
		
	}

}
