public class Cake{
	public static void main(String[]args){
		// / % ++ -- 商 余数     自加  自减
		int num1=9;
		int num2=2;
		System.out.println(9/2);
		System.out.println(9%2);
		System.out.println(++num1);//++ num1=num1+1 
		System.out.println(--num2);//++ num2=num1-1  ++/--在前，先自加/自减，再运算
		//System.out.println(num1++);//先运算，后加减
		//System.out.println(num2--);
		System.out.println(num1);
		num1+=2;//+=2表示num1加上2再输出
		System.out.println(num1);
		System.out.println("运行结束");
		
		
	}
}