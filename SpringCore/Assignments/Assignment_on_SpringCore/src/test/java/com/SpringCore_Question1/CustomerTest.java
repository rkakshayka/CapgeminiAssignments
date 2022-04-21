package com.SpringCore_Question1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CustomerTest {
    ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("SpringConfig.xml");
    Customer cust1 = (Customer) context.getBean("Customer");
    Customer cust2 = (Customer) context.getBean("Customer");
    Customer cust4 = (Customer) context.getBean("Customer");
    Customer cust5 = (Customer) context.getBean("Customer");

    @Test
    @DisplayName("Correct Details")
    void showDetails() {
        assertAll(
                () -> assertEquals(cust1,cust2,"They are supposed to be equal as they come from same bean"),
                () -> assertEquals(cust4,cust5,"They are supposed to be equal as they come from same bean")
        );
    }
}


