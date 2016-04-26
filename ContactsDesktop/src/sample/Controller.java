package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import static java.awt.SystemColor.text;

public class Controller implements Initializable {

    @FXML
    ListView<Contact> list;

    @FXML
    TextField textName;

    @FXML
    TextField textPhoneNumber;

    @FXML
    TextField textEmail;

    @Override
            public void initialize(URL location, ResourceBundle resources){
        list.setItems(contacts);
    }

    ObservableList<Contact> contacts = FXCollections.observableArrayList();



    public void addContact(){
        //try to add new contacts
        try {
            contacts.add(new Contact(textName.getText() , textPhoneNumber.getText() , textEmail.getText()));
        }
        //catch Exception
        catch (Exception e){
            //print nothing, send to standard error stream
            System.err.println();
        }
    }
    public void removeContact(){
        Contact item = (Contact) list.getSelectionModel().getSelectedItem();
        contacts.remove(item);
    }

}
