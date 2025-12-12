class Human{
	String name;
	int age;
	String gender;
	String fname;
	String mname;
	double height;
	double weight;
	void show() {
		System.out.println(name+" "+age+" "+gender+" "+fname+" "+mname+" "+height+" "+weight);
	}
	Human(String n,int a,String g){
		name=n;
		age=a;
		gender=g;
	}
	Human(String n,int a,String g,String fn,String mn,double h,double w){
		this(n,a,g);
		fname=fn;
		mname=mn;
		height=h;
		weight=w;
	}
}
public class ConstructorChainingEx {
	public static void main(String[] args) {
		Human h1=new Human("Gopal Singh",21,"male","Bhopal Singh","Gopi Devi",5.6,55.3);
		Human h2=new Human("Gopal Singh",21,"male");
		h1.show();
		h2.show();
	}
}

