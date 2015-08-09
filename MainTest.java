package lanceur;

import java.util.*;

import domaine.MyType;
import domaine.ElementUtil;


public class MainTest {

	public static void main(String[] args) {

		List<String> monts = Arrays.asList("Everest", "K2", "MontBlanc", "MontMcKinley", "Kilimandjaro");
		List<Integer> altitudes = Arrays.asList(8800, 8700, 4400, 6100, 5800);
		List<MyType> continents = Arrays.asList(new MyType("Asie"), new MyType("Amérique"), new MyType("Europe"));

		System.out.println(ElementUtil.getElement(monts));
		System.out.println(ElementUtil.getElement(altitudes));
		System.out.println(ElementUtil.getElement(continents));

	}

}
