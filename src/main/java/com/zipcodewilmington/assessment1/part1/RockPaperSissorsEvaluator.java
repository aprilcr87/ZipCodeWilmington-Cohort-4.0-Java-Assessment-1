package com.zipcodewilmington.assessment1.part1;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winningSign = "";
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        if (handSign.equals("rock")) {
            winningSign = p;
        } else if (handSign.equals("paper")) {
            winningSign = s;
        } else if (handSign.equals("scissors")) {
            winningSign = r;
        }
        return winningSign;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String losingSign = "";
        String r = "rock";
        String p = "paper";
        String s = "scissors";
        if (handSign.equals("rock")) {
            losingSign = s;
        } else if (handSign.equals("paper")) {
            losingSign = r;
        } else if (handSign.equals("scissors")) {
            losingSign = p;
        }
        return losingSign;
    }


    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        //Hacky. I have shamed my family : (
        String winningSign = "";
        String r = "rock";
        String p = "paper";
        String s = "scissor";
        if (handSignOfPlayer1.equals(p) && handSignOfPlayer2.equals(r)) {
            winningSign = p;
        } else if (handSignOfPlayer1.equals(r) && handSignOfPlayer2.equals(s)) {
            winningSign = r;
        } else if (handSignOfPlayer1.equals(s) && handSignOfPlayer2.equals(p)) {
            winningSign = s;
        }
        return winningSign;
    }
}
