package bean;

public class BookType {
	private Integer id;
	private String name;
	private String writer;
	private Double price;
	private String image;
	private String descroption;
	private String classification;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescroption() {
		return descroption;
	}
	public void setDescroption(String descroption) {
		this.descroption = descroption;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public BookType(String name, String writer, Double price, String image, String descroption, String classification) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.image = image;
		this.descroption = descroption;
		this.classification = classification;
	}
	public BookType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookType(String name, String writer, Double price, String descroption, String classification) {
		super();
		this.name = name;
		this.writer = writer;
		this.price = price;
		this.descroption = descroption;
		this.classification = classification;
	}
	
}
