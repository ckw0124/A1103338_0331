public class A1103338_0331 {
    public static void main(String[] args) {
        animal.showinfo();

        animal snowball = new animal("Snowball", 30, 20, 10);
        snowball.show();
        double distance1 = snowball.distance(5, 1.5);
        System.out.println("Distance: " + distance1);

        human akk = new human("Akk", 170, 65, 20, "Male");
        akk.show();
        double distance2 = akk.distance(10);
        System.out.println("Distance: " + distance2);

        snowqueen elsa = new snowqueen("Elsa", 170, 60, 30, "Female", true);
        elsa.show();
        double distance3 = elsa.distance(8, 1.8);
        System.out.println("Distance: " + distance3);
    }
}
