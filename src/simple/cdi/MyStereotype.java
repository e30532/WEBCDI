package simple.cdi;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.enterprise.inject.Stereotype;
import javax.transaction.Transactional;

@Retention(RUNTIME)
@Target(TYPE)
@Stereotype
@MyLog
@Transactional(Transactional.TxType.REQUIRES_NEW)
public @interface MyStereotype {
}
