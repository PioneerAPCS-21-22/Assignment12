
/**
 * This class represents a game of Nim.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nim {
    
    // private instance variables
    // running total (integer)
    // player 1 name (String)
    // player 2 name (String)
    
    private int total;
    private String p1;
    private String p2;
    
    
    // constructor(s)
    // initialize all instance variables
    // parameters: two Strings for the names
    // total = 0
    
    public Nim(String name1, String name2) {
        total = 0;
        p1 = name1;
        p2 = name2;
    }
    
    
    // class methods
    
    // move()
        // add move to running total
        // param: int for move
        // return: none
    public void move(int m) {
        // total = total + m;
        
        total += m;  // shorthand
    }
    
    // getters: total and the two names
    // getTotal()
        // no params
        // return int
    public int getTotal() {
        return total;
    }
        
    // getP1()
        // no params
        // return String
    public String getP1() {
        return p1;
    }
        
    // getP2()
        // no params
        // return String
    public String getP2() {
        return p2;
    }
        
        
        
        
}





