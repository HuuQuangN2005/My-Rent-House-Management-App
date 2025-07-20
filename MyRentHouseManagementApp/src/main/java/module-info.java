module com.nhq.myapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.base;
    
    opens com.nhq.myapp to javafx.fxml;
    exports com.nhq.myapp;
    exports com.nhq.utils;
    exports com.nhq.utils.theme;
    exports com.nhq.utils.mystage;
}
