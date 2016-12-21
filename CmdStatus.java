public class CmdStatus implements Icommand{
	private Text Choice_message;
	private Dialog dialog;
//	private Dialog retDialog;
	private Character hero;
	CmdStatus(){
	  this.Choice_message = new Text();
	  this.dialog = new Dialog();
//	  this.retDialog = new Dialog();
	  this.hero = new Character();
	}

	void set(String text, Dialog dialog, Character hero){
		settext(text);
		setdialog(dialog);
		setchara(hero);
	}

	void settext(String text){ this.Choice_message.setValue(text);}
	void setdialog(Dialog dialog){ this.dialog = dialog;}
//	void setRdialog(Dialog dialog){ this.retDialog = dialog;}
	void setchara(Character hero){ this.hero = hero;}

	public String show(){
		return Choice_message.showvalue();
	}ｑ

	public Dialog action(){
		hero.printStatus();
		return null;
	}
}
