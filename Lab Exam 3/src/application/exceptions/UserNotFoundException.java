package application.exceptions;

public class UserNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 240344519606393810L;

	public UserNotFoundException() {
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
}
