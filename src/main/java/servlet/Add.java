package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import promotion.Promotion;

import java.io.IOException;

import fuel.Fuel;

/**
 * Servlet implementation class Add
 */
public class Add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		String no1 = request.getParameter("no1");
		int no2 = Integer.parseInt(request.getParameter("no2"));
		int no3 = Integer.parseInt(request.getParameter("no3"));
		
		
		Fuel f = new Fuel();
		f.updateFilledIn(no1, no2, no3);
		
//		Fuel f = new Fuel();//
//		f.adder();
		//.
		
		request.setAttribute("sum", no1);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Results.jsp");
		
		dispatcher.forward(request, response);
		
		
		
		
		
		

	}

}
