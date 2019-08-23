/** 
* @author :wuhongliang wuhongliang@zhilutec.com
* @version :2017年9月14日 上午10:18:50 * 
*/ 
package reg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reg = "001";
		String content = "02001204";
		//为什么isMatch返回false?
//		boolean isMatch1 = content.matches(reg);
//		System.out.println(isMatch1);
// 		String st1 = "dsadas";
// 	      System.out.println("st1:"+st1.startsWith("sa",1));
// 	      String st2 = "dsadas";
// 	      System.out.println("st1:"+st2.startsWith("sa"));
// 	      String st3 = "dsadas";
// 	      System.out.println("st2:"+st3.startsWith("ds"));
// 	      String st4 = "dsadas";
// 	      System.out.println("st4:"+st4.startsWith("ds",0));
// 	      String st5 = "dsadas";
// 	      System.out.println("st5:"+st5.startsWith("ds",1));
		
//		Pattern p = Pattern.compile(reg);
//		Matcher m = p.matcher(reg);
//		boolean b = m.matches();
//		System.out.println(b);	
		
		 
//		 boolean isMatch2 = Pattern.matches("^001", content);
//		 System.out.println(isMatch2);
		
//		 boolean isMatch3=Pattern.compile(reg).matcher(content).matches();
//		 System.out.println(isMatch3);


		// //待验证字符串
		// String routeId="abc-test4";
		// // 验证规则
		// String regEx = ".*" + "t4" + ".*";


		//待验证字符串
		String routeId="HTTP://abc.com";
		// 验证规则
		String regEx = "^http://.*";
		System.out.println(regEx);
		// 编译正则表达式,忽略大小写的写法
		Pattern pattern = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(routeId);
		// 字符串是否与正则表达式相匹配
		// 查找字符串中是否有匹配正则表达式的字符/字符串
		boolean rs = matcher.find();
		System.out.println(rs);

		// 忽略大小写的写法
		// Pattern pat = Pattern.compile(regEx, Pattern.CASE_INSENSITIVE);
		// 字符串是否与正则表达式相匹配
		boolean rs2 = matcher.matches();
		System.out.println(rs2);
	}

}
