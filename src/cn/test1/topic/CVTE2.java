package cn.test1.topic;

/**
 * cn.test1.topic
 *
 * @author jh
 * @date 2018/9/15 8:46
 * description:输入一个字符串"1-1--1--11",把其中的-替换为00.打印输出为
 * 100100001000011;
 */
public class CVTE2 {
	public static void main(String[] args) {
		System.out.println (print ("1-1--1--11", 14));
	}
	public static String print(String photo, int MaxL) {
		char[] chars = photo.toCharArray ();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '1') {
				MaxL--;
			}
		}

		StringBuffer sb = new StringBuffer ();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '-' && (MaxL / 2) > 0) {
				sb.append ("00");
				MaxL=MaxL-2;
			} else {
				sb.append (chars[i]);
			}
		}
		return sb.toString ();
	}
}
