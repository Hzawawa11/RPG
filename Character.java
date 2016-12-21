import java.awt.Dialog;
import java.util.Scanner;

class Character extends BChara{
  private Parameter lv;
  private Parameter EXP;	 //if EXP greater than equal lv*ratio, Character’s Level UP　and EXP is initialized to zero!
  private Parameter EXPraio; //100
  private Job job;
  private Ability ability;

  private Dialog campdialog;
  private Dialog battledialog;

  private Body body;

  Character(){
    this.lv = new Parameter();
    this.job = new Job();
    job = new Fighter();

	super.setName("hero");
	setLv(1);
	setMaxhp(20);
	setMp(10);
	setAp(5);
	setAttack(10);
    // this.ability = Ability();
  }

  void setLv(int lv){ this.lv.setValue(lv);}
  String getLv(){ return lv.getValue(); }

//  int maxHP(){return (lv.get_Value() + ability.getVitality() ) * job.getmaxhp_rate(); }// times vitality and para
//  int maxMP(){ return (lv.get_Value() + ability.getIntelligence() ) * job.getmaxmp_rate();}
//  int incAP(){return (lv.get_Value() + ability.getAgility() ) * job.getincap_rate();} // times vitality and para

//  public void initCharacter(){
//	  name.setValue("hero");
//	  lv.setValue(1);
//	  hp.setValue(20);
//	  mp.setValue(10);
//	  ap.setValue(5);
//	  job = new Fighter();
//  }

  public void printStatus(){
	  System.out.println("Name: "+ getName());
	  System.out.println("Lv.: "+ lv.get_Value());
	  System.out.println("Job : "+ job.show());
  }

  public void decideName(){
    Answer ans = new Answer();
    String str;
    System.out.println("名前はなんですか? >");
    while(true){
      Scanner scan = new Scanner(System.in);
      str = scan.next();
      ans.show(str);
      if(ans.action()) break;
    }
    this.setName(str);
  }

}