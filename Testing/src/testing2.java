import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class testing2 implements Comparable<testing2>{
	int K = 50;
	int V = 100;
	int user = 10;
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	public testing2() {
		this.K=K;
		this.V=V;
		this.user=user;
		for (int i = 0; i < user; i++) {
			map.put(K, V);
			K++;
			V++;
		}
	}
	
	public int compareTo(testing2 u) {
		if(K==u.K) {
			return 0;
		}else if(K<u.K) {
			return 1;
		}else {
			return -1;
		}
	}
}