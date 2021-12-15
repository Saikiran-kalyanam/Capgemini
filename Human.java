package Assignments;

 class Company {
    String name;
    public Company(String name) {
	super();
	this.name=name;
    }
}
    class Employee extends Company{
    	String eId;
    	double sal;
    	public Employee (String eId,String name,double sal) {
    		super (name);
    		this.eId=eId;
    		this.sal=sal;
    	}
 }
  public  class Human{
    	public static void main(String[] args) 
    	{
    		Employee e1=new Employee("R01","wipro",1000);
    		System.out.println("Employee ID:"+e1.eId);
    		System.out.println("Company name: "+ e1.name);
    		System.out.println("Employee salary:" +e1.sal);
    		System.out.println("*******");
    		
    		
    
    		
    	}

}
