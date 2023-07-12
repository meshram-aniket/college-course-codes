package NinethDay.Players;

public class findYoungestAndOldest extends Players {

    public static Players getYoungestPlayer(Players...player) {
        Players youngest = player[0];
        for (Players p: player) {
            if (youngest.getAge() > p.getAge()) {
                youngest = p;
            }
        }
        return youngest;
    }

    public static void getNameByCountry(String str, Players...players) {

        for (Players name: players) {
            if (name.getCountry().equals(str)){
                System.out.println(name.getName());
            }
        }
    }

    public static Players getOldestPlayer(Players...players) {
        Players oldest = players[0];
        for (Players old: players) {
            if (oldest.getAge() < old.getAge()) {
                oldest = old;
            }
        }
        return oldest;
    }
}
