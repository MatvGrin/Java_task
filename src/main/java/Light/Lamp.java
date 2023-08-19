package Light;

public class Lamp {
    private boolean state = false;

    public void switchOn(){
        state = true;
    }
    public void switchOff(){
        state = false;
    }
    public boolean isLight(){
        return state;
    }
    public void showLampState(){
        if(state == true){
            System.out.println("Lamp is working");
        }else {
            System.out.println("Lamp is not working");
        }
    }
}
