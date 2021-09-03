package application.exceptions;

public class CustomerNotFound extends RuntimeException {

	private static final long serialVersionUID = 6561759833036869504L;

	public CustomerNotFound(String message) {
		super(message);
	}

}
