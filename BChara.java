
public class BChara{
	private Text name;
	private Parameter maxhp;
	private Parameter hp;
	private Parameter mp;
	private Parameter ap;

	private Parameter attack;
	private Parameter defense;

	public void setName(String text){this.name.setValue(text);}
	public String getName(){ return name.getValue(); }

	public Parameter getMaxhp() {return maxhp;}
	public void setMaxhp(int maxhp) {this.maxhp.setValue(maxhp);}
	public Parameter getHp() {return hp;}
	public void setHp(int hp) {this.hp.setValue(hp);}
	public Parameter getMp() {return mp;}
	public void setMp(int mp) {this.mp.setValue(mp);}
	public Parameter getAp() {return ap;}
	public void setAp(int ap) {this.ap.setValue(ap);}

	public Parameter getAttack() {return attack;}
	public void setAttack(int attack) {this.attack.setValue(attack);}
	public Parameter getDefense() {return defense;}
	public void setDefense(int defense) {this.defense.setValue(defense);}

	BChara(){
		initInstance();
		this.setName("test");
		this.setMaxhp(20);
		setMp(10);
		setAp(5);
	}

	BChara(String str){
		initInstance();
		this.setName(str);
		this.setMaxhp(20);
		setMp(10);
		setAp(5);
	}

	public void initInstance(){
		name = new Text();
		maxhp = new Parameter();
		hp = new Parameter();
		mp = new Parameter();
		ap = new Parameter();
		attack = new Parameter();
		defense = new Parameter();
	}


}
