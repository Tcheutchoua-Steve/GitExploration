import java.util.Date;
import java.util.logging.Logger;

public class Hello {

  /**
   * @param args: arguments passed when starting the application
   * */
  private static final Logger LOGGER = Logger.getLogger(Hello.class.getClass().getName());

  public static void main(String[] args) {
    Date d1 = new Date(1590750701050L);
    Date d2 = new Date(1590750701049L);
    LOGGER.info(()->"First date is %s"+ d1.toString());
    LOGGER.info(()->"Second date is " + d2.toString());
  }
}
