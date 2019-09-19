package com.runnablepatterns.statepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Interface used to group all available states for InvoicePreview.
 */
public abstract class MyState {
	
	/**
	 * Variable used to store a reference to InvoicePreview
	 */
	private InvoicePreview invoice;
	
	/**
	 * Overloaded constructor used to received a reference to InvoicePreview
	 * @param _invoice
	 */
	public MyState(InvoicePreview _invoice) {
		setInvoice(_invoice);
	}
	
	/**
	 * Method used to perform required actions in the specific step
	 */
	public abstract void validate();

	/**
	 * @return the invoice
	 */
	public InvoicePreview getInvoice() {
		return invoice;
	}

	/**
	 * @param invoice the invoice to set
	 */
	public void setInvoice(InvoicePreview invoice) {
		this.invoice = invoice;
	}
}