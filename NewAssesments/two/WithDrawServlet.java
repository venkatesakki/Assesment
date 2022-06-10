package com.assesment;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Stack;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithDrawServlet
 */
@WebServlet("/WithDrawServlet")
public class WithDrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static long amount=50000;
    /**
     * @see HttpServlet#HttpServlet()
     */
	HashMap<String,String> hm =new HashMap<String,String>();
    public WithDrawServlet() {
        super();
        // TODO Auto-generated constructor stub
        hm.put("1234567891234567", "500000");
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
		
		
		pw.print("<h1>Withdraw</h1>");
		pw.print("<body><form method='post'><table>");
		pw.print("<tr><td>amount:</td><td><input type ='text' name='name' placeholder='enter the withdraw amount'></td></tr>");      
		pw.print("<tr><td><input type='submit' value='ok'></td></tr></table></form></body>");
		
		//long current;
		long with =Integer.parseInt(request.getParameter("name"));
		Stack s= new Stack();
		//pw.print(with);
		if(with<amount)
		{
			amount=amount-with;
			pw.print(amount);
		}
		else
		{
			pw.print("insufficiant balance :");
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
