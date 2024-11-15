import java.io.InputStream;

public class Dublicate {
    public static void main(String[] args) {
        InputStream original = Dublicate.class.getResourceAsStream("/chess-horse.png");
        InputStream duplicate = Dublicate.class.getResourceAsStream("/chess-horse.png");
    }


}
