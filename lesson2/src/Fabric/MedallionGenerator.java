package Fabric;

import Interface.iGameItem;
import Product.Medallion;

public class MedallionGenerator extends ItemGenerator {
  @Override
  public iGameItem createItem() {
    return new Medallion();
  }

}
