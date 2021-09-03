package application.exceptions;

public class DataAccessException extends RuntimeException{
	private static final long serialVersionUID = 240344519606393810L;

	public DataAccessException() {
	}
	
	public DataAccessException(String message) {
		super(message);
	}
}
