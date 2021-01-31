class Employee{
int uear:
String name,address;

void insertRecord(String n,int y,String a){
year=y;
name=n;
address=a;
}
void displayInformation(){System.out.println(name+" "+year+" "+address);}
}
class TestEmployee{
public static void main(STring args[]){
Employee E1=new Employee();
Employee E2=new Employee();
Employee E3=new Employee();
E1.insertRecord("Robert",1994,"64c-walls street");
E2.insertRecord("Sam",2000,"68D-walls street");
E1.insertRecord("John",1999,"26B-walls street");
E1.displayInformation();
E2.displayInformation();
}
}
