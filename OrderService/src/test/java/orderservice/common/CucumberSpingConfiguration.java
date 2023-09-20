package orderservice.common;

import io.cucumber.spring.CucumberContextConfiguration;
import orderservice.OrderServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OrderServiceApplication.class })
public class CucumberSpingConfiguration {}
