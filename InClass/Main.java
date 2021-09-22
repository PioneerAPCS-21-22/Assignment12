import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is the first player's name? ");
        String p1 = in.nextLine();
        System.out.print("What is the second player's name? ");
        String p2 = in.nextLine();
        
        Nim game = new Nim(p1, p2);

        System.out.println("Nim Game. Add 1, 2, or 3. First to 21 loses.");
        
        System.out.print("Make your move, " + game.getP1() + " ");
        int num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
        System.out.print("Make your move, " + game.getP2() + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
        System.out.print("Make your move, " + p1 + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
        System.out.print("Make your move, " + p2 + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
        System.out.print("Make your move, " + p1 + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());         
        System.out.print("Make your move, " + p2 + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
        System.out.print("Make your move, " + p1 + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
        System.out.print("Make your move, " + p2 + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
        System.out.print("Make your move, " + p1 + " ");
        num = in.nextInt();
        game.move(num);

        System.out.println("Total: " + game.getTotal());
    }
}
