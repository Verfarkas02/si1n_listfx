package views;

import javafx.scene.control.ListView;

public class ListPanel extends ListView<String>{
    public ListPanel(){
        this.getItems().add("alma");
        this.getItems().add("szilva");
        this.getItems().add("barack");
        this.getItems().add("körte");
        this.getItems().add("banán");
        this.getItems().add("citrom");
    }

}
