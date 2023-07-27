package com.epam.task;

public class Bus {
    private int id = 1;
    {
        ++id;
        System.out.println(id);
    }

    public Bus(int id){
        this.id = id;
    }

    public Bus(){

    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Bus{");
        sb.append("id=").append(id);
        sb.append('}');
        return sb.toString();
    }

}
