//Simon

class Header{
	private String title;
	
	Header(String t){
		title=t;
	}
	
	public String getTitle() {
		return title;
	}
}

class Body{
	private String message;
	
	Body(String m){
		message=m;
	}
	
	public String getMessage() {
		return message;
	}
}

class Attachment {
	private String filename;
	
	Attachment(String f){
		filename=f;
	}
	
	public String getFilename() {
		return filename;
	}
}

class MailMessage{
	private Header header;
	private Body body;
	private Attachment attachment;
	
	MailMessage(Header h, Body b, Attachment a){
		header = h;
		body = b;
		attachment = a;
	}
	
	public void print() {
		System.out.println("Header: " + header.getTitle() + "\nBody: " + body.getMessage() + "\nAttachment: " + attachment.getFilename());
	}
}

public class MailMessageTest {

	public static void main(String[] args) {
		Header header = new Header("Object-Oriented Programming");
		Body body = new Body("Lab Exercises for Aggregation");
		Attachment attach = new Attachment("Lab8.java");
		
		MailMessage message = new MailMessage(header, body, attach);
		message.print();
	}

}
