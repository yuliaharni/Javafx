/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author USER
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Label kasir;

    @FXML
    private Label hargabarang;

    @FXML
    private Label jumlahbarang;

    @FXML
    private Label jumlahuang;

    @FXML
    private Label totalbelanjaan;

    @FXML
    private TextField HB;

    @FXML
    private TextField JB;

    @FXML
    private TextField JU;

    @FXML
    private TextField TB;

    @FXML
    private Label totalkembalian;

    @FXML
    private TextField TK;

    @FXML
    private Button B1;

    @FXML
    private Button B2;



    @FXML
    void Hitung(ActionEvent event) {
        int totaljumlah = Integer.parseInt(HB.getText()) * Integer.parseInt(JB.getText());
        TB.setText("" + totaljumlah);
        
        int kembalianjumlah = Integer.parseInt(JU.getText())- Integer.parseInt(TB.getText());
        TK.setText(""+ kembalianjumlah);

    }



    @FXML
    void Ulang(ActionEvent event) {
        HB.setText("");
        JB.setText("");
        JU.setText("");
        TB.setText("");
        TK.setText("");

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    //To change body of generated methods, choose Tools | Templates.
    }

}
    

