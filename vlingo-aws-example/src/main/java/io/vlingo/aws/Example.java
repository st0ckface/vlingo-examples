package io.vlingo.aws;

import io.vlingo.actors.World;


public class Example {

    public static void main(String... args){
        final World world = World.startWithDefaults("playground");
//        final TestUntil until = TestUntil.happenings(1);
//        final Pinger pinger = world.actorFor(Pinger.class, PingerActor.class, until);
//        final Ponger ponger = world.actorFor(Ponger.class, PongerActor.class);
//
//        pinger.ping(ponger);
//
//        until.completes();
//
//        world.terminate();
    }
}
