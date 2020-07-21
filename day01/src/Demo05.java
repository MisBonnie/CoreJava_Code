public class Demo05 {
	// 运算符讲解
	public static void main(String[] args){
		// 运算符左右两边类型是统一的
		double a = 1 + 3.14;
		System.out.println(a);

		int i = 5 / 2; // 整除
		System.out.println(i); // 2
		double d = 5 / 2.0;
		System.out.println(d); // 2.5
		System.out.println("---------");
		System.out.println(i++); // 2
		System.out.println(i); // 3
	}
}