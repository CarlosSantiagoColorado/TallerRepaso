module com.example.tallerrepaso {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.tallerrepaso to javafx.fxml;
    exports com.example.tallerrepaso;
}