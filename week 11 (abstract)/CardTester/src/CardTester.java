abstract class Card {
  private String recipient;
  public Card () {}
  public Card (String r) {recipient = r;}
  public String getRecipient () {return recipient;}
  public abstract void greeting(); //abstract method must have no body}
}
class KadRaya extends Card {
  public KadRaya () {}
  public KadRaya (String r) {super(r);}
  public void greeting () {System.out.println ("Dear " + super.getRecipient()+", Selamat Hari Raya!\n");}
}

class Birthday extends Card{
	public Birthday() {}
	public Birthday(String r) {super(r);}
	public void greeting () {System.out.println ("Dear " + super.getRecipient()+", Happy Birthday!\n");}
}

class Wedding extends Card{
	public Wedding() {}
	public Wedding(String s) {super(s);}
	public void greeting () {System.out.println ("Dear " + super.getRecipient()+", Happy Wedding!\n");}
}

public class CardTester {
	public static void main(String[] args) {
		//Card[] card = new Card[3];
		Card[] card = {
						new KadRaya("Simon"), 
						new Birthday("Clive"), 
						new Wedding("Peter")
					};		
		//or
		//card[0] = new KadRaya("Simon");
		//card[1] = new Birthday("Clive");
		//card[2] = new Wedding("Peter");	
		
		//or
//		java.util.ArrayList<Card> card = new java.util.ArrayList<Card>();
//		card.add(new KadRaya("Muhamad"));
//		card.add(new Birthday("Siti"));
//		card.add(new Wedding("Pun"));
		
		for(Card c: card) {
			c.greeting();
			
			
		}
	}
}



