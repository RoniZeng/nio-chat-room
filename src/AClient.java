import java.io.IOException;

/**
 * Created by 16114 on 2019/8/29.
 */
public class AClient {
    public static void main(String[] args)
            throws IOException {
        new NIOClient().start("AClient");
    }
}
