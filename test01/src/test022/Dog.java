package test022;

public class Dog extends SoundableExample {
	private Dog sound;
	
	public Dog() {
		this("Dog");
		System.out.print(new Dog());
	}
	
	public void setSound(Dog sound) {
		this.sound = sound;
	}
	public Dog(String soundable) {
		this.setSound(new Dog());
		 printSound((Soundable) new Dog());
		}
    }
/*
	public char[] sound() {
		// TODO Auto-generated method stub
		return null;
	}
}*/
