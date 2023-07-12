package NinethDay.Players;

public class Main extends findYoungestAndOldest {
    public static void main(String[] args) {
        Players p1 = new Players();
        System.out.println("Player 1");
        p1.setName("aniket");
        p1.setAge(23);
        p1.setCountry("INDIA");
        p1.setSports("cricket");
        System.out.println("Name is: "+p1.getName());
        System.out.println("age is: "+p1.getAge());
        System.out.println("country is: "+p1.getCountry());
        System.out.println("sports is: "+ p1.getSports());
        System.out.println();


        Players p2 = new Players();
        System.out.println("Player 2");
        p2.setName("aman");
        p2.setAge(12);
        p2.setCountry("USA");
        p2.setSports("Chess");
        System.out.println("Name is: "+p2.getName());
        System.out.println("age is: "+p2.getAge());
        System.out.println("country is: "+p2.getCountry());
        System.out.println("sports is: "+ p2.getSports());
        System.out.println();


        Players p3 = new Players();
        System.out.println("Player 3");
        p3.setName("nayan");
        p3.setAge(15);
        p3.setCountry("DUBAI");
        p3.setSports("HorseRiding");
        System.out.println("Name is: "+p3.getName());
        System.out.println("age is: "+p3.getAge());
        System.out.println("country is: "+p3.getCountry());
        System.out.println("sports is: "+ p3.getSports());
        System.out.println();

        Players youngest = getYoungestPlayer(p1,p2,p3);
        System.out.println("the youngest player is: "+ youngest.getName());
        System.out.println();

        Players oldest = getOldestPlayer(p1,p2,p3);
        System.out.println("the oldest player is: "+oldest.getName());
        System.out.println();

        System.out.print("player who play for particular country is: ");
        getNameByCountry("USA", p1,p2,p3);
    }
}
