package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtils {

	private static String url="jdbc:mysql://localhost:3306/hbxq?useUnicode=true&characterEcoding=utf-8";
	private static String root="root";
	private static String password="baohui";
	
	//�������ݿ�
	public static Connection getConn()
	{
		Connection conn=null;
		
		try{
			//��������
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, root, password);
			 //System.out.println("���ݿ����ӳɹ�");
		}
		catch(Exception e){
			e.printStackTrace();
			//System.out.println("���ݿ�����ʧ��");
		}
		return conn;
	}
	
	
	public static void close(Statement state,Connection conn)
	{
		if(state!=null)
		{
			try {
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(ResultSet rs,Statement state,Connection conn)
	{
		if(rs!=null)
		{
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(state!=null)
		{
			try {
				state.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null)
		{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBUtils.getConn();
	}
}
