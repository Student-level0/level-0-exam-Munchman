import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {
  
    public static void main(String[] args) {
   	 Robot james=new Robot();
   	 james.penDown();
   	 // 3. ask the user what color they would like the Robot to draw
String color =JOptionPane.showInputDialog(null, "what color do you want your square? Blue or Red? No caps please!");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)

if(color=="blue"){
	james.setPenColor(25,30,150);
}
else if(color=="red"){
	james.setPenColor(150,20,60);
}

   	 // 2. set the pen width to 10
james.setPenWidth(10);
   	 // 1. make the Robot draw a shape
for (int i = 0; i < 4; i++) {
	james.move(100);
	james.turn(90);
}
    }

}
