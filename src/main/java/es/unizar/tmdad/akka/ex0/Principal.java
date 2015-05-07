package es.unizar.tmdad.akka.ex0;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Principal {

	public static void main(String[] args) {
		ActorSystem system = ActorSystem.create("Hola");
		ActorRef a = system.actorOf(Props.create(ActorQuePide.class), 
				"actorQuePideSaludo");	
		// terminador monitorizará al 'actor que pide saludo' a que acabamos de crear 
		system.actorOf(Props.create(Terminador.class, a), "terminador");
	}
}
