import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String playerAdvanceMessage = "";
        String playerPositionMessage = "";
        String finishMessage = "";
        String computerAdvanceMessage = "";
        String computerPositionMessage = "";
        final String startMessage = "Choose a hole from 1 to 4 to throw your ball";

        int playerHoleChoice;
        int playerPosition = 0;
        int playerAdvance = 0;
        int computerAdvance;
        int computerPosition = 0;
        int turn = 0;
        int turnsLost = 0;
        int ballsMissedInARow = 0;
        final int maxTurns = 50;
        final int dimensionX = 60;
        final int dimensionY = 5;
        final int hole1Advance = 1;
        final int hole2Advance = 2;
        final int hole3Advance = 4;
        final int hole4Advance = 6;
        final int finishLineTile = 60;

        double holeDice = 0;
        double horseFallingDice = 0;
        final double hole1Probability = 0.6;
        final double hole2Probability = 0.4;
        final double hole3Probability = 0.3;
        final double hole4Probability = 0.1;
        final double horseFallingProbability = 0.1;

        boolean hasHorseReachedFinishLine = false;
        boolean hasReachedMaxTurns = false;
        boolean hasHorseFallen = false;
        boolean hasComputerWon = false;

        while (!hasHorseReachedFinishLine || !hasComputerWon || !hasReachedMaxTurns) {

            if (!hasHorseFallen) {
                System.out.println(startMessage);

                playerHoleChoice = scanner.nextInt();

                if (playerHoleChoice == 1) {
                    holeDice = Math.random();
                    if (holeDice < hole1Probability) {
                        playerAdvance = hole1Advance;
                        playerPosition += playerAdvance;
                        playerAdvanceMessage = "Player advances " + playerAdvance + " tiles";
                        if (ballsMissedInARow > 0) {
                            ballsMissedInARow = 0;
                        }
                    } else {
                        playerAdvanceMessage = "Player doesn't move";
                        ballsMissedInARow++;
                    }
                } else if (playerHoleChoice == 2) {
                    holeDice = Math.random();
                    if (holeDice < hole2Probability) {
                        playerAdvance = hole2Advance;
                        playerPosition += playerAdvance;
                        playerAdvanceMessage = "Player advances " + playerAdvance + " tiles";
                        if (ballsMissedInARow > 0) {
                            ballsMissedInARow = 0;
                        }
                    } else {
                        playerAdvanceMessage = "Player doesn't move";
                        ballsMissedInARow++;
                    }

                } else if (playerHoleChoice == 3) {
                    holeDice = Math.random();
                    if (holeDice < hole3Probability) {
                        playerAdvance = hole3Advance;
                        playerPosition += playerAdvance;
                        playerAdvanceMessage = "Player advances " + playerAdvance + " tiles";
                        if (ballsMissedInARow > 0) {
                            ballsMissedInARow = 0;
                        }
                    } else {
                        playerAdvanceMessage = "Player doesn't move";
                        ballsMissedInARow++;
                    }

                } else if (playerHoleChoice == 4) {
                    holeDice = Math.random();
                    if (holeDice < hole4Probability) {
                        playerAdvance = hole4Advance;
                        playerPosition += playerAdvance;
                        playerAdvanceMessage = "Player advances " + playerAdvance + " tiles";
                        if (ballsMissedInARow > 0) {
                            ballsMissedInARow = 0;
                        }
                    } else {
                        playerAdvanceMessage = "Player doesn't move";
                        ballsMissedInARow++;
                    }
                }

                if (ballsMissedInARow >= 3) {
                    playerPosition = 0;
                    playerPositionMessage = "Player has missed too many throws in a row, they are returned to position 0";
                    ballsMissedInARow = 0;
                } else {
                    playerPositionMessage = "Player position: Tile " + playerPosition;
                }

            } else {
                playerAdvanceMessage = "The horse fell down, it is still healing and can't move!";
                turnsLost++;
                if (turnsLost >= 2) {
                    hasHorseFallen = false;
                    turnsLost = 0;
                }
            }

            horseFallingDice = Math.random();
            if (horseFallingDice < horseFallingProbability) {
                hasHorseFallen = true;
                playerPosition -= playerAdvance;
                playerAdvanceMessage = "The horse fell down, it does not advance!";
                turnsLost++;
            }

            computerAdvance = (int)((Math.random() * (3 - 1)) + 1);
            computerPosition += computerAdvance;

            computerAdvanceMessage = "Computer advances " + computerAdvance + " tiles";
            computerPositionMessage = "Computer position: Tile: " + computerPosition;

            turn++;

            if (playerPosition >= finishLineTile) {
                hasHorseReachedFinishLine = true;
                finishMessage = "Player reached finish line in turn: " + turn;
            } else if (computerPosition >= finishLineTile) {
                hasComputerWon = true;
                finishMessage = "Computer reached the finish line in turn: " + turn;
            } else if (turn >= maxTurns) {
                hasReachedMaxTurns = true;
                finishMessage = "The horse did not reach the finish line before the max number of turns";
            }

            for (int j = 0; j < dimensionY; j = j + 1) {
                for (int i = 0; i < dimensionX; i = i + 1) {
                    if (j == 1) {
                        if (i == playerPosition) {
                            System.out.print(";");
                        } else if (i == (playerPosition + 1)) {
                            System.out.print("-");
                        } else if (i == (playerPosition + 2)) {
                            System.out.print("P");
                        } else if (i == (playerPosition + 3)) {
                            System.out.print(";");
                        } else if (i == (playerPosition + 4)) {
                            System.out.print("'");
                        } else {
                            System.out.print("-");
                        }
                    } else if (j == 3) {
                        if (i == computerPosition) {
                            System.out.print(";");
                        } else if (i == (computerPosition + 1)) {
                            System.out.print("-");
                        } else if (i == (computerPosition + 2)) {
                            System.out.print("C");
                        } else if (i == (computerPosition + 3)) {
                            System.out.print(";");
                        } else if (i == (computerPosition + 4)) {
                            System.out.print("'");
                        } else {
                            System.out.print("-");
                        }
                    } else {
                        System.out.print("");
                    }
                }
                System.out.println();
            }
            System.out.println("Turn: " + turn);
            System.out.println(playerAdvanceMessage);
            System.out.println(playerPositionMessage);
            System.out.println(computerAdvanceMessage);
            System.out.println(computerPositionMessage);
        }

        System.out.println(finishMessage);

        scanner.close();
    }
}
