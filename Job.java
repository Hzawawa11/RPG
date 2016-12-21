class Job{
  private Text name;
  private int maxhp_rate;
  private int maxmp_rate;
  private int incap_rate;

  Job(){
	 name = new Text();
  }
  void setName(String text){ this.name.setValue(text); }
  String getName(){ return name.getValue(); }

  void setmaxhp_rate(int rate){ this.maxhp_rate = rate; }
  int getmaxhp_rate(){ return maxhp_rate; }

  void setmaxmp_rate(int rate){ this.maxmp_rate = rate; }
  int getmaxmp_rate(){ return maxmp_rate; }

  void setincap_rate(int rate){ this.incap_rate = rate; }
  int getincap_rate(){ return incap_rate; }

  public String show(){
	  return name.showvalue();
  }
}