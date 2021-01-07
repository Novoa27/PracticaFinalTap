package com.prc2.application.views.control;

import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.ArrayList;
import java.util.List;

import com.prc2.application.Edificio;
import com.prc2.application.Estado;
import com.prc2.application.Observer;
import com.prc2.application.displayAscensor;
import com.prc2.application.displayControl;
import com.prc2.application.views.main.MainView;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "control", layout = MainView.class)
@PageTitle("Control")
@RouteAlias(value = "", layout = MainView.class)
public class ControlView extends Div {

    public ControlView() {
        setId("control-view");
        
        VerticalLayout vL = new VerticalLayout(); 

        List<displayControl> displayList = new ArrayList<>();
        
        Edificio edificio =Edificio.getInstance();
		
		Ascensor ascensor0 = edificio.getAscensor(0);
		Ascensor ascensor1 = edificio.getAscensor(1);
		Ascensor ascensor2 = edificio.getAscensor(2);
		
		Piso piso0 = edificio.getPiso(0);
		Piso piso1 = edificio.getPiso(1);
		Piso piso2 = edificio.getPiso(2);
		Piso piso3 = edificio.getPiso(3);
		Piso piso4 = edificio.getPiso(4);
		Piso piso5 = edificio.getPiso(5);
		Piso piso6 = edificio.getPiso(6);


		displayControl c0 = new displayControl(ascensor0);
		displayControl c1 = new displayControl(ascensor1);
		displayControl c2 = new displayControl(ascensor2);
		
		
		ascensor0.attachObserver(c0);
		ascensor0.getEstado();
		
		ascensor1.attachObserver(c1);
		ascensor1.getEstado();
		
		ascensor2.attachObserver(c2);
		ascensor2.getEstado();
		
		
	
		displayList.add(c0);
		displayList.add(c1);
		displayList.add(c2);
       

        Grid<displayControl> grid = new Grid<>(displayControl.class);
        
        

        //grid.addThemeVariants(GridVariant.LUMO_NO_BORDER, GridVariant.LUMO_NO_ROW_BORDERS, GridVariant.LUMO_ROW_STRIPES);

        // The Grid<>(Person.class) sorts the properties and in order to
        // reorder the properties we use the 'setColumns' method.
        //grid.setColumns("Piso", "Estado"); //, "Ascensor", "Planta");
        
        grid.setItems(displayList);
        vL.add(grid); 
        add(vL);
    }

}
