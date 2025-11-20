import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class streamsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> list=Arrays.asList(
				Arrays.asList("abc","def","xyz"),
				Arrays.asList("ghi","pqr","jkl"),
				Arrays.asList("mno","stw","xyz")
				
		);
		Set<String> result=new HashSet<>();
		
		List<String> result1 = (List<String>) list.stream()
				.flatMap(List::stream)//multiple collection object to single stream
				.filter(s->s.startsWith("x"))
				.map(String::toUpperCase);
		System.out.println(result);
	}

}
