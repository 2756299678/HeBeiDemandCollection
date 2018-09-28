package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import Bean.NeedBean;
import Bean.PermissionBean;
import Bean.UserBean;
import Dao.NeedDao;
import Dao.PermissionDao;
import Dao.UserDao;
import Utils.StringUtil;

public class UserServlet extends HttpServlet  {

	public void service(HttpServletRequest req,HttpServletResponse resp)throws
	ServletException,IOException{
		req.setCharacterEncoding("UTF-8");
		String method=req.getParameter("method");
		if("login".equals(method))
		{
			login(req,resp);
		}
		else if("regist".equals(method))
		{
			regist(req,resp);
		}
		else if("change".equals(method))
		{
			change(req,resp);
		}else if("List".equals(method))
		{
			List(req,resp);
		}else if("List2".equals(method))
		{
			List2(req,resp);
		}else if("reset".equals(method))
		{
			reset(req,resp);
		}else if("show".equals(method))
		{
			show(req,resp);
		}
		else if("getUserBean".equals(method))
    	{
    		try {
				getUserBeans(req,resp);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
	}
	//返回发布人的信息用于查询
	//获得用户的集合
	private void getUserBeans(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// TODO Auto-generated method stub
		UserDao userdao = new UserDao();
		List<UserBean> userbeans = new ArrayList<UserBean>();
		userbeans = userdao.getList(); 
		req.setAttribute("userbeans", userbeans);
		System.out.println("用户集合userbeans  "+userbeans);
		resp.setCharacterEncoding("utf-8");
		PrintWriter out;
		out = resp.getWriter();
		out.print(JSON.toJSONString(userbeans));
		out.flush();
		out.close();
	}

	/**
	 * 用户信息的存储
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void show(HttpServletRequest req, HttpServletResponse resp)throws
	IOException,ServletException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String username=req.getParameter("username");
		UserDao userDao = new UserDao();
		UserBean userBean = userDao.getUserByusername(username);
		req.getSession().setAttribute("userBean", userBean);
		
		resp.sendRedirect(req.getContextPath()+"/permission/changerole.jsp");
		
	}
	/**
	 * 用户的展示
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void List(HttpServletRequest req, HttpServletResponse resp) throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		UserDao userDao = new UserDao();
		String status=req.getParameter("status");
		List<UserBean> userbeans=userDao.getList();
		
		req.getSession().setAttribute("userbeans", userbeans);
		
		resp.sendRedirect(req.getContextPath()+"/login/reset.jsp?status="+status+"");
	}
	/**
	 * 用户的展示
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void List2(HttpServletRequest req, HttpServletResponse resp) throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		UserDao userDao = new UserDao();
		
		List<UserBean> userbeans=userDao.getList();
		
		req.getSession().setAttribute("userbeans", userbeans);
		
		resp.sendRedirect(req.getContextPath()+"/permission/listPerssion.jsp");
	}
	/**
	 * 用户密码重置
	 * @param req
	 * @param resp
	 * @throws IOException
	 * @throws ServletException
	 */
	private void reset(HttpServletRequest req, HttpServletResponse resp) throws
	IOException,ServletException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		
		UserDao userDao = new UserDao();
		boolean f=false;
		f=userDao.reset(username);
		int status=0;
		if(f)
		{
			status=0;
		}
		else
		{
			status=1;
		}
		resp.sendRedirect(req.getContextPath()+"/userServlet?method=List&&status="+status+"");
		
	}
	/**
	 * 修改密码
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void change(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		int id=StringUtil.StringToInt(req.getParameter("userId"));
		String username=req.getParameter("username");
		String loginpassword=req.getParameter("loginpassword");
		String oldpassword=req.getParameter("oldpassword");
		String password=req.getParameter("password");
		System.out.println("username:"+username);
		System.out.println("password:"+loginpassword);
		UserDao userDao = new UserDao();
		
		//先检查一下账号密码是否正确，正确就进行更新
		if(loginpassword.equals(oldpassword))
		{
			userDao.change(password,username);
			resp.sendRedirect(req.getContextPath()+"/login/change.jsp?status=1");
		}
		else
		{
			resp.sendRedirect(req.getContextPath()+"/login/change.jsp?status=0");
		}
	}

	/**
	 * 登陆
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void login(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String yanzheng=req.getParameter("yanzheng");
		String checkCode=req.getParameter("checkCode");
		int a=0;
		
		UserDao adminDao=new UserDao();
		
		a=adminDao.check(username,password);
		
		if(a!=2)
		{
			resp.sendRedirect(req.getContextPath()+"/login/login.jsp?status="+a+"");
		}
		else
		{
			if(!(yanzheng.equals(checkCode)))
			{
				resp.sendRedirect(req.getContextPath()+"/login/login.jsp?status=3");
			}
			else
			{
				UserBean userBean = new UserBean();
				userBean.setUsername(username);
				userBean.setPassword(password);
				UserDao userDao = new UserDao();
				userBean = userDao.getUserByusername(username);
				req.getSession().setAttribute("userBean", userBean);
				
				
				PermissionDao  permissionDao = new PermissionDao();
				PermissionBean perBean = permissionDao.getByUsername(userBean.getQuanxian());
				
				req.getSession().setAttribute("perBean", perBean);
				
				resp.sendRedirect(req.getContextPath()+"/admin/main.jsp");
			}
		}
		
	}
	/**
	 * 用户注册
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void regist(HttpServletRequest req, HttpServletResponse resp)throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		String password = req.getParameter("password");
		String quancheng=req.getParameter("quancheng");
		String guanli=req.getParameter("guanli");
		String address=req.getParameter("address");
		String stress=req.getParameter("stress");
		String wangzhi=req.getParameter("wangzhi");
		String Email=req.getParameter("Email");
		String daibiao=req.getParameter("daibiao");
		String youbian=req.getParameter("youbian");
		String chuanzhen=req.getParameter("chuanzhen");
		String name=req.getParameter("name");
		String phone=req.getParameter("phone");
		
		UserBean userBean = new UserBean(username,password,quancheng,guanli,address,stress,wangzhi,Email,daibiao,youbian,chuanzhen,name,phone);
		
		UserDao userDao = new UserDao();
		boolean f=false;
		f=userDao.check(username);
		if(f)
		{
			resp.sendRedirect(req.getContextPath()+"/login/zhuce.jsp?status=5");
		}
		else
		{
			userDao.add(userBean);
			resp.sendRedirect(req.getContextPath()+"/login/login.jsp?status=4");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
