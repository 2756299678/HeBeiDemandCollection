package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import Bean.NeedBean;
import Bean.SelectBean;
import Bean.UserBean;
import Dao.NeedDao;
import Dao.UserDao;
import Daoif.NeedDaoif;
import Utils.StringUtil;

@SuppressWarnings("serial")
public class NeedServlet extends HttpServlet  {

	public void service(HttpServletRequest req,HttpServletResponse resp)throws
	ServletException,IOException{
		req.setCharacterEncoding("UTF-8");
		String method=req.getParameter("method");
		if("add".equals(method))
		{
			add(req,resp);
		}
		else if("List".equals(method))
		{
			List(req,resp);
		}else if("SearchList".equals(method))
		{
			SearchList(req,resp);
		}
		else if("show".equals(method))
		{
			show(req,resp);
		}else if("showshenhe".equals(method))
		{
			showshenhe(req,resp);
		}else if("zhengji".equals(method))
		{
			zhengji(req,resp);
		}else if("changeUser".equals(method))
		{
			changeUser(req,resp);
		}else if("usershow".equals(method))
		{
			usershow(req,resp);
		}else if("pingjia".equals(method))
		{
			pingjia(req,resp);
		}else if("selectKJHDLX".equals(method))
		{
			selectKJHDLX(req,resp);
		}
		else if("getType".equals(method))
		{
			getType(req,resp);
		}else if("selectfenlei".equals(method))
		{
			selectfenlei(req,resp);
		}
		else if("chaxunlist".equals(method))
		{
			
			try {
				chaxunlist(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if("selecttree".equals(method))
		{
			selecttree(req,resp);
		}
	}
	/**
	 * 树形结构查询
	 * @param req
	 * @param resp
	 */
	private void selecttree(HttpServletRequest req, HttpServletResponse resp)throws 
	IOException,ServletException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		//String KJHDLX=req.getParameter("KJHDLX");
		//String FL=req.getParameter("FL");
		
		String KJHDLX=req.getParameter("KJHDLX");
		if(KJHDLX.equals("1"))
		{
			KJHDLX="基础研究";
		}
		String FL=req.getParameter("FL");
		
		if(FL.equals("1"))
		{
			FL="数学";
		}else if(FL.equals("2"))
		{
			FL="英语";
		}
		else if(FL.equals("3"))
		{
			FL="政治";
		}
		else if(FL.equals("4"))
		{
			FL="历史";
		}
		else if(FL.equals("5"))
		{
			FL="语文";
		}
		System.out.println(KJHDLX);
		System.out.println(FL);
		
		
		NeedDaoif needDao = new NeedDao();
		List<NeedBean> needBeans =needDao.getListByFL(KJHDLX,FL);
		System.out.println(needBeans);
		
		req.getSession().setAttribute("messages", needBeans);
		resp.sendRedirect(req.getContextPath()+"/selectall/select.jsp");
	}
	/**
	 * 多条件查询
	 * @param req
	 * @param resp
	 * @throws Exception
	 */
	private void chaxunlist(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		System.out.println("多条件查询");
		String search1 = req.getParameter("search1"); //第一个条件
		String find1 = req.getParameter("find1");		//第一个输入框(需求名称或发布人)
			
		
		System.out.println("find1 servlet "+find1);
		String beforeFind1 = req.getParameter("beforeFind1");//前时间
		String afterFind1 = req.getParameter("afterFind1");  //后时间

		String search2 = req.getParameter("search2");
		String find2 = req.getParameter("find2");
		String beforeFind2 = req.getParameter("beforeFind2");
		String afterFind2 = req.getParameter("afterFind2");
		String logical1 = req.getParameter("logical1");

		String search3 = req.getParameter("search3");
		String find3 = req.getParameter("find3");
		String beforeFind3 = req.getParameter("beforeFind3");
		String afterFind3 = req.getParameter("afterFind3");
		String logical2 = req.getParameter("logical2");
		//System.out.println("时间格式  "+beforeFind1);
		//System.out.println("发布人  ");
		NeedDaoif needdao = new NeedDao();
		List<NeedBean> needbeans = new ArrayList<NeedBean>();
		needbeans = needdao.chaxunlist(search1, find1, beforeFind1, afterFind1,
				 search2, find2, beforeFind2, afterFind2, logical1,
				 search3, find3, beforeFind3, afterFind3, logical2);
		//System.out.println("多条件查询  "+needbeans);
		
		//req.setAttribute("needbeans", needbeans);
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		System.out.println(JSON.toJSONString(needbeans));
		out.print(JSON.toJSONString(needbeans));
		out.flush();
		out.close();	
	}

	/**
	 * 分类查询
	 * @param req
	 * @param resp
	 */
	private void selectfenlei(HttpServletRequest req, HttpServletResponse resp)throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String KJHDLX=req.getParameter("KJHDLX");
		String FL=req.getParameter("FL");
		System.out.println(KJHDLX);
		System.out.println(FL);
		
		if(FL.equals("-1"))
		{
			FL="";
		}
		NeedDaoif needDao = new NeedDao();
		List<NeedBean> needBeans =needDao.getListByFL(KJHDLX,FL);
		System.out.println(needBeans);
		
		req.getSession().setAttribute("messages", needBeans);
		
		resp.sendRedirect(req.getContextPath()+"/select/select.jsp");
	}
	/**
	 * 得到三级下拉的第二级
	 * @param req
	 * @param resp
	 */
	private void getType(HttpServletRequest req, HttpServletResponse resp)throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String KJHDLX = req.getParameter("KJHDLX");
		
		NeedDaoif needDao = new NeedDao();
		List<String> FL;
		if(KJHDLX.equals("基础研究"))
		{
			FL=needDao.getXKFL(KJHDLX);
		}
		else
		{
			FL=needDao.getXQJSYYHY(KJHDLX);
		}
		
		
		//进行去重
		  List<String> list = FL;
	        for(int i=0; i<list.size(); i++){
	            for(int j=i+1; j<list.size(); j++){
	                if(list.get(i).equals(list.get(j))){
	                	FL.remove(i); //注意这里是FL
	                }
	            }
	        }
	        System.out.println(FL);
	        System.out.println(FL.size());
        
	        /*req.setCharacterEncoding("utf-8");
	        JSONObject js = new JSONObject();
	        for (int i=0;i<FL.size();i++)
	        {
	        	String a=""+i;
	        	js.put(a,FL.get(i));
	        }
	        PrintWriter out;
	        try {
	        out = resp.getWriter();
	        out.print(js.toString());
	        out.flush();
	        out.close();
	        } catch (Exception e) {

	        }*/
        
      
        //req.getSession().setAttribute("allKJHDLX", set);
	    List<SelectBean> selects=new ArrayList<SelectBean>();
	    for(int i=0;i<FL.size();i++)
	    {
	    	 SelectBean select = new SelectBean();
	    	 System.out.println(FL.get(i));
	    	 select.setName(FL.get(i));
	    	 selects.add(select);
	    }
	   
	    //System.out.println(selects);
	    req.setCharacterEncoding("utf-8");
	    resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();
        System.out.println(JSON.toJSONString(selects));
        out.print(JSON.toJSONString(selects));
		out.flush();
		out.close();
		
	}
	/**
	 * 查询科技活动类型的填写状况
	 * @param req
	 * @param resp
	 */
	private void selectKJHDLX(HttpServletRequest req, HttpServletResponse resp) throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		
		NeedDao needDao = new NeedDao();
		List<String> allKJHDLX=needDao.getKJHDLX();
		
