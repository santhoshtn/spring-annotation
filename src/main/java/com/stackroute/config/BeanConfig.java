package com.stackroute.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
    @Bean(name = "actor")
    public Actor getActorBean1() {
        Actor actor=new Actor("amit","male",22);
        return actor;
    }
    @Bean("movie")
    public Movie getMovieBean1(){
        return new Movie(getActorBean1());
    }
    @Bean("actor2")
    public Actor getActorBean2() {
        Actor actor=new Actor("santhosh","male",21);
        return actor;
    }
    @Bean("movie2")
    public Movie getMovieBean2(){
        return new Movie(getActorBean2());
    }
    @Bean("actor3")
    public Actor getActorBean3() {
        Actor actor=new Actor("uday","male",23);
        return actor;
    }
    @Bean("movie3")
    public Movie getMovieBean3(){
        return new Movie(getActorBean3());
    }

}
