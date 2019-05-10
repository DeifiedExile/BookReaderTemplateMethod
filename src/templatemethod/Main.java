package templatemethod;

public class Main {

    public static void main(String[] args) {
        BookReader book1 = new ReadfromFile();
        book1.readBook();

        BookReader book2 = new ReadfromArray();
        book2.readBook();
        
        BookReader book3 = new ReadFromUser();
        book3.readBook();
    }
}
