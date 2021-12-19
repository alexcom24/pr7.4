import java.util.LinkedList;
public class GameDrunk {
    private LinkedList<Integer> player1;
    private LinkedList<Integer> player2;

    public void setPlayer1(LinkedList<Integer> player1) {
        this.player1 = player1;
    }

    public void setPlayer2(LinkedList<Integer> player2) {
        this.player2 = player2;
    }

    public LinkedList<Integer> getPlayer1() {
        return player1;
    }

    public LinkedList<Integer> getPlayer2() {
        return player2;
    }
    public void Step(LinkedList<Integer> player1, LinkedList<Integer> player2, int k) {
        int b;
        int b1;
        if ((player1.peekFirst()==9) && (player2.peekFirst()==0)) {
            b = player2.pollFirst();
            b1 = player1.pollFirst();
            player2.addLast(b);
            player2.addLast(b1);
            if (player1.peekFirst() == null) {
                System.out.println("Second, " + k);

            }
        }
        else
        if ((player2.peekFirst()==9) && (player1.peekFirst()==0)) {
            b = player1.pollFirst();
            b1 = player2.pollFirst();
            player1.addLast(b);
            player1.addLast(b1);
            if (player2.peekFirst() == null) {
                System.out.println("First, " + k);

            }
        }
        else
        if (player1.peekFirst() < player2.peekFirst()) {
            b = player2.pollFirst();
            b1 = player1.pollFirst();
            player2.addLast(b);
            player2.addLast(b1);
            if (player1.peekFirst() == null) {
                System.out.println("Second, " + k);

            }
        }
        else {
            b = player1.pollFirst();
            b1 = player2.pollFirst();
            player1.addLast(b);
            player1.addLast(b1);
            if (player2.peekFirst() == null) {
                System.out.println("First, " + k);

            }
        }
    }
}
