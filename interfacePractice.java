class Phone{
    void call(){
        System.out.println("Phone is calling");
    }

    void sms(){
        System.out.print("Phone is start sms");
    }
}

interface camera{
    void click();
    void record();
}

interface music{
    void play();
    void pause();
    void next();
    void previous();
}

class smartPhone extends Phone implements camera, music{
    void videoCall(){
        System.out.println("SmartPhone Start calling Video");
    }
    public void click(){
        System.out.println("SmartPhone Start calling Video");
    }
   public  void record(){
        System.out.println("SmartPhone Start Video recording");
    }

    public void play(){
        System.out.println("SmartPhone Start play Music");
    }

   public void next(){
        System.out.println("SmartPhone use next for next song ");
    }

    public void pause(){
        System.out.println("SmartPhone Pause the music");
    }

    public void previous(){
        System.out.println("SmartPhone use previous Song");
    }
}

public class interfacePractice {
    public static void main(String[] args) {
    smartPhone sm = new smartPhone();
    sm.pause();
    }
}
