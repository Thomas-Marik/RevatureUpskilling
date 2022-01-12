package exception;

public class InsuffcientFundsException extends Exception{
    public InsuffcientFundsException(){
        super();
    }
    public InsuffcientFundsException(String msg){
        super(msg);

    }
    public InsuffcientFundsException(Throwable throwable){
        super(throwable);

    }
    public InsuffcientFundsException(String msg, Throwable throwable){
        super(msg,throwable);

    }
}
