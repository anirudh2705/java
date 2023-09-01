package oop5.interfaces;

public class newcar {
    private engine engine = new petrolengine();;
    private media media = new mediaplayer();

    public newcar(){
        System.out.println("any");
    }
   
    public newcar(engine engine){
        this.engine = engine;
    }

    public void type(){
        engine.type();
    }

    public void cdplayer(){
        media.speed();
    }
}
