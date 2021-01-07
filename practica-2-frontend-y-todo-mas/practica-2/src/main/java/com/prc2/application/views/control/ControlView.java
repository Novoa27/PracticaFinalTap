package com.prc2.application.views.control;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

import com.prc2.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "control", layout = MainView.class)
@PageTitle("Control")
@RouteAlias(value = "", layout = MainView.class)
public class ControlView extends Div {

    public ControlView() {
        setId("control-view");
        List<Ascensor> ascensorList = new ArrayList<>();

        ascensorList.add(new Ascensor(1, "Abiertas", "Parado", "1",2));
        ascensorList.add(new Ascensor(2, "Cerradas", "Subiendo", "2",6));
        ascensorList.add(new Ascensor(3, "Cerradas", "Bajando", "3",4));
        

        Grid<Ascensor> grid = new Grid<>(Ascensor.class);
        grid.setItems(ascensorList);

        grid.removeColumnByKey("id");
        grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);

        // The Grid<>(Person.class) sorts the properties and in order to
        // reorder the properties we use the 'setColumns' method.
        //grid.setColumns("Puertas", "Estado", "Ascensor", "Planta");
        add(grid);
    }

}
