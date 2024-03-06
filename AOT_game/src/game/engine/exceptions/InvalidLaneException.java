package game.engine.exceptions;

public abstract class InvalidLaneException extends Exception {
	static final String MSG="Action done on invalid lane";
	
	public InvalidLaneException() {
		super(MSG);
	}
	public InvalidLaneException(String message) {
		super(message);
	}
	

}
