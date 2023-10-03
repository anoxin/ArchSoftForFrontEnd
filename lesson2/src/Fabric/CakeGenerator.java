package Fabric;

import Interface.iGameItem;
import Product.Cake;

public class CakeGenerator extends ItemGenerator {
  @Override
  public iGameItem createItem() {
    return new Cake();
  }

}
