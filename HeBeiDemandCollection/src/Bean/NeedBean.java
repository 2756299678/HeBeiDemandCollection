package Bean;

public class NeedBean {

	//需求调查信息表
	private int id;//id*主键
	private String quancheng;//机构全称*
	private String guanli;//归口管理部门
	private String address;//通讯地址*
	private String stress;//所在地区*
	private String wangzhi;//网址
	private String email;//电子信箱*
	private String daibiao;//法人代表*
	private String youbian;//邮政编码
	private String chuanzhen;//传真
	private String name;//联系人*
	private String phone;//手机* 
	private String JGSX;//机构属性*
	private String JGJJ;//机构简介*
	private String XQMC;//需求名称*
	private String XUKSSJ;//需求开始时间*
	private String XQJSSJ;//需求结束时间*
	private String ZYWT;//主要问题*
	private String JSGJ;//技术关键*
	private String YQMB;//预期目标*
	private String GJZ;//关键字*
	private String NTRZJZE;//拟投入总金额
	private String JSXQJJFS;//技术需求解决方式*
	private String HZYXDW;//合作意向单位
	private String KJHDLX;//科技活动类型*
	private String XKFL;//学科分类
	private String XQJSSSLY;//需求技术所属领域
	private String XQJSYYHY;//需求技术应用行业
	private String status;
	private String create_date;
	private String pingjia;

	
	public NeedBean(){}
	
	public NeedBean( String quancheng, String guanli, String address, String stress, String wangzhi,
			String email, String daibiao, String youbian, String chuanzhen, String name, String phone, String jGSX,
			String jGJJ, String xQMC, String xUKSSJ, String xQJSSJ, String zYWT, String jSGJ, String yQMB, String gJZ,
			String nTRZJZE, String jSXQJJFS, String hZYXDW, String kJHDLX, String xKFL, String xQJSSSLY,
			String xQJSYYHY) {
		super();
		this.quancheng = quancheng;
		this.guanli = guanli;
		this.address = address;
		this.stress = stress;
		this.wangzhi = wangzhi;
		this.email = email;
		this.daibiao = daibiao;
		this.youbian = youbian;
		this.chuanzhen = chuanzhen;
		this.name = name;
		this.phone = phone;
		JGSX = jGSX;
		JGJJ = jGJJ;
		XQMC = xQMC;
		XUKSSJ = xUKSSJ;
		XQJSSJ = xQJSSJ;
		ZYWT = zYWT;
		JSGJ = jSGJ;
		YQMB = yQMB;
		GJZ = gJZ;
		NTRZJZE = nTRZJZE;
		JSXQJJFS = jSXQJJFS;
		HZYXDW = hZYXDW;
		KJHDLX = kJHDLX;
		XKFL = xKFL;
		XQJSSSLY = xQJSSSLY;
		XQJSYYHY = xQJSYYHY;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getJGSX() {
		return JGSX;
	}

	public void setJGSX(String jGSX) {
		JGSX = jGSX;
	}

	public String getJGJJ() {
		return JGJJ;
	}

	public void setJGJJ(String jGJJ) {
		JGJJ = jGJJ;
	}

	public String getXQMC() {
		return XQMC;
	}

	public void setXQMC(String xQMC) {
		XQMC = xQMC;
	}

	public String getXUKSSJ() {
		return XUKSSJ;
	}

	public void setXUKSSJ(String xUKSSJ) {
		XUKSSJ = xUKSSJ;
	}

	public String getXQJSSJ() {
		return XQJSSJ;
	}

	public void setXQJSSJ(String xQJSSJ) {
		XQJSSJ = xQJSSJ;
	}

	public String getZYWT() {
		return ZYWT;
	}

	public void setZYWT(String zYWT) {
		ZYWT = zYWT;
	}

	public String getJSGJ() {
		return JSGJ;
	}

	public void setJSGJ(String jSGJ) {
		JSGJ = jSGJ;
	}

	public String getYQMB() {
		return YQMB;
	}

	public void setYQMB(String yQMB) {
		YQMB = yQMB;
	}

	public String getGJZ() {
		return GJZ;
	}

	public void setGJZ(String gJZ) {
		GJZ = gJZ;
	}

	public String getNTRZJZE() {
		return NTRZJZE;
	}

	public void setNTRZJZE(String nTRZJZE) {
		NTRZJZE = nTRZJZE;
	}

	public String getJSXQJJFS() {
		return JSXQJJFS;
	}

	public void setJSXQJJFS(String jSXQJJFS) {
		JSXQJJFS = jSXQJJFS;
	}

	public String getHZYXDW() {
		return HZYXDW;
	}

	public void setHZYXDW(String hZYXDW) {
		HZYXDW = hZYXDW;
	}

	public String getKJHDLX() {
		return KJHDLX;
	}

	public void setKJHDLX(String kJHDLX) {
		KJHDLX = kJHDLX;
	}

	public String getXKFL() {
		return XKFL;
	}

	public void setXKFL(String xKFL) {
		XKFL = xKFL;
	}

	public String getXQJSSSLY() {
		return XQJSSSLY;
	}

	public void setXQJSSSLY(String xQJSSSLY) {
		XQJSSSLY = xQJSSSLY;
	}

	public String getXQJSYYHY() {
		return XQJSYYHY;
	}

	public void setXQJSYYHY(String xQJSYYHY) {
		XQJSYYHY = xQJSYYHY;
	}
	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getPingjia() {
		return pingjia;
	}

	public void setPingjia(String pingjia) {
		this.pingjia = pingjia;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
