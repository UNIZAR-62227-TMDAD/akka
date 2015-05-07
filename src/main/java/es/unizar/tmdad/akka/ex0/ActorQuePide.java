package es.unizar.tmdad.akka.ex0;

import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.actor.ActorRef;

public class ActorQuePide extends UntypedActor {

	@Override
	public void preStart() {
		// Obtenemos una referencia a un actor que saluda
		final ActorRef saludador = getContext().actorOf(
				Props.create(ActorQueSaluda.class), "saludador");
		// Y le pedimos que haga su saludo
		saludador.tell(ActorQueSaluda.Msg.SALUDO, getSelf());
	}

	@Override
	public void onReceive(Object msg) {
		if (msg == ActorQueSaluda.Msg.HECHO) {
			// Cuando el que saluda nos dice que ya está, paramos a este actor
			getContext().stop(getSelf());
		} else
			unhandled(msg);
	}
}
