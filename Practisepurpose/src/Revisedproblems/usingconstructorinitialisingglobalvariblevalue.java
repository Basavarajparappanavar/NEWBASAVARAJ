package Revisedproblems;

public class usingconstructorinitialisingglobalvariblevalue {
String Name;
double salary;
int empid;
usingconstructorinitialisingglobalvariblevalue(String Name,double salary,int empid){
	this.Name=Name;
	this.salary=salary;
	this.empid=empid;	
	System.out.println(this.Name+" "+this.salary+" "+this.empid);
}
public static void main(String[] args) {
	usingconstructorinitialisingglobalvariblevalue a1=new usingconstructorinitialisingglobalvariblevalue("RAJU",69850,123);
	usingconstructorinitialisingglobalvariblevalue a2=new usingconstructorinitialisingglobalvariblevalue("RAJ",69850.55,456);
	usingconstructorinitialisingglobalvariblevalue a3=new usingconstructorinitialisingglobalvariblevalue("RAJendra",65850,123);
	usingconstructorinitialisingglobalvariblevalue a4=new usingconstructorinitialisingglobalvariblevalue("RAJesh",698.50,123);
	usingconstructorinitialisingglobalvariblevalue a5=new usingconstructorinitialisingglobalvariblevalue("RAm",69.850,123);
	usingconstructorinitialisingglobalvariblevalue a6=new usingconstructorinitialisingglobalvariblevalue("RAhul",6985.10,123);

}
}
