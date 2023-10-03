package Fabric;

import Interface.iGameItem;
import Product.Watermelon;;

public class WatermelonGenerator extends ItemGenerator {
  @Override
  public iGameItem createItem() {
    return new Watermelon();
  }

}
