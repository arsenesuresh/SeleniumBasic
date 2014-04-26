package ArrayList;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set=new HashSet<String>();
set.add("suresh");
set.add("sanjeev");
set.add("suresh");//st will not allow duplicates,so it ll print suresh only one time
for(String elemnts:set){
	System.out.println(elemnts);
}
	}

}
