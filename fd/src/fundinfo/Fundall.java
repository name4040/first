<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e981072 (moven)
package fundinfo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fundall
 */
@WebServlet("/Fundall")
public class Fundall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("menu_item", "Fundall");
		// 1.获取所有的用户数据
		List<TUser> users = UserService.getUserallfund();
		// 2.把数据转发到显示的jsp中
		// 把数据放到请求中
		request.setAttribute("users", users);
		RequestDispatcher rd = request.getRequestDispatcher("fundall.jsp");
		rd.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
<<<<<<< HEAD
=======
=======
package fundinfo;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Fundall
 */
@WebServlet("/Fundall")
public class Fundall extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("menu_item", "Fundall");
		// 1.获取所有的用户数据
		List<TUser> users = UserService.getUserallfund();
		// 2.把数据转发到显示的jsp中
		// 把数据放到请求中
		request.setAttribute("users", users);
		RequestDispatcher rd = request.getRequestDispatcher("fundall.jsp");
		rd.forward(request, response);	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
>>>>>>> 8f677bb (moven)
>>>>>>> e981072 (moven)
