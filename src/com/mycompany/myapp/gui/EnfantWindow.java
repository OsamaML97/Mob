/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myapp.gui;

import com.codename1.components.ImageViewer;
import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Image;
import com.codename1.ui.Label;
import com.codename1.ui.TextArea;
import com.codename1.ui.Toolbar;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;


/**
 *
 * @author OsamaML97
 */
public class EnfantWindow extends Form {
    Form current;
private Resources theme;
        public EnfantWindow() {
            theme = UIManager.initFirstTheme("/theme");
        current=this;
        setTitle("Kids Window");
        setLayout(BoxLayout.y());
        ImageViewer img=new ImageViewer(theme.getImage("kinder.png"));
        Toolbar tb = current.getToolbar();
                Image icon = theme.getImage("kinder.png"); 
        Container topBar = BorderLayout.east(new Label(icon));
        topBar.add(BorderLayout.SOUTH, new Label("Nursery School", "SidemenuTagline")); 
        topBar.setUIID("SideCommand");
        tb.addComponentToSideMenu(topBar);
    
    
        //Image img = theme.getImage("/kinder.png");
        //ImageViewer img = new ImageViewer();
        //img.setImage(theme.getImage("icon.jpg"));
        //ImageViewer imgCon = new ImageViewer();
        //ImageViewer rouge = new ImageViewer(theme.getImage("logo.png"));
        tb.addMaterialCommandToSideMenu("Home", FontImage.MATERIAL_HOME, e -> new HomeForm().show()); 

        tb.addMaterialCommandToSideMenu("Events", FontImage.MATERIAL_CHILD_FRIENDLY, e -> new EventWindow().show());
        tb.addMaterialCommandToSideMenu("Send a Message", FontImage.MATERIAL_MESSENGER, e -> new SendMessage().show());
        tb.addMaterialCommandToSideMenu("info", FontImage.MATERIAL_INFO,  e-> new Info().show());
        
        
        
        
        getToolbar().addMaterialCommandToRightBar("LogOut", FontImage.MATERIAL_LOGOUT, e-> new SignIn().show());
        
        

        Button btnAddEnfants = new Button("Add Enfants");
        Button btnListEnfants = new Button("List Enfants");
        Button cherchEnfants = new Button("cherch Enfants");

       
        //Button showUsers =new Button("Users ");
        
        btnAddEnfants.addActionListener(e-> new AddEnfantsForm().show());
        btnListEnfants.addActionListener(e-> new ListEnfantsForm().show());
        cherchEnfants.addActionListener(e-> new CherchEnfForm().show());

        
        //showUsers.addActionListener(e-> new ListUsers(current).show());
        
        addAll(img,btnAddEnfants,btnListEnfants,cherchEnfants);
        
        

    }
}
