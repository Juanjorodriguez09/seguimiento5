package Book;
import javax.swing.*;
public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("satanas","mario mendoza",280);
        JOptionPane.showMessageDialog(null,"Info of the book: "+ "\n" + book.getInfo());
    }
}
