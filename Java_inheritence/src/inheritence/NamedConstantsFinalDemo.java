package inheritence;

import inheritence.ErrorMsg;

public class NamedConstantsFinalDemo {

	public static void main(String[] args) {
		ErrorMsg obj_err=new ErrorMsg();
		ErrorMsg obj_err1=new ErrorMsg();
	
		System.out.println(obj_err.equals(obj_err1));
	
		System.out.println("Error code " + obj_err.DISKERR + " refers to " + obj_err.getErrorMsg(obj_err.DISKERR));
		System.out.println("Error code " + obj_err.IOERR + " refers to " + obj_err.getErrorMsg(obj_err.IOERR));
		System.out.println("Error code " + obj_err.OUTPUTERR + " refers to " + obj_err.getErrorMsg(obj_err.OUTPUTERR));
		System.out.println("Error code " + obj_err.IDXERR + " refers to " + obj_err.getErrorMsg(obj_err.IDXERR));
		System.out.println("Error code 4" + " refers to " + obj_err.getErrorMsg(4));
		System.out.println("Error code 5" + " refers to " + obj_err.getErrorMsg(5));
		System.out.println(obj_err.toString());
		
		System.out.println(obj_err.equals(obj_err1));
		
		
		
		
	}

}
