package domaine;

import java.util.*;

public class ElementUtil {

	private ElementUtil() {
	}// classe utilitaire: visibilité du constructeur = private.

	public static <T> T getElement(List<T> mt) {

		int lastObject = mt.size() - 1;

		if (mt.get(lastObject) != null) {
			return mt.get(lastObject);
		} else
			return null;
	};

}
