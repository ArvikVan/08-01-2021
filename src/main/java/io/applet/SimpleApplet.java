package io.applet;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=бO>
</applet>
*/
public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Simpleeeepplet", 20, 20);
    }
}
