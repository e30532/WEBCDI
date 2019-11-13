package simple.cdi;

import java.text.SimpleDateFormat;
import javax.annotation.Priority;
import javax.enterprise.context.Dependent;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor
@Dependent
@MyLog
@Priority(Interceptor.Priority.APPLICATION)
public class MyLogInterceptor {
	@AroundInvoke
	public Object invoke(InvocationContext ic) throws Exception{
		Object ret = null;
		try {
			System.out.println("start time: " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()));
			ret = ic.proceed();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("end time: " + new SimpleDateFormat("HH:mm:ss").format(System.currentTimeMillis()));
		return ret;
	}
}
