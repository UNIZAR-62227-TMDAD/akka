package es.unizar.tmdad.akka.ex0;

import akka.actor.UntypedActor;

public class ActorQueSaluda extends UntypedActor {

	public static enum Msg {
		SALUDO, HECHO;
	}

	@Override
	public void onReceive(Object msg) {
		// Si me piden que salude...
		if (msg == Msg.SALUDO) {
			// ... pues saludo
			System.out.println("Hola, qué tal!");
			// y le digo al que lo pidió que ya lo he hecho
			getSender().tell(Msg.HECHO, getSelf());
		} else
			unhandled(msg);
	}
}
