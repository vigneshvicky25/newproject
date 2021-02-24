package org.wlt;

	import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

	import org.wlt.UserDefine;


	public class UserDefine1 {
		
		public static void main(String[] args) {
			
			
			
			
			UserDefine u = new UserDefine();
			u.setId(10);
			u.setName("Vicky");
			
			
			UserDefine y = new UserDefine();
			y.setId(20);
			y.setName("Sunith");
			
		Map<Integer,UserDefine> m = new HashMap<Integer,UserDefine>();
		m.put(2,u);
		m.put(4, y);
		
		Set<Entry<Integer, UserDefine>> entrySet = m.entrySet();
		
		for (Entry<Integer, UserDefine> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());
			
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
//			Set<UserDefine> s = new HashSet<UserDefine>();
//			s.add(u);
//			s.add(y);
			
//			User Define Set
//			
//			for (UserDefine z : s) {
//				
//				System.out.println(z.getId());
//				System.out.println(z.getName());
//				
//			}
//			
		}

	}


