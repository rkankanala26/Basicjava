package q7;

public class UnderAgeException extends Exception{
	public UnderAgeException() {
		super("Exceiption:Under age Student. Not alloed to get the permit");
	}
	public UnderAgeException(String message) {
		super(message);
	}

}
