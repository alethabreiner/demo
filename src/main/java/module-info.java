module section6.examples.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens section6.examples.demo to javafx.fxml;
    exports section6.examples.demo;
}