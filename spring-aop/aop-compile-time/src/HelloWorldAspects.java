
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;


@Aspect
public class HelloWorldAspects {


  @After("execution (* HelloWorld.greet(..))" )
  public void greetAspect() {
   System.out.println(" Bishal ");
  }

}
