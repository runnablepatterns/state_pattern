package com.runnablepatterns.statepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that contains the logic for Rejected state.
 */
public class Rejected extends MyState {

	public Rejected(InvoicePreview _invoice) {
		super(_invoice);
	}
	
	@Override
	public void validate() {
		// specific step logic
		System.out.println("Invoice Preview didn't meet manager requirements, please check again.");
		
		// change to in progress
		getInvoice().setCurrentState(getInvoice().getInProgress());
	}

}
