class CmdMove implements Icommand{
  private Text Choice_message;
  private Dialog dialog;

  CmdMove(){
    this.Choice_message = new Text();
    this.dialog = new Dialog();
  }
  void set(String text, Dialog dialog){
	  	settext(text);
	  	setdialog(dialog);
  }
  void settext(String text){ this.Choice_message.setValue(text);}
  void setdialog(Dialog dialog){ this.dialog = dialog;}

  public String show(){ return Choice_message.showvalue();}
  public Dialog action(){ return dialog; }
}