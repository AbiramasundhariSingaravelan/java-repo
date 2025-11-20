import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> s1=new TreeSet<Integer>();
		s1.add(100);
		s1.add(200);
		s1.add(300);
		s1.add(400);
		s1.add(500);
		System.out.println("Initial Value of Set 1: "+s1);
		//s1.clear();
		//System.out.println("After Clear in S1:"+s1);
		Set<Integer> s2=new TreeSet<Integer>();
		s2.addAll(s1);
		System.out.println(s2);
		System.out.println("Is element 55 available: "+s1.contains(55));
		System.out.println("Is element 100 available: "+s1.contains(100));
		System.out.println("Is element 85 available: "+s1.contains(85));
		System.out.println("Is element 400 available: "+s1.contains(400));
		
		/*s2.add(100);
		s2.add(400);
		s2.add(600);
		s2.add(500);
		s2.addAll(s1);
		System.out.println("Union of Two Sets: "+s2);
		s2.retainAll(s1);
		System.out.println("Intersection:" +s2);
		s2.removeAll(s1);
		System.out.println("Difference between two sets: " +s2);*/
		
	}

}
