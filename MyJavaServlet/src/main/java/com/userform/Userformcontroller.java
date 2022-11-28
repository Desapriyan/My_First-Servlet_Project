package com.userform;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import com.userform.dto.User;
import com.userinfo.db.Databaseutil;

/**
 * Servlet implementation class Userformcontroller
 */
@WebServlet(urlPatterns="/Userformcontroller")
public class Userformcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Userformcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<User> userobj=Databaseutil.getAllUsers();
		request.setAttribute("details", userobj);
		request.getRequestDispatcher("UserList.jsp").include(request, response);
	}

	
	

}
