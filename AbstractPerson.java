public class AbstractPerson {
    public void speak(String six) {
        if (six.equals("男性")) {
            System.out.println("I'm a man");
        } else if (six.equals("女性")) {
            System.out.println("I'm a woman");
        } else {
            System.out.println("性別を入力してください");
        }
    }
}
