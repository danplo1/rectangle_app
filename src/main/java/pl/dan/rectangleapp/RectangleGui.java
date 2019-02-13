package pl.dan.rectangleapp;


import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;


@Route // dostęp do biblioteki Vaadim
public class RectangleGui extends VerticalLayout {

//klasa która bedzie nam się wyswoetlała w przeglądarce, bedzie zawierać komponenty z biblioteki Vaadim

    private RectangleRepo rectangleRepo;

    private TextField textFieldHeight;
    private TextField textFieldWidth;
    private Button button;

    @Autowired
    public RectangleGui(RectangleRepo rectangleRepo) { // inicjalizacja pól w konstruktorze

        this.rectangleRepo = rectangleRepo; //wstrzykiwanie rectangleRepo
        textFieldHeight = new TextField("Podaj wysokość: ");
        textFieldWidth = new TextField("Podaj szerokość: ");
        button = new Button(" Dodaj!");

        button.addClickListener(buttonClickEvent -> addRectangle());

        add(textFieldHeight);
        add(textFieldWidth);
        add(button);

    }


    public void addRectangle() {

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(Integer.parseInt(textFieldHeight.getValue()));
        rectangle.setWidth(Integer.parseInt(textFieldWidth.getValue()));
        rectangleRepo.save(rectangle);
    }
}
