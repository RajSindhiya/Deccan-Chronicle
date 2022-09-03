import java.util.ArrayList;
import java.util.List;

public class TwoDWithOutHeader {
	
public static void main(String[] args) {
	List<ArrayList<String>>emp=new ArrayList<ArrayList<String>>();
	
	
	ArrayList<String>a1=new ArrayList<String>();
	a1.add("Sindhiya");
	a1.add("Dhiya");
	a1.add("Bessy");
	
	
	ArrayList<String>a2=new ArrayList<String>();
	a2.add("Suba");
	a2.add("Kutta");
	a2.add("Delhi");
	
	ArrayList<String>a3=new ArrayList<String>();
	a3.add("Samuel");
	a3.add("Sam");
	a3.add("Madurai");

	ArrayList<String>a4=new ArrayList<String>();
	a4.add("Suganthi");
	a4.add("Sugs");
	a4.add("VNR");
	
	//outerlist 
	
	emp.add(a1);
	emp.add(a2);
	emp.add(a3);
	emp.add(a4);
	
	// Retrive data from Outer List
	
	ArrayList<String> b = emp.get(1);
	String b1 = b.get(0);
	System.out.println(b1);
	
	System.out.println("**********Iteration*************");
	
	for (int i = 0; i < emp.size(); i++) {
		ArrayList<String> list = emp.get(i);
		for (int j = 0; j < list.size(); j++) {
			String list2 = list.get(j);
			
			System.out.println(list2);
		}
		
	}
	
}
	
	
	
	
	
	
	
	
}
