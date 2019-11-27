class AddingLowerType{
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		//byte c=a+b;
		//compile time error
		//because byte+byte=int
		byte c1=(byte)(a+b);//but the dataType is byte to get the same dataType typeCasting is requried
		//range of dataType matters beyound the range it will give diffrent values
		//or
		int c2=a+b;
		//or
		int c3= (int)a+b;//while the dataType is int
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
	
}

//byte+byte      =int
//short+short    =int
//byte+short     =int
//int+int        =int
//int+long       =long
//long+long      =long
//int+float      =float
//long+float     =float
//float+float    =float;
//decimal+decimal=decimal
//float+decimal  =decimal