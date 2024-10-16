module com.example.mandeeptest1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.mandeeptest1 to javafx.fxml;
    exports com.example.mandeeptest1;
}