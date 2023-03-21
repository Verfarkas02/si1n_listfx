package views;

import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    ComboPanel comboPanel;
    ListPanel listPanel;
    public MainPanel() {
        this.comboPanel =new ComboPanel();
        this.listPanel= new ListPanel();

        this.getChildren().add(this.comboPanel);
        this.getChildren().add(this.listPanel);
    }
    public ListPanel getListPanel(){
        return this.listPanel;
    }
    public ComboPanel getComboPanel(){
        return this.comboPanel;
    }
}
