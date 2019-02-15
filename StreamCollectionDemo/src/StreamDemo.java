import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamDemo {
	
	public static void main(String[] args) {
//		System.out.println(
//		IntStream
//		.range(1, 10)
//		.skip(5)
//		.sum());
		//System.out.println();
		//.forEach(x->System.out.print(x));
		String []names={"Ashu","Sidd","Kum"};
		Arrays.stream(names)
		.filter(x->x.startsWith("s"))
		.sorted()
		//.findFirst()
	//	.ifPresent(System.out.println());
		
		
		
	}

}
