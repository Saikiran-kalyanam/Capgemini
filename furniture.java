package Assignments;

   class Box{
	   double length;
	   double breadth;
	   double height;
	    Box(double length,double breadth){
	    	this.length=length;
	    	this.breadth=breadth;
	    }
	    Box(double length,double breadth,double height){
	    	this(length,breadth);
	    	this.height=height;
	    }
	    public void display() {
	    	System.out.println("length :"+this.length);
	    	System.out.println("breadth :"+this.breadth);
	    	if(this.height!=0.0) {
	    	System.out.println("height:"+this.height);
	    	}
	    }
	   
   } 
public class furniture {

	public static void main(String[] args) {
		Box b1=new Box(2.0,3.0,5.0);
		b1.display();
		Box b2=new Box(6.0,8.0);
		b2.display();
		
	}

}
