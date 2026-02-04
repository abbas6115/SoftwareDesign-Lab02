public class Main {
    public static void main(String[] args) {
        DatabaseInteractor d1 = new DatabaseInteractor();
        for (String[] s : d1.data) {
            System.out.println(s[0]);
        }

        d1.writeToCSV("2", "ethan", "guy");
    }
}