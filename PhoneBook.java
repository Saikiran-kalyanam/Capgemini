package Assignments;
  
     class Phone {
	   String name;
	   long phone_no;
	   String address;
	 
	public Phone(String name, long phone_no, String address) {
		super();
		this.name = name;
		this.phone_no = phone_no;
		this.address = address;
	}
	   public void save() {
		   System.out.println("NAME:" +this.name  );
		   System.out.println("CONTACT NUMBER:" +this.phone_no);
		   System.out.println( "ADDRESS:" +this.address );
		   System.out.println("CONTACT IS SAVED SUCCESSFULLY IN PHONE BOOK");
		
	   }
   }




public class PhoneBook {

	public static void main(String[] args) {
		Phone p1=new Phone("pushpa",9844482623l,"hyderabad");
         p1.save();
	}

}
