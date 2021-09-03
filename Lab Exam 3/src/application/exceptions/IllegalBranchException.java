package application.exceptions;

public class IllegalBranchException extends RuntimeException {

	private static final long serialVersionUID = -7172817740670761648L;

	public IllegalBranchException() {	
	}

	public IllegalBranchException(String message) {
		super(message);
	}
	
}
