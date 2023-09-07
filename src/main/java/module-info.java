module com.cgd.cgd {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.cgd.cgd to javafx.fxml;
    exports com.cgd.cgd;
}