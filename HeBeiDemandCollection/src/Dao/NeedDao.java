package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Bean.NeedBean;
import Daoif.NeedDaoif;
import Utils.DBUtils;

public class NeedDao implements NeedDaoif{

	//添加
	public void add(NeedBean needBean) {
		// TODO Auto-generated method stub
		String sql="insert into need(id,quancheng,guanli,address,stress,wangzhi,Email,daibiao,youbian,chuanzhen,name,phone,JGSX,JGJJ,"+
		"XQMC,XUKSSJ,XQJSSJ,ZYWT,JSGJ,YQMB,GJZ,NTRZJZE,JSXQJJFS,HZYXDW,KJHDLX,XKFL,XQJSSSLY,XQJSYYHY,create_date) values('"+needBean.getId()+"','"+needBean.getQuancheng()
		+"','"+needBean.getGuanli()+"','"+needBean.getAddress()+"','"+needBean.getStress()+"','"+needBean.getWangzhi()+"','"+needBean.getEmail()+"','"+
		needBean.getDaibiao()+"','"+needBean.getYoubian()+"','"+needBean.getChuanzhen()+"','"+needBean.getName()+"','"+needBean.getPhone()+"','"+
		needBean.getJGSX()+"','"+needBean.getJGJJ()+"','"+needBean.getXQMC()+"','"+needBean.getXUKSSJ()+"','"+needBean.getXQJSSJ()+"','"+needBean.getZYWT()
		+"','"+needBean.getJSGJ()+"','"+needBean.getYQMB()+"','"+needBean.getGJZ()+"','"+needBean.getNTRZJZE()+"','"+needBean.getJSXQJJFS()+"','"+
		needBean.getHZYXDW()+"','"+needBean.getKJHDLX()+"','"+needBean.getXKFL()+"','"+needBean.getXQJSSSLY()+"','"+needBean.getXQJSYYHY()+"','"+needBean.getCreate_date()+"')";
		
		Connection conn=null;
		Statement state=null;
		try
		{
			conn=DBUtils.getConn();
			state=conn.createStatement();
			state.executeUpdate(sql);
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			DBUtils.close(state, conn);
		}
	}

