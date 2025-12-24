class Tv{
    public void changeChannel(){
        System.out.println("Channel is Changed in TV");
    }

    public void switchOn(){
        System.out.println("TV is Switchhed on");
    }
}

class Smarttv extends Tv{
    @Override
    public void changeChannel(){
        System.out.println("In SmartTv Channel is Changed");
    }
    @Override
    public void switchOn(){
        System.out.println("Smarttv is Switchhed on");
    }

// This function will not work die to dynamic Method Dispatching
    public void browse(){
        System.out.println("Browse Is Searching");
    }
}

public class practiceOverriding1 {
    public static void main(String[] args) {
    Tv tv1 = new Smarttv();
    tv1.switchOn();
    tv1.changeChannel();

    }
}
