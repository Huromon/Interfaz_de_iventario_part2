module org.example.interfaz_de_iventario {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.interfaz_de_iventario to javafx.fxml;
    exports org.example.interfaz_de_iventario;
}