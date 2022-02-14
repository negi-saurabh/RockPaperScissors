package imc.homeassignment;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class RockPaperScissorsTest {

    @Test
    public void testRockBeatsScissors() {
        RockPaperScissors rps = new RockPaperScissors();
        assertTrue("Expected Result : Rock Beats Scissors, but Actual Result : Scissors Beats Rock",rps.winner(Choices.ROCK, Choices.SCISSORS));
    }

    @Test
    public void testRockBeatsPaper() {
        RockPaperScissors rps = new RockPaperScissors();
        assertFalse("Expected Result : Rock can't beat Paper, but Actual Result : Rock beats paper",rps.winner(Choices.ROCK, Choices.PAPER));
    }

    @Test
    public void testScissorsBeatsPaper() {
        RockPaperScissors rps = new RockPaperScissors();
        assertTrue("Expected Result : Scissors can Beat Paper  , but Actual Result : Paper beats scissors",rps.winner(Choices.SCISSORS, Choices.PAPER));
    }

    @Test
    public void testScissorsBeatsRock() {
        RockPaperScissors rps = new RockPaperScissors();
        assertFalse("Expected Result : Scissors cannot Beat Rock  , but Actual Result : Scissors Beats Rock",rps.winner(Choices.SCISSORS, Choices.ROCK));
    }

    @Test
    public void testPaperBeatsRock() {
        RockPaperScissors rps = new RockPaperScissors();
        assertTrue("Expected Result : Paper Beats Rock  , but Actual Result : Rock Beats Paper",rps.winner(Choices.PAPER, Choices.ROCK));
    }

    @Test
    public void testPaperBeatsScissors() {
        RockPaperScissors rps = new RockPaperScissors();
        assertFalse("Expected Result : Paper cannot Beat Scissors , but Actual Result : Paper beats Scissors",rps.winner(Choices.PAPER, Choices.SCISSORS));
    }
}