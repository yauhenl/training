package com.yauhenl.training.easter;

import com.yauhenl.training.api.Event;

public class Easter implements Event {
    @Override
    public void congrats() {
        callNewStreams("Easter");
        System.out.println("Happy Easter!!!");
    }
}
