import java.util.Scanner;
import java.util.Vector;
import java.util.Arrays;
public class VectorEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vector<Vector<String>> v=new Vector<>();
		Vector<String> inchon=new Vector<>();
		inchon.add("동구"); inchon.add("중구");
		inchon.add("서구"); inchon.add("미추홀");
		
		Vector<String> seoul=new Vector<>(Arrays.asList("용산구","중량구","강남구","강서구"));
		
		v.add(inchon); v.add(seoul);
		
		System.out.print("원하는도시:");
		String city=sc.next();
		Vector<String>vi;
		switch(city) {
		case "inchon":
			vi=v.get(0); break;
		case "seoul":
			vi=v.get(1); break;
		default:
			vi=null;
		
		}
		if(vi!=null) {
	  
				for(String gu : vi)
	            System.out.println(vi.get(0));
	      }
	   }

	}