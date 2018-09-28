package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bean.NeedBean;
import Bean.UserBean;
import Utils.DBUtils;

public class UserDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//添加
		public void add(UserBean userBean) {
			// TODO Auto-generated method stub
			String sql="insert into user(username,password,quancheng,guanli,address,stress,wangzhi,Email,daibiao,youbian,chuanzhen,name,phone) values("
					+ "'"+userBean.getUsername()+"','"+userBean.getPassword()+"','"+userBean.getQuancheng()+"','"+userBean.getGuanli()+"','"+
					userBean.getAddress()+"','"+userBean.getStress()+"','"+userBean.getWangzhi()+"','"+userBean.getEmail()+"','"+
					userBean.getDaibiao()+"','"+userBean.getYoubian()+"','"+userBean.getChuanzhen()+"','"+userBean.getName()+"','"+userBean.getPhone()+"') ";
			
			Connection conn=null;
			Statement state=null;
			try
			{
				conn=DBUtils.getConn();
				state=conn.createStatement();
				state.executeUpdate(sql);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				DBUtils.close(state, conn);
			}
		}
	
		//注册检查
		public  int check(String username, String password) {
			// TODO Auto-generated method stub
			String sql="select * from user where username='"+username+"'";
			Connection conn=null;
			Statement state=null;
			ResultSet rs=null;
			int a=0;
			try
			{
				conn=DBUtils.getConn();
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				if(rs.next())
				{
					a=1;
					if(password.equals(rs.getString("password")))
					{
						a=2;
					}
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				DBUtils.close(rs, state, conn);
			}
			return a;
		}

	//检查用户名是否存在
	public boolean check(String username) {
		// TODO Auto-generated method stub
		boolean f=false;
		String sql="select * from user where username = '"+username+"'";
		Connection conn=null;
		Statement state=null;
		ResultSet rs=null;
		
		try
		{
			conn=DBUtils.getConn();
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			if(rs.next())
			{
				f=true;
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtils.close(rs, state, conn);
		}
		return f;
	}
		/**
		 * 修改密码
		 * @param oldpassword
		 * @param password
		 *  @param id
		 */
		public void change(String password, String username ) {
			// TODO Auto-generated method stub
			String sql="update user set password='"+password+"'  where username='"+username+"'";
			Connection conn=null;
			Statement state=null;
			try
			{
				conn=DBUtils.getConn();
				state=conn.createStatement();
				state.executeUpdate(sql);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				DBUtils.close(state, conn);
			}
			
		}
		
		public UserBean getUserByusername(String username) {
			// TODO Auto-generated method stub
			String sql="select * from user where username='"+username+"'";
			Connection conn=DBUtils.getConn();
			Statement state=null;
			ResultSet rs=null;
			UserBean userBean =null;
			try
			{
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				
				while(rs.next())
				{
					userBean = new UserBean();
					userBean.setUsername(rs.getString("username"));
					userBean.setPassword(rs.getString("password"));
					userBean.setAddress(rs.getString("address"));
					userBean.setChuanzhen(rs.getString("chuanzhen"));
					userBean.setDaibiao(rs.getString("daibiao"));
					userBean.setEmail(rs.getString("Email"));
					userBean.setGuanli(rs.getString("guanli"));
					userBean.setName(rs.getString("name"));
					userBean.setPhone(rs.getString("phone"));
					userBean.setQuancheng(rs.getString("quancheng"));
					userBean.setStress(rs.getString("stress"));
					userBean.setWangzhi(rs.getString("wangzhi"));
					userBean.setYoubian(rs.getString("youbian"));
					userBean.setQuanxian(rs.getString("quanxian"));
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				DBUtils.close(rs, state, conn);
			}
			return userBean;
		}
		public List<UserBean> getList() {
			// TODO Auto-generated method stub
			String sql="select * from user";
			Connection conn=DBUtils.getConn();
			Statement state=null;
			ResultSet rs=null;
			List<UserBean> userBeans=new ArrayList<UserBean>();
			UserBean userBean =null;
			try
			{
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				
				while(rs.next())
				{
					userBean = new UserBean();
					userBean.setUsername(rs.getString("username"));
					userBean.setPassword(rs.getString("password"));
					userBean.setAddress(rs.getString("address"));
					userBean.setChuanzhen(rs.getString("chuanzhen"));
					userBean.setDaibiao(rs.getString("daibiao"));
					userBean.setEmail(rs.getString("Email"));
					userBean.setGuanli(rs.getString("guanli"));
					userBean.setName(rs.getString("name"));
					userBean.setPhone(rs.getString("phone"));
					userBean.setQuancheng(rs.getString("quancheng"));
					userBean.setStress(rs.getString("stress"));
					userBean.setWangzhi(rs.getString("wangzhi"));
					userBean.setYoubian(rs.getString("youbian"));
					userBean.setQuanxian(rs.getString("quanxian"));
					userBeans.add(userBean);
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				DBUtils.close(rs, state, conn);
			}
			return userBeans;
		
		}
		public boolean reset(String username) {
			// TODO Auto-generated method stub
			boolean f= false;
			String sql="update user set password='123456'  where username='"+username+"'";
			Connection conn=null;
			Statement state=null;
			int a=0;
			try
			{
				conn=DBUtils.getConn();
				state=conn.createStatement();
				a=state.executeUpdate(sql);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				DBUtils.close(state, conn);
			}
			if(a>0)
			{
				f=true;
			}
			return f;
		}
		public void changequanxian(String username, String quanxian) {
			// TODO Auto-generated method stub
			String sql="update user set quanxian='"+quanxian+"'  where username='"+username+"'";
			Connection conn=null;
			Statement state=null;
			try
			{
				conn=DBUtils.getConn();
				state=conn.createStatement();
				state.executeUpdate(sql);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				DBUtils.close(state, conn);
			}
		}
		
		
	
}
