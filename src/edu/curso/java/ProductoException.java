package edu.curso.java;

public class ProductoException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4686686063868838708L;
	
	public ProductoException (String msg) {
		super(msg);
	}
	public ProductoException(String msg, Throwable e) {
		super(msg, e);
	}
}
