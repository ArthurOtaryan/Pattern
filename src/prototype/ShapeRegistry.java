package prototype;

import java.util.HashMap;
import java.util.Map;

/** Реестр прототипов: хранит заготовки и выдаёт их копии. */
public class ShapeRegistry {
    private final Map<String, Shape> prototypes = new HashMap<>();

    public void register(String key, Shape shape) {
        prototypes.put(key, shape);
    }

    public Shape get(String key) {
        Shape prototype = prototypes.get(key);
        if (prototype == null) {
            throw new IllegalArgumentException("Нет прототипа: " + key);
        }
        return prototype.copy();
    }
}
