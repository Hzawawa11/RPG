import java.util.ArrayList;
import java.util.List;

class Dialog{
  private Text message;
  private List<Icommand> commandL;

  Dialog(){
	    this.message = new Text();
	    this.commandL = new ArrayList<Icommand>();
	  }

  void set(String text, Icommand... cmd){
	  	setmessage(text);
		for (Icommand c : cmd)
			addcommand(c);
  }

  void setmessage(String text){ this.message.setValue(text); }
  String getmessage(){ return message.getValue();}
  void setcommandL(ArrayList command){ this.commandL = command;}
  void addcommand(Icommand cmd){ this.commandL.add(cmd); }

  void showmessage(){
	  System.out.println(this.message.showvalue());
  }

  Dialog Caction (Dialog current, int key){
    return commandL.get(key-1).action();
  }

  void show(){
    int i = 1;
    for(Icommand command : commandL)
      System.out.println(i++ + "." + command.show());
  }

  int cmdSize(){
	  return commandL.size();
  }
}