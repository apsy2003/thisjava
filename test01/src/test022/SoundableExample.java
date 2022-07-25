package test022;

public class SoundableExample {

	protected static void printSound(Soundable soundable) {
			System.out.println(soundable.sound());
		}
		
		public static void main(String[] args) {
			printSound((Soundable) new Cat());
			printSound((Soundable) new Dog());
		}
	}

