/**
 * Created by backendlessdev on 8/13/15.
 */
public class Main
{
  public static void main( String[] args )
  {
    Test1 t = new Test1();
    try
    {
      t.setUp();
    }
    catch( Exception e )
    {
      e.printStackTrace();
    }
  }

}
