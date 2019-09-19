package com.runnablepatterns.statepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that contains the logic for Approved state.
 */
public class Approved extends MyState {

	public Approved(InvoicePreview _invoice) {
		super(_invoice);
	}
	
	@Override
	public void validate() {
		// specific step logic
		System.out.println("Invoice Preview was approved by your manager.");
		System.out.println("Invoice Preview ready to print.");
		
		// if flag is set to approved
		if(getInvoice().isApprove()) {
			getInvoice().setCurrentState(getInvoice().getClosed());
		}
		else {
			getInvoice().setCurrentState(getInvoice().getRejected());
		}
	}

}