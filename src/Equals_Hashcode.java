
public class Equals_Hashcode {
	public String name;
    public int id;
          
    Equals_Hashcode(String name, int id) 
    {
              
        this.name = name;
        this.id = id;
    }
      
    @Override
    public boolean equals(Object obj)
    {
    
    if(this == obj)
            return true;
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        Equals_Hashcode geek = (Equals_Hashcode) obj;
        return (geek.name == this.name && geek.id == this.id);
    }
      
    @Override
    public int hashCode()
    {
        
        return this.id;
    }
   
    public static void main (String[] args)
    {
    	Equals_Hashcode g1 = new Equals_Hashcode("aa", 1);
    	Equals_Hashcode g2 = new Equals_Hashcode("aa", 1);
          
        // comparing above created Objects.
        if(g1.hashCode() == g2.hashCode())
        {
  
            if(g1.equals(g2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
      
        }
        else
        System.out.println("Both Objects are not equal. "); 
}
    }
