public class Person {
    public static void main(String[] args) {
        String gender = "";
        double d_ram = Math.random() * 10;
        int i_ram = (int) d_ram;

        if (i_ram % 2 == 0) {
            gender = "男性";
        } else {
            gender = "女性";
        }
        speak(gender);
    }

    public static void speak(String six) {
        // System.out.println("HelloWorld!");

        if (six.equals("男性")) {
            System.out.println("I'm a man");
        } else if (six.equals("女性")) {
            System.out.println("I'm a woman");
        } else {
            System.out.println("性別を入力してください");
        }
    }

}
