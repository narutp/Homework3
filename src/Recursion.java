import java.util.List;

/**
 * Recursion practice
 * 
 * @author Narut Povoorakit
 * @version 07.04.60
 * 
 */
public class Recursion {

	/**
	 * Remove duplicate consecutive items from a list, changing the list parameter.
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list
	 * will contain {a, b, c, b, c}. Only consecutive duplicates are removed.
	 * Objects are compared using their own equals method.
	 * @param list of any kind of object. The elements are not null.
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List unique(List list) {
		if (list.size() == 1)
			return list;

		String s = list.get(list.size() - 1) + "";
		if (list.get(list.size() - 1).equals(list.get(list.size() - 2))) {
			return unique(list.subList(0, list.size() - 1));
		}

		list = unique(list.subList(0, list.size() - 1));
		list.add(s);
		return list;
	}
}
