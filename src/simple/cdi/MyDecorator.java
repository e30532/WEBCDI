package simple.cdi;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;
import javax.interceptor.Interceptor;

@Decorator
@Priority(Interceptor.Priority.APPLICATION)
public class MyDecorator implements Hello{
	
	@Inject
	@Delegate
	@Any
	private Hello hello;

	@Override
	public String say(String name) {
		String text = hello.say(name);
		return "*" + text + "*";
	}
}
