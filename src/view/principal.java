package view;

import java.util.concurrent.Semaphore;

import controller.ativi;

public class principal {

	public static void main(String[] args) {
		Semaphore semaforo = new Semaphore(1);
		
		for (int threadId = 1; threadId < 22; threadId++) {
			Thread threadP = new ativi(threadId, semaforo);
			threadP.start();
		}
		
	}

}