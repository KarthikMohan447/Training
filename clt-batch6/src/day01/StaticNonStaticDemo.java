package day01;

class StaticNonStaticDemo {
	
	int variable1=50;
	static int variable2=60;
	
	void showVariables()
	{
	System.out.println(variable1+" "+variable2);
	}
    static String reference1="Python";
    String reference2="Java";
    
    static void showReferences()
    {
    System.out.println(reference1);
    
    System.out.println(new StaticNonStaticDemo().reference2);
    }
}
public class Example03
{
public static void main(String[] args)
{
StaticNonStaticDemo=showReferences();
new StaticNonStaticDemo().showVariables();
}
}

