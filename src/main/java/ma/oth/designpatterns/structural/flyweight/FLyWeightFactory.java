package ma.oth.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FLyWeightFactory {

	public static Map<String, FlyWeight> map;

	static {
		map = new HashMap<String, FlyWeight>();

		map.put("fl01", new FlyWeight2());
		map.put("fl01", new FlyWeight2());
	}

	public static FlyWeight getFlyWeight(String key) {

		return map.get(key);
	}

}
