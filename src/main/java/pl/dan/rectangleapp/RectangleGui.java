package pl.dan.rectangleapp;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.awt.*;

@Route  // dostęp do biblioteki Vaadim
//klasa która bedzie nam się wyswoetlała w przeglądarce, bedzie zawierać komponenty z biblioteki Vaadim
public class RectangleGui extends VerticalLayout {


    private TextField textFieldHeight;
    private TextField textFieldWidth;
    private Button button;

    public RectangleGui() {
        
    }
}
