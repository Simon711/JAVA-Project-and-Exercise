//no error
public class Town {
	public static void main(String[] args) {
		java.util.ArrayList townList = new java.util.ArrayList();
		townList.add("[Kangar,");
		townList.add("Alor Setar,");
		townList.add("Sungei Petani,");
		townList.add("Penang,");
		townList.add("Kuala Kangsar,");
		townList.add("Ipoh,");
		townList.add("Kuala Lumpur]");
		for(int i=0; i<townList.size(); i++)
			System.out.print(townList.get(i)+" ");
		System.out.println();
	}
}
