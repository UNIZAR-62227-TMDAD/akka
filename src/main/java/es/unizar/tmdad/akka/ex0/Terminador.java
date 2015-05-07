package es.unizar.tmdad.akka.ex0;

import akka.actor.ActorRef;
import akka.actor.Terminated;
import akka.actor.UntypedActor;

public class Terminador extends UntypedActor {		
	private final ActorRef ref;

	public Terminador(ActorRef ref) {
		this.ref = ref;
		// registramos al actor Terminador como Monitor del actor ref
		// de esa forma recibirá un mensaje de Terminated cuando
		// ref se termine
		getContext().watch(ref);
	}

	@Override
	public void onReceive(Object msg) {
		if (msg instanceof Terminated) {
			System.out.println("El actor " + ref.path() +
					" del que somos monitores, ha terminado. Cerramos la aplicación...");
			getContext().system().shutdown();
		} else {
			unhandled(msg);
		}
	}
}
