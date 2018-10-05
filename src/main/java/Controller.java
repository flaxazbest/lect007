import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    TableView<Item> table;

    @FXML
    TableColumn ID;

    @FXML
    TableColumn product;

    @FXML
    TableColumn count;

    @FXML
    TextField prod;

    @FXML
    TextField number;

    public void add(ActionEvent actionEvent) {
        String p = prod.getText();
        try {
            double d = Double.valueOf(number.getText());

            Item item = new Item(p, d);
            table.getItems().add(item);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void initialize(URL location, ResourceBundle resources) {
        ID.setCellValueFactory(
                new PropertyValueFactory<Item,Long>("id")
        );
        product.setCellValueFactory(
                new PropertyValueFactory<Item, String>("name")
        );
        count.setCellValueFactory(
                new PropertyValueFactory<Item, Double>("number")
        );

        table.setEditable(true);
        count.setEditable(true);
    }
}
