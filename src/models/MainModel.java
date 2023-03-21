package models;

import java.util.ArrayList;

public class MainModel {
    ArrayList<Fruit> fruitList;
    public MainModel() {
        this.fruitList =new ArrayList<>();
        this.initFruit();
    }
    private void initFruit(){
        this.fruitList.add(new Fruit("alma",1));
        this.fruitList.add(new Fruit("szilva",1));
        this.fruitList.add(new Fruit("körte",1));
        this.fruitList.add(new Fruit("barack",1));
        this.fruitList.add(new Fruit("banán",2));
        this.fruitList.add(new Fruit("citrom",2));
    }
    public ArrayList<Fruit> getFruit(){
      
        return this.fruitList;
    }
}
