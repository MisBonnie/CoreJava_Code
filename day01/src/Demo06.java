public class Demo06 {
	// 运算符讲解之赋值运算符&位运算符
	public static void main(String[] args){
		byte b = 10;
		// b = b + 1; // 编译错误
		// b++;
		b += 1; // 不会改变类型
		System.out.println(b);

		int a = 2 & 4;
		System.out.println(2 ^ 4);
	}
}