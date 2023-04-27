package EasyLvlKatas;

public class OutOfSpace {

    public static String[] spacey(String[] array) {
        String[] result = new String[array.length];
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            result[i] = builder.toString();
        }
        return result;
    }

}