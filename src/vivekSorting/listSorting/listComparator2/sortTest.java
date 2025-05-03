package vivekSorting.listSorting.listComparator2;

// refer Youtube Engineering Digest playlist Java Collections Framework 3/22
// sorting List String type Using Comparator interface

import java.util.ArrayList;
import java.util.List;

public class sortTest {

	public static void main(String[] args) {
		
        List<String> sportsList = new ArrayList<>();
        sportsList.add("cricket");
        sportsList.add("archery");
        sportsList.add("hockey");
        sportsList.add("football");
        sportsList.add("tennis");
        sportsList.add("badminton");
        
        // without sorting
        System.out.println("without sorting : "+sportsList);
        
        // sorting in ascending order
//        sportsList.sort(null);
        
        // another way
//        sportsList.sort(new SportsComparator());
        
//        System.out.println("sorting in ascending order : "+sportsList);
        
        // sorting in descending order
        sportsList.sort(new SportsComparator());
        System.out.println("sorting in descending order : "+sportsList);
        
	}
	
}
