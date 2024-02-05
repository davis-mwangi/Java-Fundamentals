import java.io.File;

public class FileProcessingException  extends RuntimeException{
    public FileProcessingException() {
        super();
    }

    public FileProcessingException(final String message){
        super(message);
    }

    public FileProcessingException(final String message, final Throwable cause){
        super(message,cause);
    }
}
