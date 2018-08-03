package stuff_factory;

public class Main {
	public static void main(String[] args) {
		Human human = HumanFactory.createHuman(White.class.getName());
		human.doSomething();
		human.laugh();
	}
}
