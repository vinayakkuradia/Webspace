package application.exceptions;

public class DaoException extends RuntimeException {

	private static final long serialVersionUID = -270091734188396588L;

	public DaoException(String message) {
		super(message);
	}

}
