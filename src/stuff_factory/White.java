package stuff_factory;

public class White implements Human ,Soul{

	@Override
	public void laugh() {
		System.out.println("white people can laugh");
	}

	@Override
	public void doSomething() {
        System.out.println("white people can do someThing");
	}

	@Override
	public void think() {
		System.out.println("think about myself");
	}

}
