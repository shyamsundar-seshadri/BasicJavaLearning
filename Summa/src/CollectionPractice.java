import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;


public class CollectionPractice  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList al= new ArrayList();
		al.add(3); al.add(2); al.add(1);
		TreeSet ts = new TreeSet();
		System.out.println("ArrayList is "+al);
		for (int i=0; i<al.size();i++){
			ts.add(al.get(i));
		}
//		System.out.println(ts);
		
		EmployeeBean eb = new EmployeeBean();
		ArrayList<EmployeeBean> als = new ArrayList<EmployeeBean>();
		
		eb.setAge(10);
		eb.setEmpId(9);
		eb.setName("Shyam");
		
		als.add(eb);
		
		EmployeeBean eb1 = new EmployeeBean();
		eb1.setAge(11);
		eb1.setEmpId(8);
		eb1.setName("ganesh");
		
		als.add(eb1);
		
		EmployeeBean eb2 = new EmployeeBean();
		eb2.setAge(11);
		eb2.setEmpId(10);
		eb2.setName("ganesh");
		
		als.add(eb2);
		
		TreeMap tm = new TreeMap();
		
		for(int i = 0; i<als.size(); i++)
		{
			tm.put(als.get(i).getEmpId(), als.get(i));
			
		}
		System.out.println(tm);
		
		System.out.println(tm.keySet());
		
	}

}
