package com.oneobject.modle;

public class Whx {
    private int id;
    private String name;
    public Whx(){}
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
public String toString(){
        return "id:"+this.id+"name:"+this.name;
}


}
