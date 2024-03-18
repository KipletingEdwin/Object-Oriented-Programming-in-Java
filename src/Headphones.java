public class Headphones {
    String charge = "Micro usb";
    String [] controls = {"power", "volume", "skip", "play/pause"};
    String color = "Red/black";
    static int volume = 0;

    static  boolean power= false;

    public  static  void  powerOn(String[] args){
        power = true;
    }

    public   static  void powerOff(String[] args){
        power = false;
    }

    public  static  void  volumeUp(String[] args){
        volume++;
    }

    public  static  void  volumeDown(String[] args){
        volume--;
    }







}
