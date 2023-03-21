package views;

import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class ListPanel extends ListView<String>{
    public ListPanel(){
    }
    public void setFruits(ObservableList<String> fruiList){
        this.setItems(fruiList);
    }
}
