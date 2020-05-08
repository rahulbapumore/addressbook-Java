import java.util.*;


class AddressBook
{
  List<Person> personList = new ArrayList<>();
  
  public void addPersonToArrayLst(Person per)
  {
	personList.add(per);
  }
  
  public void deletePersonToArrayLst(int perId)
  {
       for(int i=0;i<personList.size();i++)
       {
	  Person p = personList.get(i);
	  if(p.id == perId)
	  {
		personList.remove(i);
		break;
	  }
       } 
  }

  public void modifyPersonInArrayList(Person per)
  {
	deletePersonToArrayLst(per.id);
	addPersonToArrayLst(per);
  }

  public void printArrayList()
  {
       for(int i=0;i<personList.size();i++)
       {
          Person p = personList.get(i);
          System.out.println("Person Id = " + p.getId()+
	        "\tPerson Name= " + p.getFirstName() + " " + p.getLastName()+
		"\tPerson Phone no.= "+ p.getMob() + 
		"\tPerson Address= "+ p.getAddr().getAddress()+
		"\tPerson State= "+ p.getAddr().getState()+
		"\tPerson City= "+ p.getAddr().getCity()+
		"\tPerson Zip= "+ p.getAddr().getZip()  );
       } 

  }
}
