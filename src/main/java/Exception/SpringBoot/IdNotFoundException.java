package Exception.SpringBoot;

public class IdNotFoundException extends RuntimeException {
	@Override
	public String getMessage() {
		return "id not found ";
	}

}
