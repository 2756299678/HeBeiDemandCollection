package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Bean.PermissionBean;
import Bean.UserBean;
import Utils.DBUtils;

public class PermissionDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	//角色的添加
	public boolean add(PermissionBean perBean) {
		// TODO Auto-generated method stub
		boolean f=false;
		String sql="insert into permission(username,QXFP, XQZJ, LLXQ,YHXX, XGMM, WLSH,MMCZ, TJCX) values ('"+
				perBean.getUsername()+"','"+perBean.getQXFP()+"','"+perBean.getXQZJ()+"','"+
				perBean.getLLXQ()+"','"+perBean.getYHXX()+"','"+perBean.getXGMM()+"','"+
				perBean.getWLSH()+"','"+perBean.getMMCZ()+"','"+perBean.getTJCX()+"')";
		Connection conn=null;
		Statement state=null;
		int a=0;
		try
		{
			conn=DBUtils.getConn();
			state=conn.createStatement();
			a=state.executeUpdate(sql);
			//System.out.print(sql);
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
	
	//检查角色名是否存在
		public boolean check(String username) {
			// TODO Auto-generated method stub
			boolean f=false;
			String sql="select * from permission where username = '"+username+"'";
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

		public boolean change(PermissionBean perBean) {
			// TODO Auto-generated method stub
			boolean f=false;
			String sql="update permission set QXFP='"+perBean.getQXFP()+"', XQZJ='"+perBean.getXQZJ()+"', "
					+ "LLXQ='"+perBean.getLLXQ()+"',YHXX='"+perBean.getYHXX()+"', XGMM='"+perBean.getXGMM()+"',"
					+ " WLSH='"+perBean.getWLSH()+"',MMCZ='"+perBean.getMMCZ()+"', TJCX='"+perBean.getTJCX()+"'"
							+ " where username='"+perBean.getUsername()+"'";
			Connection conn=null;
			Statement state=null;
			int a=0;
			try
			{
				conn=DBUtils.getConn();
				state=conn.createStatement();
				a=state.executeUpdate(sql);
				//System.out.print(sql);
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

		//通过用户名查找角色
		public PermissionBean getByUsername(String username) {
			// TODO Auto-generated method stub
			String sql="select * from permission where username='"+username+"'";
			Connection conn=DBUtils.getConn();
			Statement state=null;
			ResultSet rs=null;
			PermissionBean perBean =null;
			try
			{
				state=conn.createStatement();
				rs=state.executeQuery(sql);
				
				if(rs.next())
				{
					//System.out.println("正在赋值");
					perBean = new PermissionBean();
					perBean.setUsername(rs.getString("username"));
					perBean.setLLXQ(rs.getString("LLXQ"));
					perBean.setMMCZ(rs.getString("MMCZ"));
					perBean.setQXFP(rs.getString("QXFP"));
					perBean.setTJCX(rs.getString("TJCX"));
					perBean.setWLSH(rs.getString("WLSH"));
					perBean.setXGMM(rs.getString("XGMM"));
					perBean.setXQZJ(rs.getString("XQZJ"));
					perBean.setYHXX(rs.getString("YHXX"));
					
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				DBUtils.close(rs, state, conn);
			}
			return perBean;
		}
}
