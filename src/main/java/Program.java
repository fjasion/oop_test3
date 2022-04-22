import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        System.out.println("Some shit");

        System.out.println("More shit");
        Lwjgl3ApplicationConfiguration q = new Lwjgl3ApplicationConfiguration();
        q.disableAudio(false);
    }
}
