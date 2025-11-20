import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> studList=new ArrayList<Integer>();
		studList.add(100);//0
		studList.add(200);//1
		studList.add(300);//2
		studList.add(400);//3
		studList.add(200);//4
		studList.add(500);//4
		studList.add(400);//5
		studList.remove(4);
		//Updating a list
		studList.set(5, 800);
		//Searching a list
		System.out.println("Value available in the index: "+studList.indexOf(200));
		System.out.println("Value available in the index: "+studList.lastIndexOf(200));
   
		System.out.println(studList);
		
		
	}

}
