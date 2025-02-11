public class GroveTester {
    public static void main(String[] args) {
        Grove grove1 = new Grove("Grove 1");
        System.out.println(grove1);

        for(int i = 0; i < 6; i++) {
            Tree spruce = new Tree(i, 37, "Spruce");
            grove1.plantTree(spruce);
        }
        System.out.println(grove1);

        grove1.uprootTree(3);
        grove1.uprootTree(5);
        System.out.println(grove1);

        Tree maple = new Tree(7, 13, "Maple");
        grove1.plantTree(maple);
        System.out.println(grove1);
    }
}
