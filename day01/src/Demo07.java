public class Demo07 {
	// 运算符讲解之逻辑运算符
	public static void main(String[] args){
		int a = 10;
		int b = 20;
		System.out.println(a++ > 10 && b-- < 20); // false
		System.out.println(a); // 11
		System.out.println(b); // &:19  &&:20
	}
}