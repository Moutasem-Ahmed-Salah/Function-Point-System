#Function Point Calculator
This dashboard build by using java swing with flatlaf look and feel
each menu and submenu shows diffrent form each ae used for calculating either TCF,UFP or LOC and a brief description about function point
 
### Library use
- flatlaf-3.1.1.jar
- flatlaf-extras-3.1.1.jar
- svgSalamander-1.1.4.jar

### Sample code to show form
``` java
//  Application class from package raven.application
//  Parameter as java.awt.Component

Application.mainForm.showForm(new PanelForm());
```
### Menu
``` java
menu.addMenuEvent(new MenuEvent() {
    @Override
    public void menuSelected(int index, int subIndex) {
        if (index == 1) {
            if (subIndex == 1) {
                Application.mainForm.showForm(new UFP());
            } else if (subIndex == 2) {
                Application.mainForm.showForm(new TCF1());
            }
        }
    }
});
```
Modify menu item and submenu item in class [raven.menu.Menu.java](https://github.com/DJ-Raven/java-ui-dashboard-014/blob/003b4b5f49f14280762212c407e496ae43e4a19f/src/raven/menu/Menu.java#L33)</br>
Modify menu event in class [raven.application.form.MainForm.java](https://github.com/DJ-Raven/java-ui-dashboard-014/blob/003b4b5f49f14280762212c407e496ae43e4a19f/src/raven/application/form/MainForm.java#L53)
### Menu item size
Modify menu item height in class [raven.menu.MenuItem.java](https://github.com/DJ-Raven/java-ui-dashboard-014/blob/69bec2044c79a409e98c22e5328934f437c3a040/src/raven/menu/MenuItem.java#L57)</br>
Modify submenu item height in class [raven.menu.MenuItem.java](https://github.com/DJ-Raven/java-ui-dashboard-014/blob/69bec2044c79a409e98c22e5328934f437c3a040/src/raven/menu/MenuItem.java#L58)</br>  

### More custom you can apply flatlaf style properties

- [Flatlaf github](https://github.com/JFormDesigner/FlatLaf)
- [Flatlaf doc](https://www.formdev.com/flatlaf/customizing/)
### Screenshot
![Screenshot (155)](https://github.com/Moutasem-Salah/Function-Point-System/assets/125928209/9be464af-5a5e-4b98-81ca-675726e6bddf)![Screenshot (156)](https://github.com/Moutasem-Salah/Function-Point-System/assets/125928209/12d09f18-ffff-4bb3-af2f-f8ee6dd2da18)



![Screenshot (157)](https://github.com/Moutasem-Salah/Function-Point-System/assets/125928209/a1fbbcae-fcb1-47e3-b345-ef99d8bb64d3)
