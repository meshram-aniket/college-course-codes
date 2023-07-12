package Practice;

public class main extends practice3 {

    public static void main(String[] args) {
        practice2 p = new practice2();
        p.setName("aniket");
        System.out.println(p.getName());
        p.setAge(23);
        System.out.println(p.getAge());
        p.setSports("cricket");
        System.out.println(p.getSports());
        p.setCountry("india");
        System.out.println(p.getCountry());
        System.out.println();


        practice2 p1 = new practice2();
        p1.setName("aman");
        System.out.println(p1.getName());
        p1.setAge(34);
        System.out.println(p1.getAge());
        p1.setSports("chess");
        System.out.println(p1.getSports());
        p1.setCountry("dubai");
        System.out.println(p1.getCountry());
        System.out.println();


        practice2 p2 = new practice2();
        p2.setName("nayan");
        System.out.println(p2.getName());
        p2.setAge(13);
        System.out.println(p2.getAge());
        p2.setSports("badminton");
        System.out.println(p2.getSports());
        p2.setCountry("china");
        System.out.println(p2.getCountry());
        System.out.println();

        practice2 younger = findYounger(p,p1,p2);
        System.out.println(younger.getName());

        findByCountry("india", p,p1,p2);

        practice2 older = findolder(p,p1,p2);
        System.out.println(older.getName());
    }
}
