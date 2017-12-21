package collaboproject2;

public class WineVO {
	private int no;
	private String name;
	private String country;
	private String type;
	private int sweet;
	private int body;
	private int price;
	private String company;
	private int vintage;
	private String food;
	
	public WineVO(int no, String name, String country, String type, int sweet, int body, int price, String company,
			int vintage, String food) {
		super();
		this.no = no;
		this.name = name;
		this.country = country;
		this.type = type;
		this.sweet = sweet;
		this.body = body;
		this.price = price;
		this.company = company;
		this.vintage = vintage;
		this.food = food;
	}
	public WineVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSweet() {
		return sweet;
	}
	public void setSweet(int sweet) {
		this.sweet = sweet;
	}
	public int getBody() {
		return body;
	}
	public void setBody(int body) {
		this.body = body;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getVintage() {
		return vintage;
	}
	public void setVintage(int vintage) {
		this.vintage = vintage;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public WineVO(int no, String name, int price, String company) {
		super();
		this.no=no;
		this.name = name;
		this.price = price;
		this.company = company;
	}
	
	
	
}
