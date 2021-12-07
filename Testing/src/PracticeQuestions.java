import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PracticeQuestions {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
//		List list = new ArrayList();
//		list.add(10);
//		list.add(30);
//		list.add("ABC");
//		list.add("XYZ");
//		list.add("1A");
//		list.add(50.84);
//		for (Object object : list) {
//			System.out.println(object);
//		}
//		Collections.sort(list);
//		for (Object object : list) {
//			System.out.println(object);
//		}
//		PracticeQuestionTestMethod a = new PracticeQuestionTestMethod();
//		int b = 0;
//		System.out.println(a.test(b));
		try {
			Class c=Class.forName(args[0]);
			Object o = c.newInstance();
			System.out.println(o.getClass().getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
