package com.prc2.application.views.ascensores;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.HashMap;
import java.util.Map;


import com.prc2.application.views.main.MainView;

@Route(value = "ascensores", layout = MainView.class)
@PageTitle("Ascensores")
public class AscensoresView extends Div {
	
	


    public AscensoresView() {
        setId("ascensores-view");
        VerticalLayout layout1 = new VerticalLayout();
        VerticalLayout layout2 = new VerticalLayout();
        VerticalLayout layout3 = new VerticalLayout();
       
        SplitLayout layout11 = new SplitLayout();
        SplitLayout layout21 = new SplitLayout();
        SplitLayout layout31 = new SplitLayout();
        
                
        
        Button button1 = new Button("1");
        button1.setTabIndex(1);
        Button button2 = new Button("2");
        button2.setTabIndex(2);
        Button button3 = new Button("3");
        button3.setTabIndex(3);
        Button button4 = new Button("4");
        button4.setTabIndex(4);
        Button button5 = new Button("5");
        button5.setTabIndex(5);
        Button button6 = new Button("6");
        button6.setTabIndex(6);
        Button button7 = new Button("7");
        button7.setTabIndex(7);
        Button openButton = new Button("Open", new Icon(VaadinIcon.CARET_RIGHT));
        openButton.setTabIndex(8);
        Button closeButton = new Button("Close", new Icon(VaadinIcon.CARET_LEFT));
        closeButton.setTabIndex(9);
        Button alarmButton = new Button("Alarma", new Icon(VaadinIcon.BELL_O));
        alarmButton.setTabIndex(10);
        Button disp = new Button("Planta: "+"6");
        disp.setTabIndex(11);
        disp.setSizeFull();
        disp.setThemeName("dark");
        
                
        Button button12 = new Button("1");
        button1.setTabIndex(1);
        Button button22 = new Button("2");
        button2.setTabIndex(2);
        Button button32 = new Button("3");
        button3.setTabIndex(3);
        Button button42 = new Button("4");
        button4.setTabIndex(4);
        Button button52 = new Button("5");
        button5.setTabIndex(5);
        Button button62 = new Button("6");
        button6.setTabIndex(6);
        Button button72 = new Button("7");
        button7.setTabIndex(7);
        Button openButton2 = new Button("Open", new Icon(VaadinIcon.CARET_RIGHT));
        openButton.setTabIndex(8);
        Button closeButton2 = new Button("Close", new Icon(VaadinIcon.CARET_LEFT));
        closeButton.setTabIndex(9);
        Button alarmButton2 = new Button("Alarma", new Icon(VaadinIcon.BELL_O));
        alarmButton.setTabIndex(10);
        Button disp2 = new Button("6");
        disp2.setTabIndex(11);
        disp2.setSizeFull();
        disp2.setThemeName("dark");
        
        Button button13 = new Button("1");
        button1.setTabIndex(1);
        Button button23 = new Button("2");
        button2.setTabIndex(2);
        Button button33 = new Button("3");
        button3.setTabIndex(3);
        Button button43 = new Button("4");
        button4.setTabIndex(4);
        Button button53 = new Button("5");
        button5.setTabIndex(5);
        Button button63 = new Button("6");
        button6.setTabIndex(6);
        Button button73 = new Button("7");
        button7.setTabIndex(7);
        Button openButton3 = new Button("Open", new Icon(VaadinIcon.CARET_RIGHT));
        openButton.setTabIndex(8);
        Button closeButton3 = new Button("Close", new Icon(VaadinIcon.CARET_LEFT));
        closeButton.setTabIndex(9);
        Button alarmButton3 = new Button("Alarma", new Icon(VaadinIcon.BELL_O));
        alarmButton.setTabIndex(10);
        Button disp3 = new Button("6");
        disp3.setTabIndex(11);
        disp3.setSizeFull();
        disp3.setThemeName("dark");
        
        layout1.add(button1,button2,button3,button4,button5,button6,button7,openButton,closeButton,alarmButton);
        layout2.add(button12,button22,button32,button42,button52,button62,button72,openButton2,closeButton2,alarmButton2);
        layout3.add(button13,button23,button33,button43,button53,button63,button73,openButton3,closeButton3,alarmButton3);
       
        layout11.addToPrimary(layout1);
        layout11.addToSecondary(disp);
        layout11.setPrimaryStyle("minWidth", "150px");
        layout11.setPrimaryStyle("maxWidth", "150px");
        
        //layout.setPrimaryStyle("background", "salmon");
        
        layout21.addToPrimary(layout2);
        layout21.addToSecondary(disp2);
        layout21.setPrimaryStyle("minWidth", "150px");
        layout21.setPrimaryStyle("maxWidth", "150px");
        
        layout31.addToPrimary(layout3);
        layout31.addToSecondary(disp3);
        layout31.setPrimaryStyle("minWidth", "150px");
        layout31.setPrimaryStyle("maxWidth", "150px");
        
        
        
        
        
        Tab tab1 = new Tab("Ascensor 1");
        Div page1 = new Div();
        page1.setText("Botonera del Ascensor");
        page1.add(layout11);

        Tab tab2 = new Tab("Ascensor 2");
        Div page2 = new Div();
        page2.setText("Botonera del Ascensor"); 
        page2.add(layout21);
        page2.setVisible(false);

        Tab tab3 = new Tab("Ascensor 3");
        Div page3 = new Div();
        page3.setText("Botonera del Ascensor");
        page3.add(layout31);
        page3.setVisible(false);

        Map<Tab, Component> tabsToPages = new HashMap<>();
        tabsToPages.put(tab1, page1);
        tabsToPages.put(tab2, page2);
        tabsToPages.put(tab3, page3);
        Tabs tabs = new Tabs(tab1, tab2, tab3);
        Div pages = new Div(page1, page2, page3);

        tabs.addSelectedChangeListener(event -> {
            tabsToPages.values().forEach(page -> page.setVisible(false));
            Component selectedPage = tabsToPages.get(tabs.getSelectedTab());
            selectedPage.setVisible(true);
        });
        tabs.setFlexGrowForEnclosedTabs(1);

        add(tabs, pages);
    }
    

}
