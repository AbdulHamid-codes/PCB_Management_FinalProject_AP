package CustomExceptions;
import java.lang.Exception;

public class EndDateGreaterThanStartDateException extends Exception{

	public EndDateGreaterThanStartDateException(String errorMsg) {
		super(errorMsg);
	}
}
