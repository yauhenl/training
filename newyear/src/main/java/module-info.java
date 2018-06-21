module com.yauhenl.training.newyear {
    requires transitive com.yauhenl.training.api;

    provides com.yauhenl.training.api.Event
            with com.yauhenl.training.newyear.NewYear;
}