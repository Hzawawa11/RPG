
public class CmdEdit implements Icommand{

	private Text Choice_message;
	private Character hero;

	CmdEdit(){
	  this.Choice_message = new Text();
	  this.hero = new Character();
	}

	void set(String text, Dialog dialog, Character hero){
		settext(text);
		setchara(hero);
	}
	void settext(String text){ this.Choice_message.setValue(text);}

	void setchara(Character hero){ this.hero = hero;}

	public String show(){
		return Choice_message.showvalue();
	}

	public Dialog action(){
		hero.decideName();
		return null;
	}
}
