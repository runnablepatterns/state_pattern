package com.runnablepatterns.statepattern;

/**
 * 
 * @author Carlos Marin
 * Runnable Patterns (runnablepatterns.com)
 * 
 * Class that contains the logic of InvoicePreview object.
 */
public class InvoicePreview {

	/**
	 * Variables used to store states
	 */
	private MyState inProgress;
	private MyState pending;
	private MyState rejected;
	private MyState approved;
	private MyState closed;
	
	/**
	 * Variable used to keep track of current step
	 */
	private MyState currentState;
	
	/**
	 * Variable used as a flag to change InvoicePreview steps for demonstration only
	 */
	private boolean approve = false;
	
	/**
	 * Constructor used to initialice entity
	 */
	public InvoicePreview() {
		setInProgress(new InProgress(this));
		setPending(new Pending(this));
		setRejected(new Rejected(this));
		setApproved(new Approved(this));
		setClosed(new Closed(this));
		setCurrentState(getInProgress());
	}
	
	/**
	 * Perform next action according to the step
	 */
	public void nextAction() {
		getCurrentState().validate();
	}


	/**
	 * @return the inProgress
	 */
	public MyState getInProgress() {
		return inProgress;
	}


	/**
	 * @param inProgress the inProgress to set
	 */
	public void setInProgress(MyState inProgress) {
		this.inProgress = inProgress;
	}


	/**
	 * @return the pending
	 */
	public MyState getPending() {
		return pending;
	}


	/**
	 * @param pending the pending to set
	 */
	public void setPending(MyState pending) {
		this.pending = pending;
	}


	/**
	 * @return the rejected
	 */
	public MyState getRejected() {
		return rejected;
	}


	/**
	 * @param rejected the rejected to set
	 */
	public void setRejected(MyState rejected) {
		this.rejected = rejected;
	}


	/**
	 * @return the approved
	 */
	public MyState getApproved() {
		return approved;
	}


	/**
	 * @param approved the approved to set
	 */
	public void setApproved(MyState approved) {
		this.approved = approved;
	}


	/**
	 * @return the closed
	 */
	public MyState getClosed() {
		return closed;
	}


	/**
	 * @param closed the closed to set
	 */
	public void setClosed(MyState closed) {
		this.closed = closed;
	}


	/**
	 * @return the currentState
	 */
	public MyState getCurrentState() {
		return currentState;
	}


	/**
	 * @param currentState the currentState to set
	 */
	public void setCurrentState(MyState currentState) {
		this.currentState = currentState;
	}


	/**
	 * @return the approve
	 */
	public boolean isApprove() {
		return approve;
	}


	/**
	 * @param approve the approve to set
	 */
	public void setApprove(boolean approve) {
		this.approve = approve;
	}
}