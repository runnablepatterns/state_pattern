package com.runnablepatterns.statepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that contains the logic for Closed state.
 */
public class Closed extends MyState {

	public Closed(InvoicePreview _invoice) {
		super(_invoice);
	}
	
	@Override
	public void validate() {
		// specific step logic
		System.out.println("Invoice Preview printed.");
		System.out.println("Invoice Preview is now a valid invoice.");
	}

}