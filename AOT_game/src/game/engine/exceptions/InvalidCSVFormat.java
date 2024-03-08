package game.engine.exceptions;

import java.io.IOException;

public class InvalidCSVFormat extends IOException{
	private static final String MSG="Invalid input detected while reading csv file, input = \n";
	private String inputLine;
	
	public String getInputLine() {
		return inputLine;
	}
	public void setInputLine(String inputline) {
		this.inputLine = inputline;
	}
	public InvalidCSVFormat(String inputline) {
		super(MSG + inputline);
		this.inputLine=inputline;
	}
	public InvalidCSVFormat(String message,String inputline) {
		super(message);
		this.inputLine=inputline;
	}
	
	

}
