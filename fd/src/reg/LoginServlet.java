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
		
		//�ȱȽ�У����
				//1.��ȡsession�е�У����
				HttpSession session=request.getSession();
				String s_verf=(String) session.getAttribute("verf");
				//2.�Ƚ������У������session���У�����Ƿ�һ��
				if(s_verf!=null&&s_verf.equals(code)) {
					TUser u =UserService.login(username, password);
					//3.���һ�µĻ���У���û���������	
					if(u!=null) {
						//��ȡ�Ự����
						//HttpSession session=request.getSession();
						//session.setAttribute("username", username);
						//�Ƴ�session�е�У��������	
						session.setAttribute("user", u);
						session.removeAttribute("verf");
						//��ȷ,ת�����ɹ�ҳ��
						RequestDispatcher rd=request.getRequestDispatcher("index1.jsp");
						rd.forward(request, response);
					}
					else {
						//�û������벻��
						RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
						request.setAttribute("input_name", username);
						request.setAttribute("errormsg","�û����������");
						rd.forward(request, response);
					}
				}
				else {
					//����У���벻�ԵĻ�
					RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
					request.setAttribute("input_name", username);
					request.setAttribute("errormsg","У�������");
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
		
		//�ȱȽ�У����
				//1.��ȡsession�е�У����
				HttpSession session=request.getSession();
				String s_verf=(String) session.getAttribute("verf");
				//2.�Ƚ������У������session���У�����Ƿ�һ��
				if(s_verf!=null&&s_verf.equals(code)) {
					TUser u =UserService.login(username, password);
					//3.���һ�µĻ���У���û���������	
					if(u!=null) {
						//��ȡ�Ự����
						//HttpSession session=request.getSession();
						//session.setAttribute("username", username);
						//�Ƴ�session�е�У��������	
						session.setAttribute("user", u);
						session.removeAttribute("verf");
						//��ȷ,ת�����ɹ�ҳ��
						RequestDispatcher rd=request.getRequestDispatcher("index1.jsp");
						rd.forward(request, response);
					}
					else {
						//�û������벻��
						RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
						request.setAttribute("input_name", username);
						request.setAttribute("errormsg","�û����������");
						rd.forward(request, response);
					}
				}
				else {
					//����У���벻�ԵĻ�
					RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
					request.setAttribute("input_name", username);
					request.setAttribute("errormsg","У�������");
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
