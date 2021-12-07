
public class PracticeQuestionTestMethod {

	int test(int a) {
		try {
			a = 10;
			return 100;
		} catch (Exception e) {
			// TODO: handle exception
			return 200;
		} finally {
			return 300;
		}
	}
}
