import java.util.Scanner;

public class CmdBattle implements Icommand{

	private Text Choice_message;
	private Dialog dialog;

	private Fight fight;
	private UseItem item;
	private CmdMove escape;

	CmdBattle(){
		this.Choice_message = new Text();
		this.dialog = new Dialog();

		settext("敵とたたかう");

		this.fight = new Fight();
		fight.settext("たたかう");
		this.item = new UseItem();
		item.settext("アイテムを使う");
		this.escape = new CmdMove();
		escape.set("にげる", null);
		dialog.set("Monster"+"があらわれた!!", fight, item, escape);
	}

	void set(String message, Dialog dialog){
		settext(message);
		setdialog(dialog);
	}

	void settext(String text){ this.Choice_message.setValue(text);}
	void setdialog(Dialog dialog){ this.dialog = dialog;}
	Dialog getDialog(){ return this.dialog;}

	public String show(){
		return Choice_message.showvalue();
	}

	public Dialog action(){
		while(true){
			dialog.showmessage(); //説明文
			dialog.show(); //コマンド一覧

			System.out.println(" > ");

			Scanner scan = new Scanner(System.in);
			int key = Integer.parseInt(scan.next());
			if(key == 3){
				break;
			}
			dialog.setmessage("つぎに何をする?");
			dialog.Caction(dialog, key);
		}
		return null;
	}

}
