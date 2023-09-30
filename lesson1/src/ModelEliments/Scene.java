package ModelEliments;

import java.util.ArrayList;
import java.util.List;

public class Scene {

    public int id;
    public List<PoligonalModel> models;
    public List<Flash> flashes;
    public List<Camera> cameras;

    public Scene(int id, List<Flash> flashes) {
        this.id = id;
        this.flashes = flashes;
        this.cameras = new ArrayList<Camera>();
        this.models = new ArrayList<PoligonalModel>();
    }

    public Object method1(Object type) {
        return null;
    }

    public Object method2(Object type1, Object type2) {
        return null;
    }

}
