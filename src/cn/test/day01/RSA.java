package cn.test.day01;

//例子为算47 * x + 30 * y ==1 的解
		/*RSA算法是计算机世界最重要的算法，它是计算机通信安全的基石,
		因为任何用到加解密的地方都会用到RSA算法。它的原理就是通过
		两个互质的数来分别作为公钥和私钥(暂时这么理解)加解密实现。*/
public class RSA
{
  public static void main(String[] args)
  {
      int[] p = new int[2];
      int a = 47;
      int b = 30;
      RSA(a,b,p);
      System.out.print("p[0] is: " + p[0] + ";p[1] is：" + p[1]);//p1为私钥
  } 
  public static  int[] RSA(int a,int b,int[] p)//这里假设a > b
  {
      if(a%b == 1)
      {
          p[0] = 1;
          p[1] = -(a - 1) / b;
          return p;
      }
          else
      {
              RSA(b,a % b,p);
              int t = p[0];
              p[0] = p[1];
              p[1] = t - (a / b) * p[1]; 
              return p;
      }
  }
}
