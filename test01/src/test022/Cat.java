package test022;

public class Cat extends SoundableExample {
	private Cat sound;
	
	public Cat() {
		this("Cat");
		System.out.print(new Cat());
	}
	
	public void setSound(Cat sound) {
		this.sound = sound;
	}
	public Cat(String soundable) {
		this.setSound(new Cat());
		 printSound((Soundable) new Cat());
		}
    }

