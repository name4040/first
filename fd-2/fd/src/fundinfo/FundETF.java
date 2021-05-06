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

@WebServlet("/FundETF")
public class FundETF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("menu_item", "FundETF");
		// 1.��ȡ���е��û�����
		List<TUser> users = UserService.getUseretf();
		// 2.������ת������ʾ��jsp��
		// �����ݷŵ�������
		request.setAttribute("users", users);
		RequestDispatcher rd = request.getRequestDispatcher("fundetf.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
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

@WebServlet("/FundETF")
public class FundETF extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("menu_item", "FundETF");
		// 1.��ȡ���е��û�����
		List<TUser> users = UserService.getUseretf();
		// 2.������ת������ʾ��jsp��
		// �����ݷŵ�������
		request.setAttribute("users", users);
		RequestDispatcher rd = request.getRequestDispatcher("fundetf.jsp");
		rd.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
>>>>>>> ef24faa (new)
