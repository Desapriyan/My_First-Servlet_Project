package com.userform;
import java.io.IOException;

import com.userform.dto.User;
import com.userinfo.db.Databaseutil;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Listcontrollr
 * @param <User>
 */
@WebServlet(urlPatterns="/Listcontrollr")

public class Listcontrollr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listcontrollr() {
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
		// TODO Auto-generated method stub
	String Username=request.getParameter("userName");
	String Fathername=request.getParameter("fathername");


	String  Phone=request.getParameter("phone");
	String email=request.getParameter("email");
	String City=request.getParameter("city");
	String State=request.getParameter("state");
	String pincode=request.getParameter("pincode");


	
	
	User myuser=new User();
	
	myuser.setUsername(Username);
	myuser.setFathername(Fathername);
	myuser.setPhone(Phone);
	myuser.setEmail(email);
	myuser.setCity(City);
	myuser.setState(State);
	myuser.setPincode(pincode);
	Databaseutil.save(myuser);
	
    response.sendRedirect("Userformcontroller");

	
	
	}

}
