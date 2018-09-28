package Bean;

public class PermissionBean {

	
	private String username;
	private String QXFP;
	private String XQZJ;
	private String LLXQ;
	private String YHXX;
	private String XGMM;
	private String WLSH;
	private String MMCZ;
	private String TJCX;
	
	public PermissionBean(){}
	
	public PermissionBean(String username, String qXFP, String xQZJ, String lLXQ, String yHXX, String xGMM, String wLSH,
			String mMCZ, String tJCX) {
		super();
		this.username = username;
		QXFP = qXFP;
		XQZJ = xQZJ;
		LLXQ = lLXQ;
		YHXX = yHXX;
		XGMM = xGMM;
		WLSH = wLSH;
		MMCZ = mMCZ;
		TJCX = tJCX;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getQXFP() {
		return QXFP;
	}

	public void setQXFP(String qXFP) {
		QXFP = qXFP;
	}

	public String getXQZJ() {
		return XQZJ;
	}

	public void setXQZJ(String xQZJ) {
		XQZJ = xQZJ;
	}

	public String getLLXQ() {
		return LLXQ;
	}

	public void setLLXQ(String lLXQ) {
		LLXQ = lLXQ;
	}

	public String getYHXX() {
		return YHXX;
	}

	public void setYHXX(String yHXX) {
		YHXX = yHXX;
	}

	public String getXGMM() {
		return XGMM;
	}

	public void setXGMM(String xGMM) {
		XGMM = xGMM;
	}

	public String getWLSH() {
		return WLSH;
	}

	public void setWLSH(String wLSH) {
		WLSH = wLSH;
	}

	public String getMMCZ() {
		return MMCZ;
	}

	public void setMMCZ(String mMCZ) {
		MMCZ = mMCZ;
	}

	public String getTJCX() {
		return TJCX;
	}

	public void setTJCX(String tJCX) {
		TJCX = tJCX;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
