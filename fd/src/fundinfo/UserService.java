<<<<<<< HEAD
=======
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
	// »ñÈ¡Êı¾İ¿âÁ¬½Ó
	public static Connection getConnect() {
		// 1×¢²áÇı¶¯
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2½¨Á¢Á¬½Ó
			String url = "JDBC:mysql://localhost:3306/fund?useUnicode=true&characterEncoding=UTF-8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Êı¾İ¿âÁ¬½Ó´íÎó£¡");
			e.printStackTrace();
		}
		return null;
	}

	// ÓÃ»§×¢²á
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

	// ÓÃ»§µÇÂ¼
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

	// »ñÈ¡allÊı¾İ
	public static List<TUser> getUserallfund() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsºËĞÄÀà
		QueryRunner runner = new QueryRunner();
		String sql = "select * from allfund";
		List<TUser> user = new ArrayList<>();
		try {
			// ²éÑ¯ËùÓĞµÄÓÃ»§Êı¾İ£¬½á¹û·ÅÈëList<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// »ñÈ¡kfÊı¾İ
	public static List<TUser> getUserkf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsºËĞÄÀà
		QueryRunner runner = new QueryRunner();
		String sql = "select * from kf";
		List<TUser> user = new ArrayList<>();
		try {
			// ²éÑ¯ËùÓĞµÄÓÃ»§Êı¾İ£¬½á¹û·ÅÈëList<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// »ñÈ¡etfÊı¾İ
	public static List<TUser> getUseretf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsºËĞÄÀà
		QueryRunner runner = new QueryRunner();
		String sql = "select * from etf";
		List<TUser> users = new ArrayList<>();
		try {
			// ²éÑ¯ËùÓĞµÄÓÃ»§Êı¾İ£¬½á¹û·ÅÈëList<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// »ñÈ¡fbÊı¾İ
	public static List<TUser> getUserfb() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsºËĞÄÀà
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fb";
		List<TUser> users = new ArrayList<>();
		try {
			// ²éÑ¯ËùÓĞµÄÓÃ»§Êı¾İ£¬½á¹û·ÅÈëList<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// »ñÈ¡fofÊı¾İ
	public static List<TUser> getUserfof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsºËĞÄÀà
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fof";
		List<TUser> users = new ArrayList<>();
		try {
			// ²éÑ¯ËùÓĞµÄÓÃ»§Êı¾İ£¬½á¹û·ÅÈëList<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// »ñÈ¡lofÊı¾İ
	public static List<TUser> getUserlof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsºËĞÄÀà
		QueryRunner runner = new QueryRunner();
		String sql = "select * from lof";
		List<TUser> users = new ArrayList<>();
		try {
			// ²éÑ¯ËùÓĞµÄÓÃ»§Êı¾İ£¬½á¹û·ÅÈëList<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// ¸ù¾İid»ñÈ¡ÓÃ»§
	public static TUser getUserById(int id) {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsºËĞÄÀà
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


//Ä£ºı²éÑ¯ÓÃ»§Êı¾İ
	public static List<TUser> queryFund(String key) {
		//»ñÈ¡Êı¾İÁ¬½Ó
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();
		key = "%" + key + "%";

		String sql = "select * from allfund where fdcd like ?or fdnm like ?";
		List<TUser> user = new ArrayList<>();
		try {
			// ²éÑ¯ËùÓĞµÄÓÃ»§Êı¾İ£¬½á¹û·Åµ½List<TUser>
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
>>>>>>> e981072 (moven)
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
	// è·å–æ•°æ®åº“è¿æ¥
	public static Connection getConnect() {
		// 1æ³¨å†Œé©±åŠ¨
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 2å»ºç«‹è¿æ¥
			String url = "JDBC:mysql://localhost:3306/fund?useUnicode=true&characterEncoding=UTF-8";
			Connection conn = DriverManager.getConnection(url, "root", "root");
			return conn;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("æ•°æ®åº“è¿æ¥é”™è¯¯ï¼");
			e.printStackTrace();
		}
		return null;
	}

	// ç”¨æˆ·æ³¨å†Œ
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

	// ç”¨æˆ·ç™»å½•
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

	// è·å–allæ•°æ®
	public static List<TUser> getUserallfund() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsæ ¸å¿ƒç±»
		QueryRunner runner = new QueryRunner();
		String sql = "select * from allfund";
		List<TUser> user = new ArrayList<>();
		try {
			// æŸ¥è¯¢æ‰€æœ‰çš„ç”¨æˆ·æ•°æ®ï¼Œç»“æœæ”¾å…¥List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// è·å–kfæ•°æ®
	public static List<TUser> getUserkf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsæ ¸å¿ƒç±»
		QueryRunner runner = new QueryRunner();
		String sql = "select * from kf";
		List<TUser> user = new ArrayList<>();
		try {
			// æŸ¥è¯¢æ‰€æœ‰çš„ç”¨æˆ·æ•°æ®ï¼Œç»“æœæ”¾å…¥List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	// è·å–etfæ•°æ®
	public static List<TUser> getUseretf() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsæ ¸å¿ƒç±»
		QueryRunner runner = new QueryRunner();
		String sql = "select * from etf";
		List<TUser> users = new ArrayList<>();
		try {
			// æŸ¥è¯¢æ‰€æœ‰çš„ç”¨æˆ·æ•°æ®ï¼Œç»“æœæ”¾å…¥List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// è·å–fbæ•°æ®
	public static List<TUser> getUserfb() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsæ ¸å¿ƒç±»
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fb";
		List<TUser> users = new ArrayList<>();
		try {
			// æŸ¥è¯¢æ‰€æœ‰çš„ç”¨æˆ·æ•°æ®ï¼Œç»“æœæ”¾å…¥List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// è·å–fofæ•°æ®
	public static List<TUser> getUserfof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsæ ¸å¿ƒç±»
		QueryRunner runner = new QueryRunner();
		String sql = "select * from fof";
		List<TUser> users = new ArrayList<>();
		try {
			// æŸ¥è¯¢æ‰€æœ‰çš„ç”¨æˆ·æ•°æ®ï¼Œç»“æœæ”¾å…¥List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// è·å–lofæ•°æ®
	public static List<TUser> getUserlof() {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsæ ¸å¿ƒç±»
		QueryRunner runner = new QueryRunner();
		String sql = "select * from lof";
		List<TUser> users = new ArrayList<>();
		try {
			// æŸ¥è¯¢æ‰€æœ‰çš„ç”¨æˆ·æ•°æ®ï¼Œç»“æœæ”¾å…¥List<TUser>
			users = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class));
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	// æ ¹æ®idè·å–ç”¨æˆ·
	public static TUser getUserById(int id) {
		Connection conn = UserService.getConnect();
		// QueryRunner DbUtilsæ ¸å¿ƒç±»
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


//æ¨¡ç³ŠæŸ¥è¯¢ç”¨æˆ·æ•°æ®
	public static List<TUser> queryFund(String key) {
		//è·å–æ•°æ®è¿æ¥
		Connection conn = UserService.getConnect();

		QueryRunner runner = new QueryRunner();
		key = "%" + key + "%";

		String sql = "select * from allfund where fdcd like ?or fdnm like ?";
		List<TUser> user = new ArrayList<>();
		try {
			// æŸ¥è¯¢æ‰€æœ‰çš„ç”¨æˆ·æ•°æ®ï¼Œç»“æœæ”¾åˆ°List<TUser>
			user = runner.query(conn, sql, new BeanListHandler<TUser>(TUser.class), key, key);
			DbUtils.closeQuietly(conn);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}

}
<<<<<<< HEAD
=======
>>>>>>> 8f677bb (moven)
>>>>>>> e981072 (moven)
