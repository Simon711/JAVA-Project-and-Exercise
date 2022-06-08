//Simon

// b)i) class uses enum data type
public enum CaseList {	
	CASE1("TRAVEL ABROAD", "QUARANTINE"), 
	CASE2("CLOSE CONTACT", "QUARANTINE"), 
	CASE3("COVID SYMPTOM", "WARDED"), 
	CASE4("CRITICAL", "ICU"), 
	CASE5("DISCHARGED", "RECOVERED");
	
	// b)ii) has 2 attributes: background and status
	private String background;	
	private String status;
	
	// b)iii) constructor for class CaseList
	CaseList(String b, String s){ 
		background = b;
		status = s;
	}
	
	// b)iv) getter (accessor)methods
	public String getBackground() {
		return background;
	}
	
	public String getStatus(){
		return status;
	}
}
		 
