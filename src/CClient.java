import java.io.IOException;

/**
 * Created by 16114 on 2019/8/29.
 */
public class CClient {
    public static void main(String[] args)
            throws IOException {
        new NIOClient().start("CClient");
    }
}
