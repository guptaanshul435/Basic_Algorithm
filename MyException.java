class MyException extends RuntimeException{


public MyException(String message){
	super(message);
}


}
class LaterImp extends RuntimeException{
	
	LaterImp(String message){
		super(message);
	}
	
}