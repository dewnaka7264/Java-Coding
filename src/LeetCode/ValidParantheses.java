package LeetCode;

public class ValidParantheses {
    String a = "{}";
    String b = "[]";
    String c = "()";

    public boolean isValid(String s){
        if (s.contains(a) || s.contains(b) || s.contains(c)) {
        return true;
        }
    return false;}


    }
