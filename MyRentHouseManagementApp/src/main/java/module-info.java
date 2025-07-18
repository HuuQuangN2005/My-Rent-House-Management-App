module com.nhq.myapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.nhq.myapp to javafx.fxml;
    exports com.nhq.myapp;
}
