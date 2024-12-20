module com.hotelreservation.hotelreservation {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.hotelreservation.hotelreservation to javafx.fxml;
    exports com.hotelreservation.hotelreservation;
}