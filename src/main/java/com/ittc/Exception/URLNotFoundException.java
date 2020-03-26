package com.ittc.Exception;

public class URLNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5403487319360222829L;

	public URLNotFoundException() {
		super();
	}

	public URLNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public URLNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public URLNotFoundException(String message) {
		super(message);
	}

	public URLNotFoundException(Throwable cause) {
		super(cause);
	}

}
