import java.util.Scanner;
import java.util.regex.Pattern;

public class RPG {
	private Dialog current;
	private Dialog tmp;
	private Character hero; //or heroine
	private Monster monster;

	private Dialog title;
	private Dialog bar;

	private CmdMove tostart;
	private CmdMove tobar;
	private CmdBattle battle;

	private CmdEdit create;
	private CmdStatus status;


	RPG(){
		this.hero = new Character();
		this.monster = new Monster();
		monster.readMonster();
		this.current = new Dialog();
		this.tmp = new Dialog();

		this.title = new Dialog();
		this.bar = new Dialog();

		this.tostart = new CmdMove();
		this.tobar = new CmdMove();
		this.create = new CmdEdit();
		this.status = new CmdStatus();
		this.battle = new CmdBattle();

		title.set("Game Start!", tostart);
		bar.set("ここは酒場です", create, status, battle);


		tostart.set("はじめから", bar);
		create.set("キャラクターを作成", bar, hero);
		status.set("ステータスの表示", bar, hero);

		tobar.set("酒場へ移動", bar);

	}
	void adventure(){
		current = title;
		while(true){
			current.showmessage(); //説明文
			current.show(); //コマンド一覧

			System.out.println(" > ");

			Scanner scan = new Scanner(System.in);
			int key;
			if((key = ReadException(scan.next())) == -1)
				continue;
			tmp = current.Caction(current, key);
			current = (tmp != null)? tmp :current; //実行 → 次の状態
		}
	}

	public boolean isNumber(String s) {
	    return Pattern.compile("^-?[0-9]+$").matcher(s).find();
	}

	public int ReadException(String str){
		if(!isNumber(str)){
			System.out.println("Caution!:数字を入力してください．");
			return -1;
		}

		int key = Integer.parseInt(str);
		if(!(key <= current.cmdSize() && key > 0)){
			System.out.println("Caution!:出力された数値内での入力にしてください");
			return -1;
		}
		return key;
	}

}
