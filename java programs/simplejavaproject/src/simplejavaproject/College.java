package simplejavaproject;

public class College {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		College c1 = new College();
		c1.setName("PSNA");
		System.out.println(c1.getName());
		
		College c2 = new College();
		c2.setName("vit");
		System.out.println(c2.getName());
	}
}
