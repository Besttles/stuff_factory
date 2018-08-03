package stuff_factory;

public class Main {
	public static void main(String[] args) {
		Human human = HumanFactory.createHuman(White.class.getName());
		human.doSomething();
		human.laugh();
		
		Soul soul = (Soul)HumanFactory.createThing( White.class.getName());
		soul.think();
		Human hu = (Human)HumanFactory.createThing(White.class.getName());
		hu.laugh();
		hu.doSomething();
	}
}
