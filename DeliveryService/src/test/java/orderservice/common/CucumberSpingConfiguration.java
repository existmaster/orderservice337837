package orderservice.common;

import io.cucumber.spring.CucumberContextConfiguration;
import orderservice.DeliveryServiceApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliveryServiceApplication.class })
public class CucumberSpingConfiguration {}
