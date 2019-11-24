import com.raychenon.Checkers;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * User: raychenon
 * Date: 2019-11-24
 */
public class CheckersTest {

    private static Checkers instance;

    @BeforeClass
    public static void setUp() {
        instance = new Checkers();
    }

    @Test
    public void board1Test() {

        String[] board = new String[]{
                "..X...",
                "......",
                "....X.",
                ".X....",
                "..X.X.",
                "...O.."
        };
        assertEquals(2, instance.countPawnsBeaten(board));
    }

    @Test
    public void board2Test() {

        String[] board = new String[]{
                "X....",
                ".X...",
                "..O..",
                "...X.",
                "....."
        };
        assertEquals(0, instance.countPawnsBeaten(board));
    }

    @Test
    public void board3Test() {

        String[] board = new String[]{
                ".......",
                "..X....",
                "...c...",
                "....X..",
                ".X...c.",
                "..X.X..",
                "...O..."
        };
        assertEquals(3, instance.countPawnsBeaten(board));
    }

}
