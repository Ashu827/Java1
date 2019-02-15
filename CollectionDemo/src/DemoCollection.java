import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class DemoCollection {

	public static void main(String[] args) {
		List list3=new ArrayList ();
		ArrayList<String> list=new ArrayList<String>();
		
		
		list3.add(1);
		list3.add("kumar");
		
		int s=(int) list3.get(0);
		String s1=(String) list3.get(1);
		
		System.out.println("hi "+s);
		
//		ArrayList<String> list1=new ArrayList<String>();
//		list1.add("Kumar");
//		LinkedList<Integer> list2=new LinkedList<Integer>();
//		int size1=list2.size();
//		System.out.println(size1);
//		list2.add(2);
//		
//		
//		list3.addAll(list1);
//		list3.addAll(list2);
//		Iterator itr=list3.iterator();
//		 while(itr.hasNext()){
//		System.out.println(itr.next());
		}
	}
