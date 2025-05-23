module org.example.demochat {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demochat.client to javafx.fxml;
    opens org.example.demochat.server to javafx.fxml;
    exports org.example.demochat;
}