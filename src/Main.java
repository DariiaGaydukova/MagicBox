public class Main {
    public static void main(String[] args) {

        MagicBox<String> magicBox1 = new MagicBox<String>(3);
        magicBox1.add("Cat");
        magicBox1.add("Dog");
        magicBox1.add("Rabbit");


        String surprise1 = magicBox1.pick();
        System.out.println(surprise1);

        MagicBox<Integer> magicBox2 = new MagicBox<Integer>(4);
        magicBox2.add(3);
        magicBox2.add(2);
        magicBox2.add(1);
        magicBox2.add(4);

        int surprise2 = magicBox2.pick();
        System.out.println(surprise2);

    }
}