package Practice;

public class practice3 extends practice2 {

    public static practice2 findYounger(practice2...player) {
        practice2 younger = player[0];
        for (practice2 play: player) {
            if (younger.getAge() > play.getAge()) {
                younger = play;
            }
        }
        return younger;
    }

    public static void findByCountry(String str, practice2...p) {
        for (practice2 pra: p) {
            if (pra.getCountry().equals(str)) {
                System.out.println(pra.getName());
            }
        }
    }

    public static practice2 findolder(practice2...p) {
        practice2 old = p[0];
        for (practice2 older: p) {
            if (old.getAge() < older.getAge()) {
                old = older;
            }
        }
        return old;
    }
}
