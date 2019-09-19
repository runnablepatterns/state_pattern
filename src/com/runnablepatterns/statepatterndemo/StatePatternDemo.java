package com.runnablepatterns.statepatterndemo;

import com.runnablepatterns.statepattern.InvoicePreview;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class used to demonstrate State Pattern
 */
public class StatePatternDemo {

	public static void main(String[] args) {
		// create the invoice
		InvoicePreview invoice = new InvoicePreview();
		
		// first we force rejection flow
		invoice.setApprove(false);
		
		// start moving in the flow
		invoice.nextAction();
		invoice.nextAction();
		invoice.nextAction();
		// restart the invoice check
		invoice.setApprove(true);
		invoice.nextAction();
		invoice.nextAction();
		invoice.nextAction();
		invoice.nextAction();
	}

}
