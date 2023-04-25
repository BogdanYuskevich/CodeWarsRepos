package EasyLvlKatas;

public class theOffice {

    public static String outed(Person[] meet, String boss) {
        int allHapines = 0;
        int numOfpeoples = meet.length + 1;

        Person bossPerson = null;
        for (Person p : meet) {
            if (p.name.equals(boss)) {
                bossPerson = p;
                break;
            }
        }

        if (bossPerson != null) {
            allHapines += bossPerson.happiness * 2;
        }

        for (Person p : meet) {
            allHapines += p.happiness;
        }

        int averageHappynes = allHapines / numOfpeoples;

        if (averageHappynes <= 5) {
            return "Get Out Now!";
        } else {
            return "Nice Work Champ!";
        }

    }
}
