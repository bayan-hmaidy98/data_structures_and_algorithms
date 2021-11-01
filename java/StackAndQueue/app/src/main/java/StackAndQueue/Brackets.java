package StackAndQueue;

public class Brackets {

  public static boolean validateBrackets(String stc) {
    Stack<Character> bracketStack = new Stack<>();
    for (int i = 0; i < stc.length(); i++) {
      if (stc.charAt(i) == '{' || stc.charAt(i) == '[' || stc.charAt(i) == '(') {
        bracketStack.push(stc.charAt(i));
        continue;
      } else if (bracketStack.isEmpty()) {
        return false;
      }

      char bracket;

      if (stc.charAt(i) == ')') {
        bracket = (char) bracketStack.pop();
        if (bracket == '{' || bracket == '[')
          return false;
      } else if (stc.charAt(i) == '}') {
        bracket = (char) bracketStack.pop();
        if (bracket == '(' || bracket == '[')
          return false;
      } else if (stc.charAt(i) == ']') {
        bracket = (char) bracketStack.pop();
        if (bracket == '(' || bracket == '{')
          return false;
      }
    }
    return (bracketStack.isEmpty());
  }
}
