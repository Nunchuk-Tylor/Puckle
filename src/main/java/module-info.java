module com.nunchuktylor.puckle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.nunchuktylor.puckle to javafx.fxml;
    exports com.nunchuktylor.puckle;
}