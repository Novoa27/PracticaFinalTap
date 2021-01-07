package com.prc2.application.views.plantas;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.HashMap;
import java.util.Map;

import com.prc2.application.views.control.Ascensor;
import com.prc2.application.views.main.MainView;

@Route(value = "plantas", layout = MainView.class)
@PageTitle("Plantas")
public class PlantasView extends Div {

	private static final long serialVersionUID = 1L;

	public PlantasView() {
        setId("plantas-view");
        
        Ascensor a1 = new Ascensor();
        Ascensor a2 = new Ascensor();
        Ascensor a3 = new Ascensor();
        
        
       
        Tab tab1 = new Tab("Planta 1");
        Div page1 = new Div();
        page1.add(Layout(a1, a2, a3));
       

        Tab tab2 = new Tab("Planta 2");
        Div page2 = new Div();
        page2.add(Layout(a1, a2, a3));
        page2.setVisible(false);
            

        Tab tab3 = new Tab("Planta 3");
        Div page3 = new Div();
        page3.add(Layout(a1, a2, a3));
        page3.setVisible(false);

        Tab tab4 = new Tab("Planta 4");
        Div page4 = new Div();
        page4.add(Layout(a1, a2, a3));
        page4.setVisible(false);
        
        
        Tab tab5 = new Tab("Planta 5");
        Div page5 = new Div();
        page5.add(Layout(a1, a2, a3));
        page5.setVisible(false);
        
        
        Tab tab6 = new Tab("Planta 6");
        Div page6 = new Div();
        page6.add(Layout(a1, a2, a3));
        page6.setVisible(false);
        
        Tab tab7 = new Tab("Planta 7");
        Div page7 = new Div();
        page7.add(Layout(a1, a2, a3));
        page7.setVisible(false);
       
        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(tab1, page1);
        tabsToPages.put(tab2, page2);
        tabsToPages.put(tab3, page3);
        tabsToPages.put(tab4, page4);
        tabsToPages.put(tab5, page5);
        tabsToPages.put(tab6, page6);
        tabsToPages.put(tab7, page7);
        
        Tabs tabs = new Tabs(tab1, tab2, tab3, tab4, tab5, tab6, tab7);
        Div pages = new Div(page1, page2, page3, page4, page5, page6, page7);
        
        
        
       
        

        tabs.addSelectedChangeListener(event -> {
            tabsToPages.values().forEach(page -> page.setVisible(false));
            Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
            selectedPage.setVisible(true);
           
        });
        
        
        tabs.setFlexGrowForEnclosedTabs(2);
        
        Notification notification = new Notification(
                "Alarma sonando", 6000);

        Button button = new Button("SONIDO");
        
        button.addClickListener(event -> notification.open());
        button.setSizeFull();
        

        add(tabs, pages);
        add(button);
    }
	
	
	public VerticalLayout Layout(Ascensor a1, Ascensor a2, Ascensor a3) {
		 VerticalLayout layout = new VerticalLayout();
	        //VerticalLayout layout1 = new VerticalLayout();
	        //HorizontalLayout layout2 = new HorizontalLayout();
		 
		 	
	        
	        Button button1 = new Button(pisoAscensor(a1));
	        button1.setTabIndex(1);
	        button1.setSizeFull();
	        button1.setThemeName("dark");
	        
	        Button button5 = new Button("BOTON");
	        //button5.addClickListener(); 
	        button5.setTabIndex(2);
	        button5.setSizeFull();
	        button5.setThemeName("light");
	        
	        Button button2 = new Button(pisoAscensor(a2));
	        button2.setTabIndex(3);
	        button2.setSizeFull();
	        button2.setThemeName("dark");
	        
	        Button button6 = new Button("BOTON");
	        button6.setTabIndex(4);
	        button6.setSizeFull();
	        button6.setThemeName("light");
	        
	        Button button3 = new Button(pisoAscensor(a3));
	        button3.setTabIndex(5);
	        button3.setSizeFull();
	        button3.setThemeName("dark");
	        

	        Button button4 = new Button("BOTON");
	        button4.setTabIndex(6);
	        button4.setSizeFull();
	        button4.setThemeName("light");
	        
	        Button button7 = new Button("");
	        button7.isDisableOnClick(); 
	        button7.setTabIndex(7);
	        button7.setSizeFull();
	        button7.setThemeName("dark");
	        
	        
	        layout.add(button1, button5,button2,button6, button3, button4, button7); //,button6,button7,openButton,closeButton,alarmButton);
	        return layout; 
	        //layout2.add(layout,layout1); 
	}
	
	public String pisoAscensor(Ascensor a) {
		
		int b = a.getPisoAscensor();
		
		
		
		return String.valueOf(b); 
		
	}
    
    

}