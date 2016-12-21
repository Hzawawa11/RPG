import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class Monster extends BChara{
	private Parameter EXP;
	private String[] columns;

	private static final boolean DEBUG = true;

	public Parameter getEXP() {return EXP;}
	public void setEXP(int exp) {this.EXP.setValue(exp);}

	Monster(){
		setMaxhp(10);
		setName("Monster");
		setAttack(2);
		setDefense(2);
		EXP = new Parameter();
		setEXP(100);
	}

	void readMonster (){

		//連想配列にしたいね HashMApとかいうの使う？
		// あとはファイル形式をJSON形式にしてもいいかもね．
		try {
			File file = new File("C:\\Users\\万寿穂\\Desktop\\monster.csv");
			FileInputStream input = new FileInputStream(file);
			InputStreamReader stream = new InputStreamReader(input,"SJIS");
			BufferedReader buffer = new BufferedReader(stream);

			String line;

			while ((line = buffer.readLine()) != null) {

				byte[] b = line.getBytes();
				line = new String(b, "UTF-8");
				columns = line.split(",",-1);

				if(DEBUG){
					for (int j = 0; j < columns.length; j++) {
						System.out.print(" : " + columns[j]);
					}
					System.out.println("");
				}

			}

			input.close();
			stream.close();
			buffer.close();
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
