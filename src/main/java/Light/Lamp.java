package Light;

public class Lamp {
    private boolean state = false;

    public void switchOn(){
        state = true;
    }
    public void switchOff(){
        state = false;
    }
    public Object isLight(){
        if (state == true){
            return 0;
        }
        return null;
    }
    public void showLampState(){
        if(state == false && state == true){
            System.out.println("Lamp is not working");
        }else {
            System.out.println("Lamp is working");
        }
    }
}
