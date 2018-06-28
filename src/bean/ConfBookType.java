package bean;

public class ConfBookType {
	private Integer id;
	private String name;
	private String descroption;
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
	public String getDescroption() {
		return descroption;
	}
	public void setDescroption(String descroption) {
		this.descroption = descroption;
	}
	public ConfBookType(Integer id, String name, String descroption) {
		super();
		this.id = id;
		this.name = name;
		this.descroption = descroption;
	}
	public ConfBookType( String name, String descroption) {
		super();
		
		this.name = name;
		this.descroption = descroption;
	}
	public ConfBookType() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
