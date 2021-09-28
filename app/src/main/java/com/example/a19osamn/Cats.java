package com.example.a19osamn;

public class Cats {
    private String name;
    private String location;
    private int height;

    public Cats (String Name, String Location, int Height){
        name=Name;
        location=Location;
        height=Height;
    }
    public Cats (String Name){
        name=Name;
        location="";
        height=-1;
    }

    @Override
    public String toString(){return name;}
    public String info(){
        String str=name;
        str+=" is located in ";
        str+=location;
        str+=" and has an height of ";
        str+=Integer.toString(height);
        str+=" m ";
        return str;
    }

    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }

}
