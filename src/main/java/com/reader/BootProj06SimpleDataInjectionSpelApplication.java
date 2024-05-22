package com.reader;

import com.reader.sbeans.DiagnosticCenterDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootProj06SimpleDataInjectionSpelApplication {

    public static void main(String[] args) {
        //get IOC container
        ApplicationContext ctx = SpringApplication.run(BootProj06SimpleDataInjectionSpelApplication.class, args);
        //get Spring bean class obj ref
        DiagnosticCenterDetails details = ctx.getBean("dcDetails", DiagnosticCenterDetails.class);
        System.out.println(details);

        //close the container
        ((ConfigurableApplicationContext) ctx).close();
    }

}
