package com.yauhenl.training.main;

import com.yauhenl.training.api.Event;

import java.util.ServiceLoader;

public class Congratulator {
    public static void main(String[] args) {
        ServiceLoader<Event> loader = ServiceLoader.load(Event.class);
        if (!loader.iterator().hasNext()) {
            System.out.println("I have no congratulations!");
        }
        for (Event event : loader) {
            event.congrats();
        }
    }
}
