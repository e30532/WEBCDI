package simple.cdi;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.event.Observes;
import javax.inject.Named;
import javax.transaction.Transactional;

@Named("hello")
@Hello1Qualifier
@MyStereotype
public class HelloImpl implements Hello, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public String say(String name) {
		System.out.println(name);
		return "Hello " + name;
	}
	
	@PostConstruct
	public void setup() {
		System.out.println("setup..");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy..");
	}
	
	public void onMyEvent(@Observes MyEvent event) {
		System.out.println(event.getMsg());
	}
}
