package animal;

public class Animal {
	private String name;
	private int age;

	public Animal () {

	}

	public Animal (String name,int age) {
		setname(name);
		setAge(age);

	}

	public void say() {
		 System.out.println(getname()+"です。"+getAge()+"歳です。");
	}


	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


}
