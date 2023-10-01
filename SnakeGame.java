
package snakegame;
import javax.swing.*;

public class SnakeGame extends JFrame{
   SnakeGame(){//constructor of object of main class

       super("Snake Game");//use to give heading
       add(new Board()); //to add whatever we write in board class on frame.
       pack(); //refreshes frame to make changes visi
       
     
       setLocationRelativeTo(null);//to align frame in center
       setResizable(false);
        //to make frame

        }
    
    public static void main(String[] args) {
        new SnakeGame().setVisible(true); //object
    }
    
}
