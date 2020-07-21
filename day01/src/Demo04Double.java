public class Demo04Double {
	// 数据类型 之 浮点数
	public static void main(String[] args){
		double d = 5.0 - 4.9;
		// 0.09999999999999964  1/10
		System.out.println(d);
		
		d = 3.0 - 2.9;
		// 0.10000000000000009
		System.out.println(d);

		d = 3.0 - 2.5;
		// 0.5
		System.out.println(d);
		
		// float f = 3.14; // 编译错误
		// 小数字面量默认都是double类型
		// 如果要给float赋值，需要追加 f/F
		float f = 3.14f;
		System.out.println(f);
		double d1 = 3.14d;

		boolean b = true;
	}



}