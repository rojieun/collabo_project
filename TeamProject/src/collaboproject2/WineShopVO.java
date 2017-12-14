package collaboproject2;

public class WineShopVO {
	
	private int idx;
	private String id;
	private String pw;
	private int age;
	
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
	public WineShopVO(int idx, String id, String pw, int age) {
		super();
		this.idx = idx;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
}
