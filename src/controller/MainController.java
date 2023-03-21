package controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import models.MainModel;
import views.MainPanel;

public class MainController {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainController() {
        this.mainPanel =new MainPanel();
        this.mainModel =new MainModel();
        this.handleEvents();
    }
    public MainPanel getMainPanel(){
        return this.mainPanel;
    }
    private void handleEvents(){
        ComboBox<String> combon= this.mainPanel.getComboPanel();
        combon.setOnAction(e -> {
            this.selectCategory();
        });
    }
    private void selectCategory(){
        //TODO: a selected változó a ComboBoxra kell
        //változzon

        int index= this.mainPanel.getComboPanel().getSelectionModel().getSelectedIndex();
        int selected = index + 1;
        ObservableList<String> newFruiList = FXCollections.observableArrayList();

        this.mainModel.getFruit().forEach(fruit -> {
            if(selected == fruit.getCategory()){
                System.out.println(fruit.getName());
                newFruiList.add(fruit.getName());
            }
        });
        this.mainPanel.getListPanel().setFruits(newFruiList);
    }
}
