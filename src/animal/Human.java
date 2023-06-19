package animal;

public class Human extends Animal implements Thinkable {
	private String hobby;

	Human(){

	}

	Human(String name,int age,String hobby){
		super(name,age);
		setHobby(hobby);
	}

	@Override
	public void think() {
		 System.out.println("私は"+getHobby()+"について考えています。");

	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
