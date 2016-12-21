class Parameter extends Text{
  private Text text;
  private int value;
  private int max;
  private int min;

  Parameter(){
	  max = 100;
	  min = 1;
  }

  void setText(String text){
    this.text = new Text();
    this.text.setValue(text);
  }
  void setMin(int min){ this.min = min;}
  void setMax(int max){this.max = max;}

  void setValue(int value){
    int v = this.incvalue(value);
    if( v != -1)
      this.value = v;
  }
  int get_Value(){ return value;}

  int incvalue(int v){
    if(v < this.min)
      return -1;
    else if( v > this.max )
      return -1;
    return v;
  }

  String showvalue(){ return this.text.showvalue();}
  String showvalue(int length){ return this.text.showvalue(length);}
}
