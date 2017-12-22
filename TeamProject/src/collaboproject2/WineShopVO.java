package collaboproject2;

public class WineShopVO {
	
	private int idx;
	private String id;
	private String pw;
	private int age;
	private String purwine;
	private int purmoney;
	private String paytype;
	
	public WineShopVO(String id, String pw, int age) {
		super();
		
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public WineShopVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getPurwine() {
		return purwine;
	}
	public void setPurwine(String purwine) {
		this.purwine = purwine;
	}
	public int getPurmoney() {
		return purmoney;
	}
	public void setPurmoney(int purmoney) {
		this.purmoney = purmoney;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public WineShopVO(int idx, String id, String pw, int age) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	public WineShopVO(String id, String purwine, int purmoney, String paytype) {
		super();
		this.id = id;
		this.purwine = purwine;
		this.purmoney = purmoney;
		this.paytype = paytype;
	}
	
}
