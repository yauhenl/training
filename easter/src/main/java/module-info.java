module com.yauhenl.training.easter {
    requires transitive com.yauhenl.training.api;

    provides com.yauhenl.training.api.Event
            with com.yauhenl.training.easter.Easter;
}