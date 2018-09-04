//This program is used with NamedConstantsFinalDemo.java 
package inheritence;

public class ErrorMsg {

	// Error messages Named constants

	final int OUTPUTERR = 0;
	final int DISKERR = 1;
	final int IOERR = 2;
	final int IDXERR = 3;

	String msgs[] = { "Output Error", "Disk Error", "Input Output I/0 Error", "Index Errror" };

	String getErrorMsg(int i) {
		if (i >= 0 && i < msgs.length) {
			return msgs[i];
		} else {
			return "Invalid Error Code";
		}
	}

}
