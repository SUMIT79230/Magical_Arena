import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class JunitTestCases {
    @Test
    public void testMain() {
        String input = "5000\n5\n10\n100\n10\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Main.main(new String[]{});
    }
    
    @Test
    public void testPlayerAWin() {
        Player playerA = new Player(5000, 5, 10, "Player A");
        Player playerB = new Player(100, 10, 50, "Player B");
        Match match = new Match(playerA, playerB);
        match.start();
        assertTrue(playerA.isAlive());
    }
    
    @Test
    public void testPlayerBWin() {
        Player playerA = new Player(5, 5, 10, "Player A");
        Player playerB = new Player(100, 10, 50, "Player B");
        Match match = new Match(playerA, playerB);
        match.start();
        assertTrue(playerB.isAlive());
    }
}
