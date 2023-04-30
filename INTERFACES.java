public class INTERFACES {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, left, right, diagonal --> (In all four directions)");
    }
}

class King implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, left, right, diagonal --> (Only moves one unit)");
    }
}

class Rook implements ChessPlayer {
    public void moves(){
        System.out.println("Up, down, left, right");
    }
}
