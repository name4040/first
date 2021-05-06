<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> e981072 (moven)
package reg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fundinfo.TUser;
import fundinfo.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		response.setCharacterEncoding("UTF-8");
		
		String code = request.getParameter("checkCode");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//先比较校验码
				//1.获取session中的校验码
				HttpSession session=request.getSession();
				String s_verf=(String) session.getAttribute("verf");
				//2.比较输入的校验码与session里的校验码是否一致
				if(s_verf!=null&&s_verf.equals(code)) {
					TUser u =UserService.login(username, password);
					//3.如果一致的话，校验用户名和密码	
					if(u!=null) {
						//获取会话对象
						//HttpSession session=request.getSession();
						//session.setAttribute("username", username);
						//移除session中的校验码属性	
						session.setAttribute("user", u);
						session.removeAttribute("verf");
						//正确,转发到成功页面
						RequestDispatcher rd=request.getRequestDispatcher("index1.jsp");
						rd.forward(request, response);
					}
					else {
						//用户名密码不对
						RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
						request.setAttribute("input_name", username);
						request.setAttribute("errormsg","用户名密码错误！");
						rd.forward(request, response);
					}
				}
				else {
					//输入校验码不对的话
					RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
					request.setAttribute("input_name", username);
					request.setAttribute("errormsg","校验码错误！");
					rd.forward(request, response);
				}			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
<<<<<<< HEAD
=======
=======
package reg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fundinfo.TUser;
import fundinfo.UserService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8"); 
		response.setCharacterEncoding("UTF-8");
		
		String code = request.getParameter("checkCode");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//先比较校验码
				//1.获取session中的校验码
				HttpSession session=request.getSession();
				String s_verf=(String) session.getAttribute("verf");
				//2.比较输入的校验码与session里的校验码是否一致
				if(s_verf!=null&&s_verf.equals(code)) {
					TUser u =UserService.login(username, password);
					//3.如果一致的话，校验用户名和密码	
					if(u!=null) {
						//获取会话对象
						//HttpSession session=request.getSession();
						//session.setAttribute("username", username);
						//移除session中的校验码属性	
						session.setAttribute("user", u);
						session.removeAttribute("verf");
						//正确,转发到成功页面
						RequestDispatcher rd=request.getRequestDispatcher("index1.jsp");
						rd.forward(request, response);
					}
					else {
						//用户名密码不对
						RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
						request.setAttribute("input_name", username);
						request.setAttribute("errormsg","用户名密码错误！");
						rd.forward(request, response);
					}
				}
				else {
					//输入校验码不对的话
					RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
					request.setAttribute("input_name", username);
					request.setAttribute("errormsg","校验码错误！");
					rd.forward(request, response);
				}			
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
>>>>>>> 8f677bb (moven)
>>>>>>> e981072 (moven)
