module com.example.programmingtehnologydecorator {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.programmingtehnologydecorator.domen to javafx.fxml;
    exports com.example.programmingtehnologydecorator.domen;
}