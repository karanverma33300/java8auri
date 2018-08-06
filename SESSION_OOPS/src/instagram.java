class account {
	String username;
	String contact;
	String linked_account;
}

class posts {
	String time;
    String location;
	String tagged_people;
}

class Appinfo {
	String Owner;
	int Version;
	String size;	
}

public class instagram {
	
	
	public static void main(String[] args) {
	
		account a1 = new account();
		a1.username ="karan verma";
		a1.contact ="7814733300";
		a1.linked_account ="karanverma33300.kv@gmail.com";
	System.out.println("username is:"+a1.username); 
	System.out.println("contact is:"+a1.contact);
	System.out.println("linked_account is:"+a1.linked_account);

	System.out.println();
	
	    posts a2 = new posts();
	    a2.time = "5am";
	    a2.location = "Ghumar Mandi" ;
		a2.tagged_people = "Kunwar";	
		System.out.println("time is:"+a2.time);
		System.out.println("location is:"+a2.location);
		System.out.println("tagged_people is:"+a2.tagged_people);
		
	
	
	}

}