package animalkingdom;

public class Bird extends Animal {

	public Bird(String name, int yearDiscovered) {
		super(name, yearDiscovered);
	}

	@Override
	String breath() {
		return "lungs";
	}

	@Override
	String move() {
		return "fly";
	}

	@Override
	String reproduce() {
		return "eggs";
	}
    
    
}