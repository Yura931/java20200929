package chap14.lecture.api.comparator;

public class Memeber {
	private int id;
	private String name;
	
	public Memeber(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Memeber [id=" + id + ", name=" + name + "]";
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
