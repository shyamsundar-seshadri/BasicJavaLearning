import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

public class MyException extends Exception {
	private int detail;

	MyException(int a) {
		detail = a;
	}
	public String toString() {
		return "MyExcepiton[" + detail + "]";
	}
}