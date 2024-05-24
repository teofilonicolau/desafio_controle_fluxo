module com.teofilonicolau.desafiocontrolefluxo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.teofilonicolau.desafiocontrolefluxo to javafx.fxml;
    exports com.teofilonicolau.desafiocontrolefluxo;
}
