package EasyLvlKatas;

public class OutlierFinder {
    public static int findOutlier(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        int lastEven = 0;
        int lastOdd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
                lastEven = num;
            } else {
                oddCount++;
                lastOdd = num;
            }
        }

        if (evenCount == 1) {
            return lastEven;
        } else {
            return lastOdd;
        }
    }
}

