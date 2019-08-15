package ru.ariona.springcontext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ariona.springcontext.quoter.Quoter;
import ru.ariona.springcontext.quoter.TerminatorQuoter;

@SpringBootApplication
public class SpringContextApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringContextApplication.class, args);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        while (true) {
            Thread.sleep(400);
            context.getBean(Quoter.class).sayQuote();
        }
    }

}
