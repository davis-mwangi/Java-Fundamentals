public class NotAuthenticatedException  extends RuntimeException{

    public NotAuthenticatedException(){
        super();
    }

    public  NotAuthenticatedException(final String message){
        super(message);
    }

    public  NotAuthenticatedException(final String msg, final Throwable cause){
         super(msg, cause);
    }
}
