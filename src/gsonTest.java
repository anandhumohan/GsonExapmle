import java.util.ArrayList;

import com.google.gson.Gson;


public class gsonTest {
	public static void main(String arg[]){
		employee emp = new employee();
		emp.setName("ajith");
		emp.setAge(22);
		ArrayList<String> list  = new ArrayList<String>();
		list.add("malayalam");
		list.add("hindi");
		emp.setLanguages(list);
		Gson gson = new Gson();
		String str = gson.toJson(emp);
		System.out.println(str);
		
		
	}

}
