public class NarrowingVariable{
	public static void main(String[] args) {
		float f=10.5f;
		//int a=f;
		//compile time error
		int a=(int)f;			//typeCasting
		System.out.println(f);//display decimal number
		System.out.println(a); //type casting will convert float to int by chopping extra number
	}
	
}