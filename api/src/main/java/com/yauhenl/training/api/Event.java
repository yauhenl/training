package com.yauhenl.training.api;

import java.time.LocalDateTime;
import java.util.stream.Stream;

public interface Event {
    void congrats();

    default void callNewStreams(String eventName) {
        System.out.println(eventName + " " + callTime());
        Stream.iterate(0, i -> i < 10, i -> i + 1).forEach(System.out::println);
    }

    private String callTime() {
        return LocalDateTime.now().toString();
    }
}
