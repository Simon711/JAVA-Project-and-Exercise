import java.util.ArrayList;

public class Town {
	public static void main (String[] args) {
		ArrayList <String> townList = new ArrayList<String>();
		//ArrayList townList = new ArrayList();
		townList.add("Kangar");
		townList.add("Penang");
		townList.add("Kuala Lumpur");
		townList.add("Johor Bahru");
		printList (townList);

		System.out.println ("Checking whether the townList has object \"Shah Alam\".......");
		if (townList.contains("Shah Alam"))
			System.out.println ("townList contains \"Shah Alam\"");
		else
			System.out.println ("townList doesn't contain \"Shah Alam\"");

		System.out.println ("\nInserting \"Shah Alam\" to townList at index 3.......");
		townList.add(3, "Shah Alam");
		printList (townList);

		System.out.println ("Removing \"Kuala Lumpur\" from townList.......");
		townList.remove("Kuala Lumpur");
		printList (townList);

		System.out.println ("Removing element in location 0 from townList.......");
		townList.remove(0);
		printList (townList);

		System.out.println ("Finding the location of \"Shah Alam\" from townList.......\n");
		System.out.printf ("Location of \"Shah Alam\" is in index %d\n", townList.indexOf("Shah Alam"));

		System.out.println ("\nReplacing \"Penang\" with \"Muar\".......");
		townList.set(townList.indexOf("Penang"), "Muar");
		printList(townList);

		System.out.println ("\nCheck whether the list is empty.......");
		if (townList.isEmpty())
		  System.out.println ("\nThe list is empty");
		else
		  System.out.println ("\nThe list is not empty");
	}

	public static void printList (ArrayList<String> a) {
		System.out.println();
		for (int i=0; i<a.size(); i++)
			System.out.printf("townList[%d] : %s\n", i, a.get(i));
		System.out.println();
	}
}