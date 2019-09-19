package com.runnablepatterns.statepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that contains the logic for InProgress state.
 */
public class InProgress extends MyState {

	public InProgress(InvoicePreview _invoice) {
		super(_invoice);
	}
	
	@Override
	public void validate() {
		// specific step logic
		System.out.println("Invoice Preview created.");
		System.out.println("You can do any changes.");
		
		// change the state to pending
		getInvoice().setCurrentState(getInvoice().getPending());
	}

}
