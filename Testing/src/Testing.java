import java.util.*;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Testing {

//	public static void main(String[] args){
//		
//		String message = "Hello";
//		print(message);
//		message += "World!";
//		print(message);
//	}
//	static void print(String message){
//		 System.out.print(message);
//		 message += " ";
//	}
	
	public static void main(String[] args){
		ArrayList<Integer> array = new ArrayList<Integer>();
		savelist(map, array);
		System.out.println("List of users printed from array in decreasing order");
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}
		private static ArrayList<Integer> savelist(HashMap<Integer, Integer> map, ArrayList<Integer> array) {
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				Integer key = entry.getKey();
				Integer val = entry.getValue();
				array.add(key);
			}
			return array;
		}
//		private static HashMap<Integer, Integer> createMap(HashMap<Integer, Integer> map, 
//				int K, int V,Scanner scan) {
//			
//			System.out.println("Added "+user+" users");
//			for (int i = 0; i < user; i++) {
//				map.put(K, V);
//				K++;
//				V++;
//			}
//			return map;
//		}
		//////////////////////////////////////////////////////////////////////////////
		//look up and understand the numbericl order in runtime
		//long l = 244324245353l;
		//int l = (int) 244324245353l;
		
//		Human a = new Human();
//		Human bolt = new Human(2);
//		System.out.println(a);
//		System.out.println(bolt);
		
//		String s1 = "Levi";
//		String s2 = new String("Levi");
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		Scanner scan = new Scanner(System.in);
//		boolean flag = true;
//		while(flag) {
//			try {
//				System.out.println("enter any nother other than 0.(100 to terminate)");
//				int input = scan.nextInt();
//				int i = 1/input;
//				System.out.println("you entered: "+input);
//				if(input==100) {
//					flag=false;
//					System.out.println("Terminating successfully, hope to see you again");
//				}
//			} catch (Exception e) {
//				System.out.println("Please do not enter 0");
//			}
//		}
		///////////////////////////////////////////////////////////////////////////
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number");
//		// example long Number = 33355552287110l;
//		String number = scan.next();
//		int check = 1;
//		int count = 1;
//		StringBuilder SB = new StringBuilder();
//		
//		try {
//			for (int i = 0; i < number.length(); i++) {
//				int test = number.charAt(i);
//				if(test == 48) throw new CustomException("number Conatins 0");
//					//System.out.println(number.charAt(check/0));
//			}
//			while(check < number.length()-1){
//				if(number.charAt(check) == number.charAt(check-1)) {
//					count++;
//				} else {
//					SB.append(number.charAt(check-1));
//					SB.append(count);
//					count = 1;
//				}
//				check++;
//			}
//			if(number.length() > 1) {
//				if(number.charAt(number.length()-1)==number.charAt(number.length()-2)) {
//					count++;
//				} else {
//					SB.append(number.charAt(check-1));
//					SB.append(count);
//					count = 1;
//				}
//				SB.append(number.charAt(number.length()-1));
//				SB.append(count);
//			}
//	        number = SB.toString();
//	        System.out.println("result: "+ number);
//		} catch (Exception e) {
//			//e.printStackTrace();
//			System.out.println("Please do not use a zero.");
//			System.out.println("Enter a number");
//			// example long Number = 33355552287110l;
//			number = scan.next();
//		}
	}
}