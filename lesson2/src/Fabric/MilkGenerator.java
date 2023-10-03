package Fabric;

import Interface.iGameItem;
import Product.Milk;

public class MilkGenerator extends ItemGenerator {
  @Override
  public iGameItem createItem() {
    return new Milk();
  }

}
