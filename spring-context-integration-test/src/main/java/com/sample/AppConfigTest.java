import com.sample.entity.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigTest {

  @Bean
  public Employee employee() {
    return new Employee(101l, "Bishal");
  }

}
