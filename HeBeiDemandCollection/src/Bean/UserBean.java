	package Bean;

public class UserBean {

	private String username;//�û���*
	private String password;//����*
	private String quancheng;//����ȫ��*
	private String guanli;//��ڹ�����
	private String address;//ͨѶ��ַ*
	private String stress;//���ڵ���*
	private String wangzhi;//��ַ
	private String email;//��������*
	private String daibiao;//�����Ǳ�*
	private String youbian;//��������
	private String chuanzhen;//����
	private String name;//��ϵ��*
	private String phone;//�ֻ�*
	private String quanxian;//Ȩ��
	
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
