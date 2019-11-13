package simple.cdi;

@Hello2Qualifier
public class HelloImpl2 implements Hello {
	@Override
	public String say(String name) {
		System.out.println(name);
		return "Hello2 " + name;
	}
}
