package com.stackroute;

import com.stackroute.config.BeanConfig;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(BeanConfig.class);
        Movie movie= (Movie) context.getBean("movie");
        Movie movie1=(Movie) context.getBean("movie");
        System.out.println(movie==movie1);
    //    System.out.println(context.getBean("movie"));
    //    System.out.println(context.getBean("movie2"));
    //    System.out.println(context.getBean("movie3"));
        System.out.println(context.getBean("moviex"));

    }
}
