  public class Sum
  {
     public int GetSum(int a, int b)
     {
     int result=0;
      //Same number
      if (a == b) result = a;
      
      //a < b
      if (a < b){
        for (int i = a; i <= b ; i++){
          result+=i;
        }
      }
      
      // a > b
      
      if (a > b){
        for (int i = b; i <= a ; i++){
          result+=i;
        }
      }
      
      return result;
     }
  }