		//进行去重
		Set<String> set = new HashSet<>();
        set.addAll(allKJHDLX);
        //System.out.println(set);
        //System.out.println(set.size());
        
        
		req.getSession().setAttribute("allKJHDLX", set);
		
		
		resp.sendRedirect(req.getContextPath()+"/select/select.jsp");
		
	}
	/**
	 * 展示审核信息
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void showshenhe(HttpServletRequest req, HttpServletResponse resp)throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		int id=StringUtil.StringToInt(req.getParameter("id"));
		
		NeedDao messageDao = new NeedDao();
		NeedBean messageBean= messageDao.getNeedById(id);
		
		
		req.getSession().setAttribute("needBean", messageBean);
		
		resp.sendRedirect(req.getContextPath()+"/admin/Needshenhe.jsp");
	}
	/**
	 * 网络审核查询列表展示
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void SearchList(HttpServletRequest req, HttpServletResponse resp) throws 
	IOException,ServletException{
		// TODO Auto-generated method stub
		NeedDao needDao = new NeedDao();
		String XQMC = req.getParameter("XQMC");
		String JGMC = req.getParameter("JGMC");
		String SZDY = req.getParameter("SZDY");
		String GKGL = req.getParameter("GKGL");
		String JGSX = req.getParameter("JGSX");
		String KJHD = req.getParameter("KJHD");
		
		List<NeedBean> needBeans=needDao.getListbytype(XQMC,JGMC,SZDY,GKGL,JGSX,KJHD);
		
		req.getSession().setAttribute("messages", needBeans);
		
		resp.sendRedirect(req.getContextPath()+"/admin/shenhe.jsp");
		
	}
	/**
	 * 评价
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void pingjia(HttpServletRequest req, HttpServletResponse resp)throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		int id=StringUtil.StringToInt(req.getParameter("id"));
		String pingjia = req.getParameter("pingjia");
		String submit=req.getParameter("submit");
		
		NeedDao messageDao = new NeedDao();
		messageDao.update(pingjia,submit,id);
		
		NeedBean messageBean= messageDao.getNeedById(id);
		messageBean.setPingjia(pingjia);
		
		req.getSession().setAttribute("needBean", messageBean);
		
		resp.sendRedirect(req.getContextPath()+"/admin/Needshenhe.jsp?status=0");
		
		
	}
	/**
	 * 显示用户详细信息
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void usershow(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String username=req.getParameter("username");
		UserDao userDao = new UserDao();
		UserBean userBean = userDao.getUserByusername(username);
		req.getSession().setAttribute("userBean", userBean);
		
		resp.sendRedirect(req.getContextPath()+"/admin/userShow.jsp");
	}
	/**
	 * 修改密码
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void changeUser(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String username=req.getParameter("username");
		UserDao userDao = new UserDao();
		UserBean userBean = userDao.getUserByusername(username);
		req.getSession().setAttribute("userBean", userBean);
		
		resp.sendRedirect(req.getContextPath()+"/login/change.jsp");
	}
	/**
	 * 需求征集
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void zhengji(HttpServletRequest req, HttpServletResponse resp)throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String username=req.getParameter("username");
		UserDao userDao = new UserDao();
		UserBean userBean = userDao.getUserByusername(username);
		req.getSession().setAttribute("userBean", userBean);
		
		resp.sendRedirect(req.getContextPath()+"/admin/zhengji.jsp");
	}
	/**
	 * 需求信息的展示
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void show(HttpServletRequest req, HttpServletResponse resp)throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		int id=StringUtil.StringToInt(req.getParameter("id"));
		
		NeedDao messageDao = new NeedDao();
		NeedBean messageBean= messageDao.getNeedById(id);
		
		
		req.getSession().setAttribute("needBean", messageBean);
		
		resp.sendRedirect(req.getContextPath()+"/admin/needshow.jsp");
	}
	/**
	 * 需求的展示
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void List(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		NeedDao needDao = new NeedDao();
		String username = req.getParameter("username");
		
		List<NeedBean> needBeans=needDao.getList();
		
		req.getSession().setAttribute("messages", needBeans);
		
		resp.sendRedirect(req.getContextPath()+"/admin/listNeed.jsp");
	}

	/**
	 * 需求的添加
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void add(HttpServletRequest req, HttpServletResponse resp)throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");		
		String quancheng=req.getParameter("quancheng");//机构全称*
		String guanli=req.getParameter("guanli");//归口管理部门
		String address=req.getParameter("address");//通讯地址*
		String stress=req.getParameter("stress");//所在地区*
		String wangzhi=req.getParameter("wangzhi");//网址
		String Email=req.getParameter("Email");//电子信箱*
		String daibiao=req.getParameter("daibiao");//法人代表*
		String youbian=req.getParameter("youbian");//邮政编码
		String chuanzhen=req.getParameter("chuanzhen");//传真
		 String name=req.getParameter("name");//联系人*
		 String phone=req.getParameter("phone");//手机* 
		 String JGSX=req.getParameter("JGSX");//机构属性*
		 String JGJJ=req.getParameter("JGJJ");//机构简介*
		 String XQMC=req.getParameter("XQMC");//需求名称*
		 String XUKSSJ=req.getParameter("XUKSSJ");//需求开始时间*
		 String XQJSSJ=req.getParameter("XQJSSJ");//需求结束时间*
		 String ZYWT=req.getParameter("ZYWT");//主要问题*
		 String JSGJ=req.getParameter("JSGJ");//技术关键*
		 String YQMB=req.getParameter("YQMB");//预期目标*
		 String GJZ=req.getParameter("GJZ");//关键字*
		 String NTRZJZE=req.getParameter("NTRZJZE");//拟投入总金额
		 String JSXQJJFS=req.getParameter("JSXQJJFS");//技术需求解决方式*
		 String HZYXDW=req.getParameter("HZYXDW");//合作意向单位
		 String KJHDLX=req.getParameter("KJHDLX");//科技活动类型*
		 String XKFL=req.getParameter("XKFL");//学科分类
		 
		 String XQJSSSLY="";
		 if(!(KJHDLX.equals("基础研究")))
		 {
			 String[] checkboxcontext=req.getParameterValues("XQJSSSLY");
			 XQJSSSLY="";
					for(int i=0;i<checkboxcontext.length;i++)
					{
						XQJSSSLY +=checkboxcontext[i]+",";
					}
		 }
		 
		 String XQJSYYHY=req.getParameter("XQJSYYHY");//需求技术应用行业
		
		NeedBean needBean = new NeedBean(quancheng,  guanli,  address,  stress,  wangzhi,
				 Email,  daibiao,  youbian,  chuanzhen,  name,  phone,  JGSX,
				 JGJJ,  XQMC,  XUKSSJ,  XQJSSJ,  ZYWT,  JSGJ,  YQMB,  GJZ,
				 NTRZJZE,  JSXQJJFS,  HZYXDW,  KJHDLX,  XKFL,  XQJSSSLY,
				 XQJSYYHY);
		//现在时间
		SimpleDateFormat createDate1 = new SimpleDateFormat("yyyy-MM-dd");
		needBean.setCreate_date(createDate1.format(new Date()));
		
		NeedDao messageDao = new NeedDao();
		messageDao.add(needBean);
		
		resp.sendRedirect(req.getContextPath()+"/admin/zhengji.jsp?status=0");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
