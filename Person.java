class Person
{
  int id;
  private String firstName;
  private String lastName;
  private int mob;
  private Address addr;

  Person(){}
  Person(int id,
	 String firstName,
 	 String lastName,
	 int mob,
	 Address addr)
  {
	this.id		=  id;
	this.firstName  =  firstName;
	this.lastName   =  lastName;
	this.mob	=  mob;
	this.addr	=  addr;
  }


  public int getId()
  {
        return id;
  }

  public String getFirstName()
  {
	return firstName;
  }

  public String getLastName()
  {
        return lastName;
  }

  public int getMob()
  {
        return mob;
  }

  public Address getAddr()
  {
        return addr;
  }

  public void setId(int id)
  {
         this.id  =  id;
  }

  public void setFirstName(String firstName)
  {
         this.firstName  =  firstName;
  }

  public void setLastName(String lastName)
  {
        this.lastName   =  lastName;
  }

  public void setMob(int mob)
  {
        this.mob 	=  mob;
  }

  public void setAddr(Address addr)
  {
        this.addr	=   addr;
  }




}
