public class ExceptionHandler {
    String input;
    public ExceptionHandler(String input)
    {
        input=this.input;
    }
  public void findexception(String input) {
      int digits = 0;
      int underscore = 0;
      boolean flag=false;
      for (int i = 0; i < input.length(); i++) {
          if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
              digits++;
          }
          if (input.charAt(i) == 95) {
              underscore++;
          }

      }
      if (digits < 8 && underscore < 1) {
          flag=true;
          if(flag)
          {
              throw new ArithmeticException("Not supported");

          }

      }
  else {
        System.out.println("Input accepted");
      }
  }
}
