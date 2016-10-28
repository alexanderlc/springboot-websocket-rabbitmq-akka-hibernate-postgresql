package com.example.model.user;

import akka.actor.UntypedActor;

/**
 * Created by chenhao on 2016/10/20.
 */
public class ActorB extends UntypedActor {
    @Override
    public void onReceive(Object message) throws Throwable {
        if (message instanceof String) {
            System.out.println(message);
        } else {
            unhandled(message);
        }
    }
}
