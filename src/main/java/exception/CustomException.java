package exception;

public class CustomException  extends  Exception{
    public CustomException(String message){
        super(message);
    }
    public CustomException(Throwable couse){
        super(couse);
    }

}
