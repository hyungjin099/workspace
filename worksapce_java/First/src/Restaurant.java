
public class Restaurant {
  private String addr;
  private Cookable chef;

  public void takeOrder(){
    chef.cook();
  }

}
