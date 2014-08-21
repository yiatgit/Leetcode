import java.util.Stack;
/*
 * better solution: hash map //http://www.programcreek.com/
 * public static boolean isValid(String s) {
	HashMap<Character, Character> map = new HashMap<Character, Character>();
	map.put('(', ')');
	map.put('[', ']');
	map.put('{', '}');
 
	Stack<Character> stack = new Stack<Character>();
 
	for (int i = 0; i < s.length(); i++) {
		char curr = s.charAt(i);
 
		if (map.keySet().contains(curr)) {
			stack.push(curr);
		} else if (map.values().contains(curr)) {
			if (!stack.empty() && map.get(stack.peek()) == curr) {
				stack.pop();
			} else {
				return false;
			}
		}
	}
 
	return stack.empty();
}
 */
public class ValidParentheses {

	public static boolean isValid(String s) {
		if (s == null || s.length() < 1) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else {
				if (!stack.isEmpty()) {
					char temp = stack.pop();
					if (!isPair(temp, s.charAt(i))) {
						return false;
					}
				}else{
				    return false;
				}
			}
			i++;
		}
		if (stack.isEmpty()) {
			return true;
		}
		return false;
	}

	public static boolean isPair(char a, char b) {
		if (a == '(' && b == ')') {
			return true;

		}

		if (a == '[' && b == ']') {
			return true;

		}

		if (a == '{' && b == '}') {
			return true;

		}

		return false;
	}
}
