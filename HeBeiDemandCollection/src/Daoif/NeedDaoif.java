package Daoif;

import java.util.List;

import Bean.NeedBean;

public interface NeedDaoif {

	public void add(NeedBean needBean);
	public List<NeedBean> getList();
	public NeedBean getNeedById(int id);
	public  void update(String pingjia, String submit, int id);
	public List<NeedBean> getListbytype(String xQMC, String jGMC, String sZDY, String gKGL, String jGSX,String kJHD);
	public java.util.List<String> getKJHDLX();
	public java.util.List<String> getXKFL(String kJHDLX);
	public java.util.List<String> getXQJSYYHY(String kJHDLX);
	public java.util.List<NeedBean> getListByFL(String kJHDLX, String fL);
	public List<NeedBean> chaxunlist(String search1,String find1,String beforeFind1,String afterFind1,
			String search2,String find2,String beforeFind2,String afterFind2,String logical1,
			String search3,String find3,String beforeFind3,String afterFind3,String logical2) throws Exception;
}
