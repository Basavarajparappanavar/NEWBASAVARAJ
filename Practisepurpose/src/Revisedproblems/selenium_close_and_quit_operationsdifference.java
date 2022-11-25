package Revisedproblems;

public class selenium_close_and_quit_operationsdifference {
	int accountnumber;
	String name;
	double bal;
	String ifsc;
	double loanamt;
	double emi;
	selenium_close_and_quit_operationsdifference(int accountnumber,String name,double bal,String ifsc,double loanamt,double emi){
		this.accountnumber=accountnumber;
		this.name=name;
		this.bal=bal;
		this.ifsc=ifsc;
		this.loanamt=loanamt;
		this.emi=emi;
		System.out.println(this.accountnumber+" "+this.name+" "+this.bal+" "+this.ifsc+" "+this.loanamt+" "+this.emi);
		
	}
public static void main(String[] args) {
	selenium_close_and_quit_operationsdifference a1=new selenium_close_and_quit_operationsdifference(1014,"raju",131.5,"dfhbjhf56",12305,1246);
	selenium_close_and_quit_operationsdifference a2=new selenium_close_and_quit_operationsdifference(36536,"raani",456,"hgsdjhks",4566,4566);
	
}
}

