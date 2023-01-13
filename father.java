import java.util.*;

class exe extends Exception {
  private int detail;
  private int detail1;

  exe(int a, int b) {
    detail = a;
    detail1 = b;
  }

  public String toString() {
    return "exe [father age " + detail + " doesn't compatable with Son's age  " + detail1 + "  :user defined Exception"
        + "]";
  }

}

class demo {

  static void compute(int a, int b) throws exe {

    if (a <= b || a < 0 || b < 0)
      throw new exe(a, b);

    System.out.println("Age of father is " + a + "  And age of son is " + b);
  }

  public static void main(String args[]) {

    try {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter the Age of father");
      int a = s.nextInt();
      System.out.println("Enter the Age of son");
      int b = s.nextInt();
      compute(a, b);
    } catch (exe e) {

      System.out.println("Caught " + e);

    }
  }
}
