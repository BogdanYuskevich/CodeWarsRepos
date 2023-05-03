package EasyLvlKatas;

public class highAndLows {
    public static String highAndLow(String numbers) {
        String[] numbersArray = numbers.split(" ");

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;

        for (String number : numbersArray) {
            int num = Integer.parseInt(number);
            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        return highest + " " + lowest;
    }
}