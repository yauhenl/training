package com.yauhenl.training.newyear;

import com.yauhenl.training.api.Event;

public class NewYear implements Event {
    @Override
    public void congrats() {
        System.out.println("Happy new year");
    }
}
