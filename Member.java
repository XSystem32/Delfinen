import java.util.*;
import java.util.ArrayList;

public class Member {
   
 // for the constructor.
  private String name, sex, age, address, memberType;
   
  // a constructor for members. 
   public Member () {
      this.name = "";
      this.sex = "";
      this.age = "";
      this.address = "";
      this.memberType = "";
   }
   public String toString()
   {
      return "Member" + 
             "Name: " + name +
             "Sex: " + sex + 
             "Age: "  + age +
             "Address: " + address +
             "Member type: " + memberType;
   }
   
   
   
   // getters    
   public String getName()
   {
      return name;
   }
   
    public String getSex()
   {
      return sex;
   }
   
    public String getAge()
   {
      return age;
   }
   
    public String getAddress()
   {
      return address;
   }
   
    public String getmemberType()
   {
      return memberType;
   }
  
   // setters
   
   public void setName(String name)
  {
   this.name = name;
  }
  
   public void setSex(String sex)
  {
   this.sex = sex;
   }
   
   public void setAge(String Age)
  {
   this.age = age;
  }
  
  public void setAddress(String Address)
  {
   this.address = Address;
  }
  
  public void setmemberType(String memberType)
  {
   this.memberType = memberType;
  }
  
  }
  
  
  
  
  
 
   
