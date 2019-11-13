package simple.cdi;

import java.util.Random;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;

public class HelloProducer {
	@Produces
	@RequestScoped
    public Hello selectHello(@Hello1Qualifier Hello hello1,@Hello2Qualifier Hello hello2) {
		switch(decideHello()) {
        case 0:return hello1;
        case 1:return hello2;
		}
		return null;
	}
	
    private int decideHello() {
        Random rnd = new Random();
        int no = rnd.nextInt(10) % 2;
        return no;
    }

}
