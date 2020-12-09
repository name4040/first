package fundinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class UserService {
	// ��ȡ���ݿ�����
	public static Connection getConnect() {
		// 1ע������
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2��������
			String url = "JDBC:mysql://localhost:3306/fund?useUnicode=true&characterEncoding=UTF-8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("���ݿ����Ӵ���");
			e.printStackTrace();
		}
		return null;
	}

	// �û�ע��
	public void addUser(TUser user) {
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();
		String sql1 = "insert into f_user(username,password)value(?,?)";
		try {
			PreparedStatement pst = conn.prepareStatement(sql1);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			pst.executeUpdate();
			DbUtils.closeQuietly(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �û���¼
	public static TUser login(String username, String password) {
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();

		String sql1 = "select * from f_user where username=? and password=?";
		List<TUser> users;
		try {
			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class), username, password);
			DbUtils.closeQuietly(conn);
			if (users.size() > 0)
				return users.get(0);
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// ��ȡall����
	public static List<TUser> getUserallfund() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils������
		QueryRunner runner = new QueryRunner();
		String sql = "select * from allfund";
		List<TUser> user = new ArrayList<>();
		try {
			// ��ѯ���е��û����ݣ��������List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// ��ȡkf����
	public static List<TUser> getUserkf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils������
		QueryRunner runner = new QueryRunner();
		String sql = "select * from kf";
		List<TUser> user = new ArrayList<>();
		try {
			// ��ѯ���е��û����ݣ��������List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// ��ȡetf����
	public static List<TUser> getUseretf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils������
		QueryRunner runner = new QueryRunner();
		String sql = "select * from etf";
		List<TUser> users = new ArrayList<>();
		try {
			// ��ѯ���е��û����ݣ��������List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// ��ȡfb����
	public static List<TUser> getUserfb() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils������
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fb";
		List<TUser> users = new ArrayList<>();
		try {
			// ��ѯ���е��û����ݣ��������List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// ��ȡfof����
	public static List<TUser> getUserfof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils������
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fof";
		List<TUser> users = new ArrayList<>();
		try {
			// ��ѯ���е��û����ݣ��������List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// ��ȡlof����
	public static List<TUser> getUserlof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils������
		QueryRunner runner = new QueryRunner();
		String sql = "select * from lof";
		List<TUser> users = new ArrayList<>();
		try {
			// ��ѯ���е��û����ݣ��������List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// ����id��ȡ�û�
	public static TUser getUserById(int id) {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils������
		QueryRunner runner = new QueryRunner();
		String sql1 = "select * from allfund where id=?";
		List<TUser> users;
		try {
			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class), id);
			if (users.size() > 0)
				return users.get(0);
			else
				return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


//ģ����ѯ�û�����
	public static List<TUser> queryFund(String key) {
		//��ȡ��������
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();
		key = "%" + key + "%";

		String sql = "select * from allfund where fdcd like ?or fdnm like ?";
		List<TUser> user = new ArrayList<>();
		try {
			// ��ѯ���е��û����ݣ�����ŵ�List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class), key, key);
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
