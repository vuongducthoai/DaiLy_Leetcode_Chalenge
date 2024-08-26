package _SourceCode;

public class Integer_to_English_Words_273 {

  private static final String[] belowTwenty = {"", "One", "Two", "Three", "Four", "Five", "Six","Seven", "Eight", "Nine", "Ten",
      "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
  };

  private static final String[] tens = {"", "", "Twelve", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

  public static String helper(int num){
    StringBuilder result = new StringBuilder();
    if(num < 20){
      result.append(belowTwenty[num]);
    }else if(num < 100){
      result.append(tens[num / 10]).append(" ").append(belowTwenty[num % 10]);
    }else if(num < 1000){
      result.append(helper(num / 100)).append(" Hundred ").append(helper(num % 100));
    }
    else if(num < 1000000){
      result.append(helper(num / 1000)).append(" Thousand " ).append(helper(num % 1000));
    }
    else if(num < 1000000000){
      result.append(helper(num / 1000000)).append(" Million ").append(helper(num % 1000000));
    }else {
      result.append(helper(num / 1000000000)).append(" Billion ").append(helper(num % 1000000000));
    }
    return result.toString().trim();
  }
  public static String numberToWords(int num) {
    if(num == 0){
      return "Zero";
    }
    return helper(num);
   }

  public static void main(String[] args) {
    int num = 1234567;
    System.out.println(numberToWords(num));
  }
}