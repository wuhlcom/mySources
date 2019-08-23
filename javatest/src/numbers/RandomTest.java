package numbers;

//如果你想随机数间的差距更小点，可以修改 one 的计算公式，如把 max - min 更换成 max / (cnt - i)。当然你还得注意 min 的取值，避免最后算出 one 为负数。

public class RandomTest {

	public static void main(String[] args) {
		genData();
	}

	/****/
	public static void src() {
		double min = 0.0001;
		double max = 10; // 总和
		int cnt = 5; // 数量
		int scl = 4; // 小数最大位数
		int pow = (int) Math.pow(10, scl); // 用于提取指定小数位 pow,表示x的Y次方
		double sum = 0; // 用于验证总和
		double one;

		for (int i = 0; i < cnt; i++) {
			if (i < cnt - 1) {
				// min~max 指定小数位的随机数,floor取不大数和最大整数
				one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
			} else {
				one = max;
			}
			max -= one;
			sum += one;

			// 输出
			System.out.printf("%.4f\r\n", one);
		}

		// 验证
		System.out.println(sum);
	}

	public static void genData() {
		double min = 3.0;
		double max = 3.8; // 总和
		int cnt = 5; // 数量
		int scl = 4; // 小数最大位数
		int pow = (int) Math.pow(10, scl); // 用于提取指定小数位 pow,表示x的Y次方
		double sum = 0; // 用于验证总和
		double one;
		one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
		System.out.println(one);
	}

}
