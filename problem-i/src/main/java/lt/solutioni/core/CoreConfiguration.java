package lt.solutioni.core;

import lt.solutioni.core.service.DateService;
import lt.solutioni.core.service.PersonService;
import lt.solutioni.core.service.impl.DateServiceImpl;
import lt.solutioni.core.service.impl.PersonServiceImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "lt.solutioni.core" })
public class CoreConfiguration {

    @Bean
    public DateService getDateService() {
        return new DateServiceImpl();
    }

    @Bean
    public PersonService getPersonService() {
        return new PersonServiceImpl();
    }

}