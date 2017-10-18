class Temp{
//int n;
void show(byte b){
System.out.println(+b);
}
void show(short s){
System.out.println(+s);
}
void show(int n){
System.out.println(+n);
}
void show(long l){
System.out.println(+l);
}
}
class Show{
public static void main(String args[]){
Temp obj=new Temp();
obj.show(10);
}
}	



// Output 10 ye int mai jayega Bcoz literal always goes to Int.


//output 10 ayega or ye int mai jayega.			