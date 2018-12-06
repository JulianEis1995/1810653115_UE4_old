import java.util.Date;

public class Aufruf
{
    public static void main(String[] args)
    {
        Book a = new Book(200, new Date(), "My Book", "1234567-1231231-12312312-12312");
        System.out.println("Das Buch hat " + a.getPages() + " Seiten, wurde am " + a.getReleased() + " veröffentlicht und hat den Titel " + a.getTitle());
    }
}
