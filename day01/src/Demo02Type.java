public class Demo02Type {
	// 数据类型之 - 整型
	public static void main(String[] args){
		// 整型变量不能超出实际有效范围
		byte b = 10;

		System.out.println("b: " + b);

		short s = 128;

		int i = 2100000000;
		// 整数的直接量、字面量默认类型都是int
		// 想要表示long类型，需要追加 l/L
		long l = 21000000000l;

		// 获得当前系统时间 - 毫秒 1594025072454
		long time = System.currentTimeMillis();
		System.out.println("现在时间：" + time);
		// long = 0: 1970年1月1日 00:00:00

		s = b; // 小范围赋值给大范围，允许 - 自动类型转换
		b = (byte)s; // 大范围赋值给小范围，不允许,除非强制类型转换
	}
}






