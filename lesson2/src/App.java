import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;
import Fabric.MedallionGenerator;
import Fabric.MilkGenerator;
import Fabric.SilverGenerator;
import Fabric.WatermelonGenerator;
import Fabric.CakeGenerator;
import Fabric.CoinGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        List<ItemGenerator> generators = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            generators.add(new GoldGenerator());
        }
        for (int i = 0; i < 5; i++) {
            generators.add(new GemGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new SilverGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new MilkGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new CoinGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new MedallionGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new WatermelonGenerator());
        }
        for (int i = 0; i < 20; i++) {
            generators.add(new CakeGenerator());
        }

        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(145);
            generators.get(index).openReward();
        }

    }
}
