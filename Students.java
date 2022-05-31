package assignment3.weekday1;

public class Students 
{
	int id,phoneNumber;
	String Name,email;
	public  void getStudentInfo(int ids,String Names,String emails,int phoneNumbers)
	{
		id=ids;
		Name=Names;
		email=emails;
		phoneNumber=phoneNumbers;	
		System.out.println("Id of the Student\n" +id);
		System.out.println("Name of the Student\n" +Name);
		System.out.println("Email of the Student\n" +email);
		System.out.println("phoneNumber of the Student\n" +phoneNumber);
	}

	public static void main(String[] args)
	{
		Students s=new Students();
		s.getStudentInfo(1,"srini","ragasaisrini@gmail.com",89);
	}

}
