package is.ru.tictactoe

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    @Test
    public void greetResultsInHello() {
        TicTacToe myGame = new TicTactoe();
        assertEquals(1, myGame.initialize()); }

}

