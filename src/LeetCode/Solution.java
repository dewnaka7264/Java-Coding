package LeetCode;

class Solution {
    public static void main(String[] args){
        int x= -123;
        String y = Integer.toString(x);
        for (int i = y.length() - 1; i > 0; i--) {
            System.out.println(y.charAt(i));
        }


    }
}
