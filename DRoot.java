public class DRoot {
  public static int digital_root(int n) {
    while (n > 9){
      n = digitSum(n);
    }
    return n;
  }
  
  public static int digitSum(int n){
    int result=0;
    while (n>9){
      result += n%10;
      n = n/10;
    }
    result += n;
    return result;
  }

}