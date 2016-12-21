class Ability{
  private  Parameter strength;
  private  Parameter intelligence;
  private  Parameter vitality;
  private  Parameter agility;
  private  Parameter luck;

  void setStrength(int p){ this.strength.setValue(p);}
  int getStrength(){ return strength.get_Value(); }

  void setIntelligence(int p){ this.intelligence.setValue(p); }
  int getIntelligence(){ return intelligence.get_Value(); }

  void setVitality(int p){ this.vitality.setValue(p); }
  int getVitality(){ return vitality.get_Value(); }

  void setAgility(int p){ this.agility.setValue(p); }
  int getAgility(){ return agility.get_Value(); }

  void setLuck(int p){ this.luck.setValue(p); }
  int getLuck(){ return luck.get_Value(); }
}