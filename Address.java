class Address
{
  private String address;
  private String city;
  private String state;
  private int zip;
  
  Address(){}
  Address(  String address,
  	    String city,
  	    String state,
  	    int zip)
    {
	this.address = address;
	this.city = city;
	this.state = state;
	this.zip  =  zip;
    }
   
    public String getAddress()
    {
	return address;
    }

    public String getState() 
    {
	return state;
    }
    public String getCity() 
    {
	return city;
    }
    public int getZip() 
    {
	return zip;
    }


    public void setAddress(String address)
    {
        this.address =  address;
    }

    public void setState(String state) 
    {
        this.state = state;
    }
    public void setCity(String city) 
    {
        this.city = city;
    }
    public void setZip(int zip) 
    {
        this.zip = zip;
    }

}
