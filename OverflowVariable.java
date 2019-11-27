public class OverflowVariable{
	public static void main(String[] args) {
		//overflow
		int a=130;
		byte b=(byte)a;
		System.out.println(a);//o/p=130
		System.out.println(b);// by using 2's complement addition method  it with chopoff the digit and gives  o/p=-126
	}
}