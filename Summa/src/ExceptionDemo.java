import java.util.Vector;

public class ExceptionDemo {
	
	Integer number;
	

	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws MyException {
//		try {
			String A="wkjdbwjkfbwkjsb";
			String A1=A;
			String A2=new String (A);
			int start=3;
			int end=5;
//			String a=A.getChars(start, end, A1, 0);
		
			
			String[] a1=A.split("j");
//			System.out.println(a1[1]+" "+a1[2]);
		
		
//			String S = "skj";
//			String S1 = "ysg";
//			int i=9;
//			System.out.println(S+S1);
//			System.out.println(S1.concat(S).concat(S));
//			System.out.println(S.toString());
//			
//			ExceptionDemo	exceptionDemo = new ExceptionDemo();
			
//			exceptionDemo.number.toString();
			
			Vector V=new Vector(1,3);
			V.addElement(5);
			
			
			System.out.println("First element is "+V.firstElement());
			System.out.println("Capacity is "+V.capacity());
			
			V.addElement(7);
			
			System.out.println("V contains "+V.contains(1) != null? "Y":"N");
			System.out.println("Capacity is "+V.capacity());
		
			
			System.out.println("Vector size is "+V.size());
			V.addElement(10);
			System.out.println("Capacity is "+V.capacity());
			System.out.println("Vector size is "+V.size());
			V.remove(0);
			V.removeElement(10);
			int index = V.indexOf(10);
			
			
			System.out.println("Capacity is "+V.capacity());
			System.out.println("Vector size is "+V.size());
			System.out.println("Vector Index is "+index);
			String a=V.contains(7)?"Y":"N";
			System.out.println("A value is"+ a);
			
			if(V.contains(10)){
				System.out.println("Contains. Value is "+V.firstElement());
			}else System.out.println("Not Contain"+V.firstElement());
			System.out.println("Element at 0 is "+V.elementAt(0));
		}
//			compute(1);
//			compute(20);
//			System.out.println("Done");
//		} catch (MyException e) {
//			System.out.println("Caught "+ e );
//		}
//
//	}

	private static void compute(int i) throws MyException {
//		System.out.println("Called Compute " + i);
		if (i > 10) {
//			System.out.println("Abnormal");
//			throw new MyException(i);
		}
//		System.out.println("Normal");
	}

}
