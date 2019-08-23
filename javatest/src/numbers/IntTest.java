package numbers;

public class IntTest {
 public static void main(String[] args) {
	int a=0;
	int b=0;
	int c=0;
	for (int i = 0; i < 10; i++) {
		a++;
		b=b++;
		c=c+1;
	}
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
}
