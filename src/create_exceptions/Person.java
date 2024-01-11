package create_exceptions;

public class Person {
   private  int age;

  public Person(int age) {
    if(age < 0 || age > 130){
      // unchecked exception: no need to handle the unchecked exception
      throw  new InvalidAgeException(" Age must be between 0 and 130");
    }else{
      this.age = age;
    }

  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if(age < 0 || age > 130){
      throw  new InvalidAgeException(" Age must be between 0 and 130");
    }else{
      this.age = age;
    }
  }
}
