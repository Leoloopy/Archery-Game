import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PlayersTest {
    private Players players;

    @BeforeEach
    void setUp(){
        players = new Players();
        players.resetPlayerState();
    }

    @Test
    void testThatPlayerClassExist(){
        assertNotNull(players);
    }

    @Test
    void testThatFourPlayersCanBeCreated(){
         Players p1 = new Players();
         Players p2 = new Players();
         Players p3 = new Players();
         Players p4 = new Players();

         Players[] playerArr = {p1, p2, p3, p4};
         for(Players p : playerArr){
            assertNotNull(p);
         }
    }

    @Test
    void testThatPlayersHaveAUniqueID(){
        Players p1 = new Players();
        Players p2 = new Players();
        Players p3 = new Players();
        Players p4 = new Players();

        assertEquals(1, p1.getPlayerID());
        assertEquals(2, p2.getPlayerID());
        assertEquals(3, p3.getPlayerID());
        assertEquals(4, p4.getPlayerID());
    }

    @Test
    void testThatPlayersCanShootArrows(){

        Players p1 = new Players();
        Players p2 = new Players();
        Players p3 = new Players();
        Players p4 = new Players();

        p1.shootArrow();
        assertEquals(1, ArcheryBoard.getBoard()[0][0]);

        p2.shootArrow();
        assertEquals(2, ArcheryBoard.getBoard()[1][0]);

        p3.shootArrow();
        assertEquals(3, ArcheryBoard.getBoard()[2][0]);

        p4.shootArrow();
        assertEquals(4, ArcheryBoard.getBoard()[3][0]);

        ArcheryBoard.displayBoard();
    }

    @Test
    void testThatPlayerWithTheHighestAverageCanWin(){
        Players p1 = new Players();
        Players p2 = new Players();

        p1.shootArrow();
        p2.shootArrow();

        ArcheryBoard.displayBoard();
        assertEquals(p1.getPlayerID(), players.isWinner());
    }
}