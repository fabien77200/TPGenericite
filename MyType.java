package domaine;

public class MyType {

	private String name;

	public MyType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "MyType name=" + name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
