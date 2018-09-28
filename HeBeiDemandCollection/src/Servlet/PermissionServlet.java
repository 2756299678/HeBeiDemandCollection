package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.PermissionBean;
import Dao.PermissionDao;
import Dao.UserDao;

public class PermissionServlet extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse resp)throws
	ServletException,IOException{
		req.setCharacterEncoding("UTF-8");
		String method=req.getParameter("method");
		if("add".equals(method))
		{
			add(req,resp);
		}
		else if("change".equals(method))
		{
			change(req,resp);
		}else if("show".equals(method))
		{
			show(req,resp);
		}else if("changeuser".equals(method))
		{
			changeuser(req,resp);
		}
	}
	/**
	 * �޸��û���ɫ
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void changeuser(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		String quanxian=req.getParameter("quanxian");
		
		UserDao userDao = new UserDao();
		userDao.changequanxian(username,quanxian);
		
		resp.sendRedirect(req.getContextPath()+"/userServlet?method=List2");
		
	}
	/**
	 * չʾ��ɫ����ϸ��Ϣ
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void show(HttpServletRequest req, HttpServletResponse resp)throws
	ServletException,IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		PermissionDao PerDao = new PermissionDao();
		
		PermissionBean permission=PerDao.getByUsername(username);
		
		req.getSession().setAttribute("permission", permission);
		
		resp.sendRedirect(req.getContextPath()+"/permission/changePermission.jsp");
	}

	/**
	 * �޸Ľ�ɫȨ��
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void change(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		String QXFP = req.getParameter("QXFP");
		String XQZJ= req.getParameter("XQZJ");
		String LLXQ= req.getParameter("LLXQ");
		String YHXX= req.getParameter("YHXX");
		String XGMM= req.getParameter("XGMM");
		String WLSH= req.getParameter("WLSH");
		String MMCZ= req.getParameter("MMCZ");
	    String TJCX= req.getParameter("TJCX");
	    
	    PermissionBean perBean =new PermissionBean(username,QXFP, XQZJ, LLXQ,YHXX, XGMM, WLSH,MMCZ, TJCX);
	    PermissionDao perDao = new PermissionDao();
	    
	    boolean fl=false;
	    fl= perDao.change(perBean);
	    
	    if(fl)
	    {
	    	//��ӳɹ�
	    	req.getSession().setAttribute("permission", perBean);
	    	resp.sendRedirect(req.getContextPath()+"/permission/changePermission.jsp?status=1");
	    }
	    else
	    {
	    	//���ʧ��
	    	resp.sendRedirect(req.getContextPath()+"/permission/changePermission.jsp?status=2");
	    }
	}


	/**
	 * ��ӽ�ɫ
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	private void add(HttpServletRequest req, HttpServletResponse resp) throws
	ServletException,IOException{
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String username=req.getParameter("username");
		String QXFP = req.getParameter("QXFP");
		String XQZJ= req.getParameter("XQZJ");
		String LLXQ= req.getParameter("LLXQ");
		String YHXX= req.getParameter("YHXX");
		String XGMM= req.getParameter("XGMM");
		String WLSH= req.getParameter("WLSH");
		String MMCZ= req.getParameter("MMCZ");
	    String TJCX= req.getParameter("TJCX");
	    
	    PermissionBean perBean =new PermissionBean(username,QXFP, XQZJ, LLXQ,YHXX, XGMM, WLSH,MMCZ, TJCX);
	    PermissionDao perDao = new PermissionDao();
	    
	    //�ȼ���û����Ƿ��ظ�
	    boolean f=false;
	    f=perDao.check(username);
	    if(f)
	    {
	    	//�û�������
	    	resp.sendRedirect(req.getContextPath()+"/permission/addPermission.jsp?status=0");
	    }
	    else{
	    	boolean fl=false;
		    fl= perDao.add(perBean);
		    
		    if(fl)
		    {
		    	//��ӳɹ�
		    	resp.sendRedirect(req.getContextPath()+"/permission/addPermission.jsp?status=1");
		    }
		    else
		    {
		    	//���ʧ��
		    	resp.sendRedirect(req.getContextPath()+"/permission/addPermission.jsp?status=2");
		    }
	    }
	    
	   
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
