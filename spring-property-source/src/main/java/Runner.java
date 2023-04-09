import com.sample.AppConfiguration;
import com.sample.SpringBeanExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

  public static void main(String[] args) {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

    SpringBeanExample bean = context.getBean(SpringBeanExample.class);

    System.out.println(bean);

    context.registerShutdownHook();

  }

}