package game.engine.exceptions;

import java.io.IOException;

public class InvalidCSVFormat extends IOException{
	private static final String MSG="Invalid input detected while reading csv file, input = \n";
	private String inputline;
	
	public String getInputlines() {
		return inputline;
	}
	public void setInputlines(String inputline) {
		this.inputline = inputline;
	}
	public InvalidCSVFormat(String inputline) {
		super(MSG + inputline);
		this.inputline=inputline;
	}
	public InvalidCSVFormat(String message,String inputline) {
		super(message + inputline);
		this.inputline=inputline;
	}
	
	

}
