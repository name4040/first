<<<<<<< HEAD
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
	// 获取数据库连接
	public static Connection getConnect() {
		// 1注册驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2建立连接
			String url = "JDBC:mysql://localhost:3306/fund?useUnicode=true&characterEncoding=UTF-8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接错误！");
			e.printStackTrace();
		}
		return null;
	}

	// 用户注册
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

	// 用户登录
	public static TUser login(String username, String password) {
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();

		String sql1 = "select * from f_user where username=? and password=?";
		List<TUser> users;
		try {
			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class), username, password);
			DbUtils.closeQuietly(conn);
			if (users.size() > 0){
				return users.get(0);}
			else{
				return null;}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 获取all数据
	public static List<TUser> getUserallfund() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from allfund";
		List<TUser> user = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// 获取kf数据
	public static List<TUser> getUserkf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from kf";
		List<TUser> user = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// 获取etf数据
	public static List<TUser> getUseretf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from etf";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 获取fb数据
	public static List<TUser> getUserfb() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fb";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 获取fof数据
	public static List<TUser> getUserfof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fof";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 获取lof数据
	public static List<TUser> getUserlof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from lof";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 根据id获取用户
	public static TUser getUserById(int id) {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql1 = "select * from allfund where id=?";
		List<TUser> users;
		try {
			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class), id);
			if (users.size() > 0){
				return users.get(0);}
			else{
				return null;}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


//模糊查询用户数据
	public static List<TUser> queryFund(String key) {
		//获取数据连接
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();
		key = "%" + key + "%";

		String sql = "select * from allfund where fdcd like ?or fdnm like ?";
		List<TUser> user = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放到List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class), key, key);
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
=======
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
	// 获取数据库连接
	public static Connection getConnect() {
		// 1注册驱动
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2建立连接
			String url = "JDBC:mysql://localhost:3306/fund?useUnicode=true&characterEncoding=UTF-8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("数据库连接错误！");
			e.printStackTrace();
		}
		return null;
	}

	// 用户注册
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

	// 用户登录
	public static TUser login(String username, String password) {
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();

		String sql1 = "select * from f_user where username=? and password=?";
		List<TUser> users;
		try {
			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class), username, password);
			DbUtils.closeQuietly(conn);
			if (users.size() > 0){
				return users.get(0);}
			else{
				return null;}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	// 获取all数据
	public static List<TUser> getUserallfund() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from allfund";
		List<TUser> user = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// 获取kf数据
	public static List<TUser> getUserkf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from kf";
		List<TUser> user = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// 获取etf数据
	public static List<TUser> getUseretf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from etf";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 获取fb数据
	public static List<TUser> getUserfb() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fb";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 获取fof数据
	public static List<TUser> getUserfof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fof";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 获取lof数据
	public static List<TUser> getUserlof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql = "select * from lof";
		List<TUser> users = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放入List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// 根据id获取用户
	public static TUser getUserById(int id) {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtils核心类
		QueryRunner runner = new QueryRunner();
		String sql1 = "select * from allfund where id=?";
		List<TUser> users;
		try {
			users = runner.query(conn, sql1, new BeanListHandler<TUser>(TUser.class), id);
			if (users.size() > 0){
				return users.get(0);}
			else{
				return null;}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


//模糊查询用户数据
	public static List<TUser> queryFund(String key) {
		//获取数据连接
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();
		key = "%" + key + "%";

		String sql = "select * from allfund where fdcd like ?or fdnm like ?";
		List<TUser> user = new ArrayList<>();
		try {
			// 查询所有的用户数据，结果放到List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class), key, key);
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
>>>>>>> ef24faa (new)