	//获取列表信息
	public List<NeedBean> getList() {
		// TODO Auto-generated method stub
		String sql="select * from need order by create_date desc";
		Connection conn=DBUtils.getConn();
		Statement state=null;
		ResultSet rs=null;
		List<NeedBean> messageBeans=new ArrayList<NeedBean>();
		try
		{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			NeedBean messageBean= null;
			while(rs.next())
			{
				messageBean = new NeedBean();
				messageBean.setId(rs.getInt("id"));
				messageBean.setQuancheng(rs.getString("quancheng"));//机构全称*
				messageBean.setGuanli(rs.getString("guanli"));//机构管理
				messageBean.setAddress(rs.getString("address"));
				messageBean.setChuanzhen(rs.getString("chuanzhen"));
				messageBean.setDaibiao(rs.getString("daibiao"));
				messageBean.setEmail(rs.getString("Email"));
				messageBean.setGJZ(rs.getString("GJZ"));
				messageBean.setHZYXDW(rs.getString("HZYXDW"));
				messageBean.setJGJJ(rs.getString("JGJJ"));
				messageBean.setJGSX(rs.getString("JGSX"));
				messageBean.setJSGJ(rs.getString("JSGJ"));
				messageBean.setJSXQJJFS(rs.getString("JSXQJJFS"));
				messageBean.setKJHDLX(rs.getString("KJHDLX"));
				messageBean.setName(rs.getString("name"));
				messageBean.setNTRZJZE(rs.getString("NTRZJZE"));
				messageBean.setPhone(rs.getString("phone"));
				messageBean.setStress(rs.getString("stress"));
				messageBean.setWangzhi(rs.getString("wangzhi"));
				messageBean.setXKFL(rs.getString("XKFL"));
				messageBean.setXQJSSJ(rs.getString("XQJSSJ"));
				messageBean.setXQJSYYHY(rs.getString("XQJSYYHY"));
				messageBean.setXQJSSSLY(rs.getString("XQJSSSLY"));
				messageBean.setXQMC(rs.getString("XQMC"));
				messageBean.setXUKSSJ(rs.getString("XUKSSJ"));
				messageBean.setYoubian(rs.getString("youbian"));
				messageBean.setYQMB(rs.getString("YQMB"));
				messageBean.setZYWT(rs.getString("ZYWT"));
				messageBean.setStatus(rs.getString("status"));
				messageBean.setCreate_date(rs.getString("create_date"));
				messageBeans.add(messageBean);
				
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				DBUtils.close(rs, state, conn);
			}
			return messageBeans;
		}
	
	

	//根据id获得信息
	public NeedBean getNeedById(int id) {
		// TODO Auto-generated method stub
		String sql="select * from need where id='"+id+"'";
		Connection conn=DBUtils.getConn();
		Statement state=null;
		ResultSet rs=null;
		NeedBean messageBean= null;
		try
		{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			
			while(rs.next())
			{
				messageBean = new NeedBean();
				messageBean.setId(rs.getInt("id"));
				messageBean.setQuancheng(rs.getString("quancheng"));//机构全称*
				messageBean.setGuanli(rs.getString("guanli"));//机构管理
				messageBean.setAddress(rs.getString("address"));
				messageBean.setChuanzhen(rs.getString("chuanzhen"));
				messageBean.setDaibiao(rs.getString("daibiao"));
				messageBean.setEmail(rs.getString("Email"));
				messageBean.setGJZ(rs.getString("GJZ"));
				messageBean.setHZYXDW(rs.getString("HZYXDW"));
				messageBean.setJGJJ(rs.getString("JGJJ"));
				messageBean.setJGSX(rs.getString("JGSX"));
				messageBean.setJSGJ(rs.getString("JSGJ"));
				messageBean.setJSXQJJFS(rs.getString("JSXQJJFS"));
				messageBean.setKJHDLX(rs.getString("KJHDLX"));
				messageBean.setName(rs.getString("name"));
				messageBean.setNTRZJZE(rs.getString("NTRZJZE"));
				messageBean.setPhone(rs.getString("phone"));
				messageBean.setStress(rs.getString("stress"));
				messageBean.setWangzhi(rs.getString("wangzhi"));
				messageBean.setXKFL(rs.getString("XKFL"));
				messageBean.setXQJSSJ(rs.getString("XQJSSJ"));
				messageBean.setXQJSYYHY(rs.getString("XQJSYYHY"));
				messageBean.setXQJSSSLY(rs.getString("XQJSSSLY"));
				messageBean.setXQMC(rs.getString("XQMC"));
				messageBean.setXUKSSJ(rs.getString("XUKSSJ"));
				messageBean.setYoubian(rs.getString("youbian"));
				messageBean.setYQMB(rs.getString("YQMB"));
				messageBean.setZYWT(rs.getString("ZYWT"));
				messageBean.setStatus(rs.getString("status"));
				messageBean.setPingjia(rs.getString("pingjia"));
				messageBean.setCreate_date(rs.getString("create_date"));
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtils.close(rs, state, conn);
		}
		return messageBean;
	}
	//更新评价及状态
	 public  void update(String pingjia, String submit, int id) {
			// TODO Auto-generated method stub
			String sql="update need set pingjia='"+pingjia+"',status='"+submit+"'  where id='"+id+"'";
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

	public List<NeedBean> getListbytype(String xQMC, String jGMC, String sZDY, String gKGL, String jGSX,String kJHD)
	{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String sql="select * from need where XQMC Like '%"+xQMC
				+"%' and quancheng Like '%"+jGMC+"%' and stress Like '%"+sZDY
				+"%' and guanli Like '%"+gKGL+"%' and JGSX Like '%"+jGSX+"%' and KJHDLX Like '%"+kJHD+"%' order by create_date desc ";
		Connection conn=DBUtils.getConn();
		Statement state=null;
		ResultSet rs=null;
		List<NeedBean> messageBeans=new ArrayList<NeedBean>();
		try
		{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			NeedBean messageBean= null;
			while(rs.next())
			{
				messageBean = new NeedBean();
				messageBean.setId(rs.getInt("id"));
				messageBean.setQuancheng(rs.getString("quancheng"));//机构全称*
				messageBean.setGuanli(rs.getString("guanli"));//机构管理
				messageBean.setAddress(rs.getString("address"));
				messageBean.setChuanzhen(rs.getString("chuanzhen"));
				messageBean.setDaibiao(rs.getString("daibiao"));
				messageBean.setEmail(rs.getString("Email"));
				messageBean.setGJZ(rs.getString("GJZ"));
				messageBean.setHZYXDW(rs.getString("HZYXDW"));
				messageBean.setJGJJ(rs.getString("JGJJ"));
				messageBean.setJGSX(rs.getString("JGSX"));
				messageBean.setJSGJ(rs.getString("JSGJ"));
				messageBean.setJSXQJJFS(rs.getString("JSXQJJFS"));
				messageBean.setKJHDLX(rs.getString("KJHDLX"));
				messageBean.setName(rs.getString("name"));
				messageBean.setNTRZJZE(rs.getString("NTRZJZE"));
				messageBean.setPhone(rs.getString("phone"));
				messageBean.setStress(rs.getString("stress"));
				messageBean.setWangzhi(rs.getString("wangzhi"));
				messageBean.setXKFL(rs.getString("XKFL"));
				messageBean.setXQJSSJ(rs.getString("XQJSSJ"));
				messageBean.setXQJSYYHY(rs.getString("XQJSYYHY"));
				messageBean.setXQJSSSLY(rs.getString("XQJSSSLY"));
				messageBean.setXQMC(rs.getString("XQMC"));
				messageBean.setXUKSSJ(rs.getString("XUKSSJ"));
				messageBean.setYoubian(rs.getString("youbian"));
				messageBean.setYQMB(rs.getString("YQMB"));
				messageBean.setZYWT(rs.getString("ZYWT"));
				messageBean.setStatus(rs.getString("status"));
				messageBean.setCreate_date(rs.getString("create_date"));
				messageBeans.add(messageBean);
				
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				DBUtils.close(rs, state, conn);
			}
			return messageBeans;
	}

	public java.util.List<String> getKJHDLX() {
		// TODO Auto-generated method stub
		String sql="select * from need ";
		Connection conn=DBUtils.getConn();
		Statement state=null;
		ResultSet rs=null;
		List<String> messages=new ArrayList<String>();
		try
		{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			while(rs.next())
			{
				String KJHDLX=rs.getString("KJHDLX");
				messages.add(KJHDLX);
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtils.close(rs, state, conn);
		}
		
		return messages;
	}

	public java.util.List<String> getXKFL(String kJHDLX) {
		// TODO Auto-generated method stub
		String sql="select * from need where KJHDLX='"+kJHDLX+"'";
		Connection conn=DBUtils.getConn();
		Statement state=null;
		ResultSet rs=null;
		List<String> messages=new ArrayList<String>();
		try
		{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			while(rs.next())
			{
				String KJHDLX=rs.getString("XKFL");
				messages.add(KJHDLX);
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtils.close(rs, state, conn);
		}
		
		return messages;
	}

	public java.util.List<String> getXQJSYYHY(String kJHDLX) {
		// TODO Auto-generated method stub
		String sql="select * from need where KJHDLX='"+kJHDLX+"'";
		Connection conn=DBUtils.getConn();
		Statement state=null;
		ResultSet rs=null;
		List<String> messages=new ArrayList<String>();
		try
		{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			while(rs.next())
			{
				String KJHDLX=rs.getString("XQJSYYHY");
				messages.add(KJHDLX);
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtils.close(rs, state, conn);
		}
		
		return messages;
	}

	public java.util.List<NeedBean> getListByFL(String kJHDLX, String fL) {
		// TODO Auto-generated method stub
		String sql="";
		if(kJHDLX.equals("基础研究"))
		{
			sql="select * from need where KJHDLX Like'%"+kJHDLX+"%'and XKFL Like '%"+fL+"%'";
		}
		else
		{
			sql="select * from need where KJHDLX Like'%"+kJHDLX+"%'and XQJSYYHY Like '%"+fL+"%'";
		}
		Connection conn=DBUtils.getConn();
		Statement state=null;
		ResultSet rs=null;
		List<NeedBean> messageBeans=new ArrayList<NeedBean>();
		try
		{
			state=conn.createStatement();
			rs=state.executeQuery(sql);
			NeedBean messageBean= null;
			while(rs.next())
			{
				messageBean = new NeedBean();
				messageBean.setId(rs.getInt("id"));
				messageBean.setQuancheng(rs.getString("quancheng"));//机构全称*
				messageBean.setGuanli(rs.getString("guanli"));//机构管理
				messageBean.setAddress(rs.getString("address"));
				messageBean.setChuanzhen(rs.getString("chuanzhen"));
				messageBean.setDaibiao(rs.getString("daibiao"));
				messageBean.setEmail(rs.getString("Email"));
				messageBean.setGJZ(rs.getString("GJZ"));
				messageBean.setHZYXDW(rs.getString("HZYXDW"));
				messageBean.setJGJJ(rs.getString("JGJJ"));
				messageBean.setJGSX(rs.getString("JGSX"));
				messageBean.setJSGJ(rs.getString("JSGJ"));
				messageBean.setJSXQJJFS(rs.getString("JSXQJJFS"));
				messageBean.setKJHDLX(rs.getString("KJHDLX"));
				messageBean.setName(rs.getString("name"));
				messageBean.setNTRZJZE(rs.getString("NTRZJZE"));
				messageBean.setPhone(rs.getString("phone"));
				messageBean.setStress(rs.getString("stress"));
				messageBean.setWangzhi(rs.getString("wangzhi"));
				messageBean.setXKFL(rs.getString("XKFL"));
				messageBean.setXQJSSJ(rs.getString("XQJSSJ"));
				messageBean.setXQJSYYHY(rs.getString("XQJSYYHY"));
				messageBean.setXQJSSSLY(rs.getString("XQJSSSLY"));
				messageBean.setXQMC(rs.getString("XQMC"));
				messageBean.setXUKSSJ(rs.getString("XUKSSJ"));
				messageBean.setYoubian(rs.getString("youbian"));
				messageBean.setYQMB(rs.getString("YQMB"));
				messageBean.setZYWT(rs.getString("ZYWT"));
				messageBean.setStatus(rs.getString("status"));
				messageBean.setCreate_date(rs.getString("create_date"));
				messageBeans.add(messageBean);
				
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			finally{
				DBUtils.close(rs, state, conn);
			}
			return messageBeans;
	}
	
	
	/**
	 * 多条件查询
	 * @param search1
	 * @param find1
	 * @param beforeFind1
	 * @param afterFind1
	 * @param search2
	 * @param find2
	 * @param beforeFind2
	 * @param afterFind2
	 * @param logical1
	 * @param search3
	 * @param find3
	 * @param beforeFind3
	 * @param afterFind3
	 * @param logical2
	 * @return
	 * @throws Exception
	 */
	public List<NeedBean> chaxunlist(String search1,String find1,String beforeFind1,String afterFind1,
			String search2,String find2,String beforeFind2,String afterFind2,String logical1,
			String search3,String find3,String beforeFind3,String afterFind3,String logical2) throws Exception
	{
		
		Connection conn = null;
		Statement state=null;
		ResultSet rs = null;
		
		String sql = "";
		if(find1.equals("") && find2 ==null && find3 == null && beforeFind1== null && beforeFind2 == null && beforeFind3 == null)
		{
			System.out.println("查询所有");
			sql = "select * from need";		
		}
		else{
			System.out.println("find1  "+find1+"  find2   "+find2+"  find3  "+find3);
			if(find1!= null && find1.length()>0)
				System.out.println("find1的长度");
			sql = "select * from need where";
			
			if((find1 != null && find1.length()>0) || (beforeFind1 != null && beforeFind1.length() > 0))
			{
				System.out.println("search1 "+search1);
				if(search1.equals("title"))
					sql += " XQMC like '%"+find1+"%'" ;
				else if(search1.equals("creatorId"))
					sql += " name= '"+find1+"'";
				else if(search1.equals("addDate"))
					sql += " create_date between '"+beforeFind1+"' and '"+afterFind1+"'";
			}
			if((find2 !=null && find1.length()>0) || (beforeFind2 != null && beforeFind2.length() > 0))
			{
				sql += " "+logical1 ;
				if(logical1.equals("and")|| logical1.equals("or") )
				{	
					if(search2.equals("title"))
						sql += " XQMC like '%"+find2+"%'";
					else if(search2.equals("creatorId"))
						sql += " name= '"+find2+"'";
					else if(search2.equals("addDate"))
						sql += " create_date between '"+beforeFind2+"' and '"+afterFind2+"'";
				}
				else if(logical1.equals("not"))
				{
					if(search2.equals("title"))
						sql += " and XQMC not like '%"+find2+"%'";
					else if(search2.equals("creatorId"))
						sql += " and name!= '"+find2+"'";
					else if(search2.equals("addDate"))
						sql += " and create_date not between '"+beforeFind2+"' and '"+afterFind2+"'";
					
				}
			}
			if((find3 != null && find3.length() >0) || (beforeFind3 != null && beforeFind3.length() > 0))
			{
				sql += " "+logical2 ;
				if(logical2.equals("and")|| logical2.equals("or") )
				{	
					if(search3.equals("title"))
						sql += " XQMC like '%"+find3+"%'";
					else if(search3.equals("creatorId"))
						sql += " name = '"+find3+"'";
					else if(search3.equals("addDate"))
						sql += " create_date between '"+beforeFind3+"' and '"+afterFind3+"'";
				}
				else if(logical2.equals("not"))
				{
					if(search3.equals("title"))
						sql += " and XQMC not like '%"+find3+"%'";
					else if(search3.equals("creatorId"))
						sql += " and name!= '"+find3+"'";
					else if(search3.equals("addDate"))
						sql += " and create_date not between '"+beforeFind3+"' and '"+afterFind3+"'";
					
				}
			}
		
		}
		System.out.println("sql语句  "+sql);
		NeedBean messageBean = null;
		List<NeedBean> needbeans = new ArrayList<NeedBean>();
		
		try{
		conn = DBUtils.getConn();
		state=conn.createStatement();
		rs=state.executeQuery(sql);

		while(rs.next())
		{
			messageBean = new NeedBean();
			messageBean.setId(rs.getInt("id"));
			messageBean.setQuancheng(rs.getString("quancheng"));//机构全称*
			messageBean.setGuanli(rs.getString("guanli"));//机构管理
			messageBean.setAddress(rs.getString("address"));
			messageBean.setChuanzhen(rs.getString("chuanzhen"));
			messageBean.setDaibiao(rs.getString("daibiao"));
			messageBean.setEmail(rs.getString("Email"));
			messageBean.setGJZ(rs.getString("GJZ"));
			messageBean.setHZYXDW(rs.getString("HZYXDW"));
			messageBean.setJGJJ(rs.getString("JGJJ"));
			messageBean.setJGSX(rs.getString("JGSX"));
			messageBean.setJSGJ(rs.getString("JSGJ"));
			messageBean.setJSXQJJFS(rs.getString("JSXQJJFS"));
			messageBean.setKJHDLX(rs.getString("KJHDLX"));
			messageBean.setName(rs.getString("name"));
			messageBean.setNTRZJZE(rs.getString("NTRZJZE"));
			messageBean.setPhone(rs.getString("phone"));
			messageBean.setStress(rs.getString("stress"));
			messageBean.setWangzhi(rs.getString("wangzhi"));
			messageBean.setXKFL(rs.getString("XKFL"));
			messageBean.setXQJSSJ(rs.getString("XQJSSJ"));
			messageBean.setXQJSYYHY(rs.getString("XQJSYYHY"));
			messageBean.setXQJSSSLY(rs.getString("XQJSSSLY"));
			messageBean.setXQMC(rs.getString("XQMC"));
			messageBean.setXUKSSJ(rs.getString("XUKSSJ"));
			messageBean.setYoubian(rs.getString("youbian"));
			messageBean.setYQMB(rs.getString("YQMB"));
			messageBean.setZYWT(rs.getString("ZYWT"));
			messageBean.setStatus(rs.getString("status"));
			messageBean.setCreate_date(rs.getString("create_date"));
			needbeans.add(messageBean);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally{
			DBUtils.close(rs, state, conn);
		}
		return needbeans;
	}
	
	
	
	}
