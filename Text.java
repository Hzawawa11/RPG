class Text{
  private String value;
  String getValue(){ return value; }
  void setValue(String value){ this.value = value;}
  String showvalue(){  return value; }

  String showvalue(int length){
    String format;
    if(this.value.length() > length)
      format = "%."+length+"s" ;
    else
      format = "%"+length+"s";
    return String.format(format, value);
  }
}
