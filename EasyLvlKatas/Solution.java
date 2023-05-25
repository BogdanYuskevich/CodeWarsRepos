package EasyLvlKatas;

public class Solution {
    public static int[] twoSumsElement(int[] num, int target) {
        int[] index = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if ((num[i] + num[j] == target) && i != j) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }
}
