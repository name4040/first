<<<<<<< HEAD
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
 * Servlet implementation class FundQuery
 */
@WebServlet("/FundQuery")
public class FundQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String key=request.getParameter("key");
		
		//1.获取所有用户的数据
		List<TUser>users =UserService.queryFund(key);
		//2.把数据转发到显示的jsp中
		//把数据放到请求中
		request.setAttribute("users", users);
		RequestDispatcher rd=request.getRequestDispatcher("fundall.jsp");
			
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
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
 * Servlet implementation class FundQuery
 */
@WebServlet("/FundQuery")
public class FundQuery extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String key=request.getParameter("key");
		
		//1.获取所有用户的数据
		List<TUser>users =UserService.queryFund(key);
		//2.把数据转发到显示的jsp中
		//把数据放到请求中
		request.setAttribute("users", users);
		RequestDispatcher rd=request.getRequestDispatcher("fundall.jsp");
			
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
>>>>>>> ef24faa (new)
