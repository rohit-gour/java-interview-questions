package StringImmutable;

public final class ImmutableExample {
    final String name;
    final int age;
 public ImmutableExample(String name, int age){
     this.name = name;
     this.age = age;
 }
 public String getName(){
     return name;
 }

 //This method will make this code as partial Immutable
 public ImmutableExample getWithNewAge(int age){
     return new ImmutableExample(this.name, age);
 }
 //To make this code we have to remove the above method because its modifing existing age value

}