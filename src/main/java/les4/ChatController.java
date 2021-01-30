package les4;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import javax.swing.text.html.ListView;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ChatController {

    public ListView<String> listView;
    public TextField input;

    public void sendMessage(ActionEvent actionEvent) {
        String message = input.getText();
        input.clear();
        listView.getItems().add(message);
    }
}
