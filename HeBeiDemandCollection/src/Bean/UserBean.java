	package Bean;

public class UserBean {

	private String username;//用户名*
	private String password;//密码*
	private String quancheng;//机构全称*
	private String guanli;//归口管理部门
	private String address;//通讯地址*
	private String stress;//所在地区*
	private String wangzhi;//网址
	private String email;//电子信箱*
	private String daibiao;//法人嗲表*
	private String youbian;//邮政编码
	private String chuanzhen;//传真
	private String name;//联系人*
	private String phone;//手机*
	private String quanxian;//权限
	
	public String getQuanxian() {
		return quanxian;
	}

	public void setQuanxian(String quanxian) {
		this.quanxian = quanxian;
	}

	public UserBean(){}
	
	public UserBean(String username,String password){
		this.username = username;
		this.password = password;
	}
	
	public UserBean(String username,String password,String quancheng,String guanli,String address,String stress,
			String wangzhi,String Email,String daibiao,String youbian,String chuanzhen,String name,String phone)
	{
		this.username = username;
		this.password = password;
		this.quancheng = quancheng;
		this.guanli = guanli;
		this.address = address;
		this.stress = stress;
		this.wangzhi = wangzhi;
		this.email = Email;
		this.daibiao = daibiao;
		this.youbian = youbian;
		this.chuanzhen = chuanzhen;
		this.name = name;
		this.phone = phone;
		
	}
	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getQuancheng() {
		return quancheng;
	}



	public void setQuancheng(String quancheng) {
		this.quancheng = quancheng;
	}



	public String getGuanli() {
		return guanli;
	}



	public void setGuanli(String guanli) {
		this.guanli = guanli;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getStress() {
		return stress;
	}



	public void setStress(String stress) {
		this.stress = stress;
	}



	public String getWangzhi() {
		return wangzhi;
	}



	public void setWangzhi(String wangzhi) {
		this.wangzhi = wangzhi;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDaibiao() {
		return daibiao;
	}



	public void setDaibiao(String daibiao) {
		this.daibiao = daibiao;
	}



	public String getYoubian() {
		return youbian;
	}



	public void setYoubian(String youbian) {
		this.youbian = youbian;
	}



	public String getChuanzhen() {
		return chuanzhen;
	}



	public void setChuanzhen(String chuanzhen) {
		this.chuanzhen = chuanzhen;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
