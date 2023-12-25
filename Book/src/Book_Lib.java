
public class Book_Lib {
	String bName;
	int bId;
	double bPrice;
	
	Book_Lib()
	{
		this.bName="Not Given";
		this.bId=00;
		this.bPrice=00;
	}
	Book_Lib(String nm,int id,double p)
	{
		this.bName=nm;
		this.bId=id;
		this.bPrice=p;
	}
	void setBName(String n)
	{
		this.bName=n;
	}
	String getBName()
	{
		return bName;
	}
	void setId(int id)
	{
		this.bId=id;
	}
	int getId()
	{
		return bId;
	}
	void setPrice(double p)
	{
		this.bPrice=p;
	}
	double getPrice()
	{
		return bPrice;
	}
	void display()
	{
		System.out.println("Name is :"+this.bName);
		System.out.println("Book Id is :"+this.bId);
		System.out.println("Book Price is :"+this.bPrice);
	}
	
	
	
	

}
