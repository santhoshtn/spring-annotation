package com.stackroute.domain;

import org.springframework.stereotype.Component;

@Component
public class Movie {
    private Actor actor;

    public Actor getActor() {
        return actor;
    }
    public Movie(){

    }
    public Movie(Actor actor){
        this.actor=actor;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}
