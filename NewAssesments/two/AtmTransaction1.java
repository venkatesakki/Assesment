package com.assesment;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtmTransaction
 */
@WebServlet("/AtmTransaction1")
public class AtmTransaction1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	HashMap<String,String> hm =new HashMap<String,String>();
    public AtmTransaction1() {
        super();
        // TODO Auto-generated constructor stub
        hm.put("1234567891234567", "500000");
        hm.put("9876543219876543", "350000");
        hm.put("1236547896541236", "450000");
        
    }
    public boolean validation(String cardNo,String pin)
    {
    	
		return false;
    	
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String cardNo=request.getParameter("txtCard");
		String pin=request.getParameter("txtPin");
		String req=request.getParameter("request");
		//pw.print(pin);
		if(Pattern.matches("[0-9]{16}",cardNo))
		{
			pw.print("Valid cardNumber and pin :");
			pw.print("\ncard number :"+cardNo);
			pw.print("\nPin :"+pin);	
		}
		else
		{
			pw.print("invalid cardNumber and pin :");
		}
		if(req.equals("withdraw"))
		{
			response.sendRedirect("WithDrawServlet");
			
		}
		else if(req.equals("Balance enquary"))
		{
			response.sendRedirect("BalanceEnquaryServlet");
		}
		else if(req.equals("check book request"))
		{
			response.sendRedirect("CheckBookServlet");
		}
		else if(req.equals("mini statement"))
		{
			response.sendRedirect("MiniStatementServlet");
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
