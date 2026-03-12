package exceptions;

public class ResidentManagementService extends RuntimeException {
    public ResidentManagementService(String message) {
        super(message);
    }
}
