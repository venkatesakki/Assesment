package com.assesment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BalanceEnquaryServlet
 */
@WebServlet("/BalanceEnquaryServlet")
public class BalanceEnquaryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	HashMap<String,String> hm =new HashMap<String,String>();
    public BalanceEnquaryServlet() {
        super();
        // TODO Auto-generated constructor stub
        hm.put("1234567891234567", "400000");
        hm.put("9876543219876543", "350000");
        hm.put("1236547896541236", "450000");
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		
		pw.print("<h1>balace Enquary</h1>");
		pw.print("<body><form method='post'><table>");
		pw.print("<tr><td>CardNumber:</td><td><input type ='text' name='txtCard' placeholder='enter the Card number'></td></tr>");  
		pw.print("<tr><td>Pin:</td><td><input type ='text' name='txtPin' placeholder='enter the Pin number'></td></tr>");
		//pw.print("<tr><td>Amount:</td><td><input type ='text' name='txtAmount' placeholder='enter the Amount'></td></tr>");
		pw.print("<tr><td><input type='submit' value='ok'></td></tr></table></form></body>");
		
		String cardNo=request.getParameter("txtCard");
		//String amount1=request.getParameter("txtAmount");
		
		for(Map.Entry m:hm.entrySet())
		{
		
		if(cardNo.equals(m.getKey()))
		{
			//pw.print("balance amount :"+amount1);
			//pw.print("balance amount :"+WithDrawServlet.amount);
			pw.print("balace amount :"+m.getValue());
		}
		
		}	
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
