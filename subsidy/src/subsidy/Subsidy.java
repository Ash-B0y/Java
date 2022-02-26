
package subsidy;
interface Citizen
{
    void sendDetails(String nam,String occ,String adhno)throws InvalidnoException;
    void show();  
}

//* This indicates the Exception class
class InvalidnoException extends Exception
{
    @Override
    public String toString()
    {
        return"\t\t Invalid aadhar num can't process further......";
    }
}
//* This indicates the main class
public class Subsidy implements Citizen {
    String name,occup,aadhar;
    String subsidy[]={"Food Security","Petroleum","Fertilizer","Child development","Drinking water", "Sanitation","Maternal and child malnutrition "};
    
    //* This method is used to receive the Citizen's details..  
    public void sendDetails(String nam,String occ, String adhno)throws InvalidnoException
    {
      name=nam;
      occup=occ;
      aadhar=adhno;
      if(aadhar.length()!=12)
      {
        System.out.print("\n"+name);
        System.out.print("\t" +occup);
        throw new InvalidnoException();  
        }
    }
    @Override
    //*This method is used to display the details of subsidy holders ...
    public void show()
    {
        System.out.print("\n"+name);
        System.out.print("\t" +occup);
        System.out.print("\t\t" +subsidy[0]);
        System.out.print("," +subsidy[2]);
        System.out.print("\t" +aadhar);
        
        
    }
    

   //*This is the main function in the superclass
    public static void main(String[] args) {
        Subsidy farm=new Subsidy();
        Child nur=new Child();
        Petroleum p=new Petroleum();
        Sanitation s=new Sanitation();
        Water w=new Water();
        Malnutrition m=new Malnutrition();
        int count=0;        

        System.out.print("NAME");
        System.out.print("\t OCCUPATION");
        System.out.print("\t SUBSIDY");
        System.out.print("\t\t\t AADHAR NO");
        try{
        farm.sendDetails("ARUN","FARMER","113436789");
        }
        catch(InvalidnoException e)
        {
          System.out.print(e);
          count++;
        }
        if(count==0)
        farm.show();
        count=0;
        try{
        farm.sendDetails("KARUNA","FARMER","123895583901");
        }
        catch(InvalidnoException e)
        {
          System.out.print(e);
          count++;
        }
        if(count==0)
        farm.show();
        count=0;
        try
        {
        nur.sendDetails("NALINI","HOME MAKER", "176543290321");
        }
         catch(InvalidnoException e)
        {
          System.out.println(e);
          count++;
        }
        if(count==0)
        nur.show();
        count=0;
         try
        {
        p.sendDetails("AARUMUGAM","PETROL DEALER", "109875538859");
        }
         catch(InvalidnoException e)
        {
          System.out.println(e);
          count++;
        }
         if(count==0)
         p.show();
         count=0;
          try
        {
        s.sendDetails("KAMALINI","PUBLIC SERVANT", "124359866803");
        }
         catch(InvalidnoException e)
        {
          System.out.println(e); 
          count++;
        }
          if(count==0)
          s.show();
          count=0;
                  
           try
        {
        w.sendDetails("RAJAGOUDA","WATER DEALER", "198673286691");
        }
         catch(InvalidnoException e)
        {
          System.out.println(e);
          count++;         
        }
        if(count==0)
        w.show();
        count=0;
         try
        {
        m.sendDetails("LAILA","HOME MAKER", "109958987661");
        }
         catch(InvalidnoException e)
        {
          System.out.println(e);
          count++;
        }
         if(count==0)
             m.show();
            count=0;

    }
    
}
