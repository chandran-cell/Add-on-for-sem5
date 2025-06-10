package day3;
class Data{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name!=null && !name.isEmpty()) {
			this.name=name;
		}else {
			System.out.println("Invalid name!");
		}
	}
}

public class getterandsetter {
	public	static	void	main(String[]args) {
		Data s1=new Data();
		s1.setName("unknown");
		System.out.println("student Name:"+s1.getName());
	}

}