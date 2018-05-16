import java.util.ArrayList;

public class Member {
   

   // for the constructor.
  private String name, sex, age, address, memberType;
   
  // a constructor for members. 
   public Member (String name, String sex, String age, String address, String memberType) {
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.address = address;
      this.memberType = memberType;
   }
   public String toString()
   {
      return "Member" + 
             "Name: " + name +
             "sex: " + sex + 
             "Age: "  + age +
             "Address: " + address +
             "Member type: " + memberType;
   }
   
   
   // getters    
      public String getName()
   {
         return name;
   }
   
      public String getSex() {
         return sex;
      }
   
      public String getAge() {
         return age;
      }
   
      public String getAddress() {
         return address;
      }
   
      public String getmemberType() {
         return memberType;
      }
  
   // setters
   
      public void setName(String name) {
         this.name = name;
      }
  
      public void setSex(String Sex) {
         this.sex = sex;
      }
   
      public void setAge(String Age) {
         this.age = age;
      }
  
      public void setAddress(String Address)
     {
         this.address = Address;
     }
  
      public void setMemberType(String memberType)
     {
         this.memberType = memberType;
     }
  
}