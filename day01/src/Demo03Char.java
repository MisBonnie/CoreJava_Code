public class Demo03Char {
	// 数据类型 之 char类型
	public static void main(String[] args){
		int a = 10;
		a = 010; // -> 8进制
		System.out.println(a);
		a = 0xa; // -> 16进制
		System.out.println(a);
		System.out.println("--------");

		char c = 'a';
		c = '中';
		c = '\u4e2d'; // Unicode编码 - 1个字符=2个字节 乱码
		System.out.println(c);

		char c1 = 48; // ASCII码 'A'=65 'a'=97 '0'=48
		System.out.println(c1);
		c1 = 0; // 空白字符
		System.out.println(c1);
		System.out.println("\u4e2d\u4e2d\u4e2d\u4e2d");
	}
}
