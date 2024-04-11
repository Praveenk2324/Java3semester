
public class Fish implements Prey,Predator {

	@Override
	public void hunt() {
		System.out.println("hunting small");
	}

	@Override
	public void flee() {
		System.out.println("escape");
	}
	

}
