import java.util.Date;

public class Hello {

  public static void main(String[] args) {
    System.out.println("The first day");
    Date d1 = new Date(1590750701050L);
    Date d2 = new Date(1590750701049L);
    System.out.println("First date is " + d1.toString());
    System.out.println("Second date is " + d2.toString());
  }
}
