import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class MapCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<Integer,ArrayList<EmployeeBean>> map = new HashMap<Integer,ArrayList<EmployeeBean>>();
		
		int i =0;
		while(i<3){
			ArrayList<EmployeeBean> l = new ArrayList<EmployeeBean> ();
			EmployeeBean eb = new EmployeeBean();
			eb.setEmpId(1);
			eb.setName("Shyam");
			l.add(eb);
			map.put(eb.getEmpId(), l);
			i++;
		}
		EmployeeBean eb = new EmployeeBean();
		eb.setEmpId(2);
		eb.setName("Sundar");
		ArrayList<EmployeeBean> l = new ArrayList<EmployeeBean> ();
		l.add(eb);
		map.put(eb.getEmpId(), l);
		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry mapEntry = (Map.Entry) it.next();
			System.out.println("Key in the map is "+mapEntry.getKey() +
					" and the corresponding value is "+mapEntry.getValue().toString());
		}
		System.out.println(map);
	}

}
