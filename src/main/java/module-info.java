module OOPWitchcraft {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens OOPWitchcraft to javafx.fxml;
    opens OOPWitchcraft.controllers to javafx.fxml;
    opens OOPWitchcraft.scenes to javafx.fxml;
    opens OOPWitchcraft.core to javafx.base;
    opens OOPWitchcraft.auth to javafx.base;
    opens OOPWitchcraft.items to javafx.base;
    opens OOPWitchcraft.transactions to javafx.base;

    exports OOPWitchcraft;
    exports OOPWitchcraft.controllers;
    exports OOPWitchcraft.scenes;
}