public class Main2 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("ぬるぽえらー！！");
            System.out.println(e.getMessage());
        }
    }
}