/**
 *
 */
import java.util.Date;

/**
 * @author Hanzawa
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    RPG game = new RPG();
	    game.adventure();

	    Date date = new Date();
	    System.out.println("Complete time:"+ date.toString());

	}

}
