import java.util.Scanner;

class Answer{
  public boolean action(){
    Scanner scan = new Scanner(System.in);
    String str = scan.next();

    str = "y";
    String entry = System.getProperty("line.separator");
    if(str.equals("y")){
      return true;
    }else if (str.equals("yes")){
      return true;
    }else if (str.equals(entry)){
        return true;
    }else {
      return false;
    }
  }
  public void show(String str){
    System.out.print("\"" + str + "\"で決定でよろしいですか?(y/n) :");
  }
}