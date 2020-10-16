package org.ecs160.a1;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.*;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.layouts.GridLayout;
import com.codename1.ui.layouts.mig.Grid;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.table.TableLayout;

import javax.swing.*;

public class CalculatorForm extends Form{
    Container tRegister = new Container(new BoxLayout(BoxLayout.X_AXIS));
    Container sRegister = new Container(new BoxLayout(BoxLayout.X_AXIS));
    Container yRegister = new Container(new BoxLayout(BoxLayout.X_AXIS));
    Container xRegister = new Container(new BoxLayout(BoxLayout.X_AXIS));
    Container display = new Container(new BoxLayout(BoxLayout.Y_AXIS));
    Container sci1 = new Container(new GridLayout(2,1));
    Container sci2 = new Container(new GridLayout(2,1));
    Container sci3 = new Container(new GridLayout(2,1));
    Container sci4 = new Container(new GridLayout(2,1));
    Container sci5 = new Container(new GridLayout(2,1));
    Container sci6 = new Container(new GridLayout(2,1));
    Container keyboard = new Container(new GridLayout(5,5));

    public CalculatorForm() {
        setLayout(new BorderLayout());
        setTitle("RPN Calculator V0.01");

        TextComponent t = new TextComponent().label("T:");
        tRegister.add(t);
        display.add(tRegister);

        TextComponent s = new TextComponent().label("S:");
        sRegister.add(s);
        display.add(sRegister);

        TextComponent y = new TextComponent().label("Y:");
        yRegister.add(y);
        display.add(yRegister);

        TextComponent x = new TextComponent().label("X:");
        xRegister.add(x);
        display.add(xRegister);

        TextField input = new TextField();
        display.add(input);


        Button sin = new Button ("sin");
        sin.getUnselectedStyle().setBgTransparency(255);
        sin.getUnselectedStyle().setFgColor(0x000000);
        sin.getAllStyles().setPadding(Component.TOP, 5);
        sin.getAllStyles().setPadding(Component.BOTTOM, 5);
        sin.getAllStyles().setPadding(Component.LEFT, 3);
        sin.getAllStyles().setPadding(Component.RIGHT, 3);
        sin.getAllStyles().setMargin(Component.TOP, 10);
        sin.getAllStyles().setMargin(Component.BOTTOM, 10);
        sin.getAllStyles().setMargin(Component.LEFT, 10);
        sin.getAllStyles().setMargin(Component.RIGHT, 10);
        sin.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        sin.getAllStyles().setBgColor(0xff9900);

        Button square = new Button ("x^2");
        square.getUnselectedStyle().setBgTransparency(255);
        square.getUnselectedStyle().setFgColor(0x000000);
        square.getAllStyles().setPadding(Component.TOP, 5);
        square.getAllStyles().setPadding(Component.BOTTOM, 5);
        square.getAllStyles().setPadding(Component.LEFT, 3);
        square.getAllStyles().setPadding(Component.RIGHT, 3);
        square.getAllStyles().setMargin(Component.TOP, 10);
        square.getAllStyles().setMargin(Component.BOTTOM, 10);
        square.getAllStyles().setMargin(Component.LEFT, 10);
        square.getAllStyles().setMargin(Component.RIGHT, 10);
        square.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        square.getAllStyles().setBgColor(0xff9900);

        Button cos = new Button("cos");
        cos.getUnselectedStyle().setBgTransparency(255);
        cos.getUnselectedStyle().setFgColor(0x000000);
        cos.getAllStyles().setMargin(Component.TOP, 10);
        cos.getAllStyles().setMargin(Component.BOTTOM, 10);
        cos.getAllStyles().setMargin(Component.LEFT, 10);
        cos.getAllStyles().setMargin(Component.RIGHT, 10);
        cos.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        cos.getAllStyles().setBgColor(0xff9900);

        Button cube = new Button ("x^3");
        cube.getUnselectedStyle().setBgTransparency(255);
        cube.getUnselectedStyle().setFgColor(0x000000);
        cube.getAllStyles().setMargin(Component.TOP, 10);
        cube.getAllStyles().setMargin(Component.BOTTOM, 10);
        cube.getAllStyles().setMargin(Component.LEFT, 10);
        cube.getAllStyles().setMargin(Component.RIGHT, 10);
        cube.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        cube.getAllStyles().setBgColor(0xff9900);

        Button tan = new Button("tan");
        tan.getUnselectedStyle().setBgTransparency(255);
        tan.getUnselectedStyle().setFgColor(0x000000);
        tan.getAllStyles().setMargin(Component.TOP, 10);
        tan.getAllStyles().setMargin(Component.BOTTOM, 10);
        tan.getAllStyles().setMargin(Component.LEFT, 10);
        tan.getAllStyles().setMargin(Component.RIGHT, 10);
        tan.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        tan.getAllStyles().setBgColor(0xff9900);

        Button SQRT = new Button ("SQRT");
        SQRT.getUnselectedStyle().setBgTransparency(255);
        SQRT.getUnselectedStyle().setFgColor(0x000000);
        SQRT.getAllStyles().setMargin(Component.TOP, 10);
        SQRT.getAllStyles().setMargin(Component.BOTTOM, 10);
        SQRT.getAllStyles().setMargin(Component.LEFT, 10);
        SQRT.getAllStyles().setMargin(Component.RIGHT, 10);
        SQRT.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        SQRT.getAllStyles().setBgColor(0xff9900);

        Button Log = new Button("Log");
        Log.getUnselectedStyle().setBgTransparency(255);
        Log.getUnselectedStyle().setFgColor(0x000000);
        Log.getAllStyles().setMargin(Component.TOP, 10);
        Log.getAllStyles().setMargin(Component.BOTTOM, 10);
        Log.getAllStyles().setMargin(Component.LEFT, 10);
        Log.getAllStyles().setMargin(Component.RIGHT, 10);
        Log.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        Log.getAllStyles().setBgColor(0xff9900);

        Button Pi = new Button ("Pi");
        Pi.getUnselectedStyle().setBgTransparency(255);
        Pi.getUnselectedStyle().setFgColor(0x000000);
        Pi.getAllStyles().setMargin(Component.TOP, 10);
        Pi.getAllStyles().setMargin(Component.BOTTOM, 10);
        Pi.getAllStyles().setMargin(Component.LEFT, 10);
        Pi.getAllStyles().setMargin(Component.RIGHT, 10);
        Pi.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        Pi.getAllStyles().setBgColor(0xff9900);

        Button Ln = new Button("Ln");
        Ln.getUnselectedStyle().setBgTransparency(255);
        Ln.getUnselectedStyle().setFgColor(0x000000);
        Ln.getAllStyles().setMargin(Component.TOP, 10);
        Ln.getAllStyles().setMargin(Component.BOTTOM, 10);
        Ln.getAllStyles().setMargin(Component.LEFT, 10);
        Ln.getAllStyles().setMargin(Component.RIGHT, 10);
        Ln.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        Ln.getAllStyles().setBgColor(0xff9900);

        Button E = new Button ("E");
        E.getUnselectedStyle().setBgTransparency(255);
        E.getUnselectedStyle().setFgColor(0x000000);
        E.getAllStyles().setMargin(Component.TOP, 10);
        E.getAllStyles().setMargin(Component.BOTTOM, 10);
        E.getAllStyles().setMargin(Component.LEFT, 10);
        E.getAllStyles().setMargin(Component.RIGHT, 10);
        E.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        E.getAllStyles().setBgColor(0xff9900);

        Button X_Y = new Button("X<->Y");
        X_Y.getUnselectedStyle().setBgTransparency(255);
        X_Y.getUnselectedStyle().setFgColor(0x000000);
        X_Y.getAllStyles().setMargin(Component.TOP, 10);
        X_Y.getAllStyles().setMargin(Component.BOTTOM, 10);
        X_Y.getAllStyles().setMargin(Component.LEFT, 10);
        X_Y.getAllStyles().setMargin(Component.RIGHT, 10);
        X_Y.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        X_Y.getAllStyles().setBgColor(0xff9900);

        Button POP = new Button ("POP");
        POP.getUnselectedStyle().setBgTransparency(255);
        POP.getUnselectedStyle().setFgColor(0x000000);
        POP.getAllStyles().setMargin(Component.TOP, 10);
        POP.getAllStyles().setMargin(Component.BOTTOM, 10);
        POP.getAllStyles().setMargin(Component.LEFT, 10);
        POP.getAllStyles().setMargin(Component.RIGHT, 10);
        POP.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        POP.getAllStyles().setBgColor(0xff9900);

        Button num_7 = new Button ("7");
        num_7.getUnselectedStyle().setBgTransparency(255);
        num_7.getUnselectedStyle().setFgColor(0x000000);
        num_7.getAllStyles().setMargin(Component.TOP, 10);
        num_7.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_7.getAllStyles().setMargin(Component.LEFT, 10);
        num_7.getAllStyles().setMargin(Component.RIGHT, 10);
        num_7.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_7.getAllStyles().setBgColor(0xff9900);

        Button num_8 = new Button ("8");
        num_8.getUnselectedStyle().setBgTransparency(255);
        num_8.getUnselectedStyle().setFgColor(0x000000);
        num_8.getAllStyles().setMargin(Component.TOP, 10);
        num_8.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_8.getAllStyles().setMargin(Component.LEFT, 10);
        num_8.getAllStyles().setMargin(Component.RIGHT, 10);
        num_8.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_8.getAllStyles().setBgColor(0xff9900);

        Button num_9 = new Button ("9");
        num_9.getUnselectedStyle().setBgTransparency(255);
        num_9.getUnselectedStyle().setFgColor(0x000000);
        num_9.getAllStyles().setMargin(Component.TOP, 10);
        num_9.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_9.getAllStyles().setMargin(Component.LEFT, 10);
        num_9.getAllStyles().setMargin(Component.RIGHT, 10);
        num_9.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_9.getAllStyles().setBgColor(0xff9900);

        Button divide = new Button ("/");
        divide.getUnselectedStyle().setBgTransparency(255);
        divide.getUnselectedStyle().setFgColor(0x000000);
        divide.getAllStyles().setMargin(Component.TOP, 10);
        divide.getAllStyles().setMargin(Component.BOTTOM, 10);
        divide.getAllStyles().setMargin(Component.LEFT, 10);
        divide.getAllStyles().setMargin(Component.RIGHT, 10);
        divide.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        divide.getAllStyles().setBgColor(0xff9900);

        Button clr = new Button ("CLR");
        clr.getUnselectedStyle().setBgTransparency(255);
        clr.getUnselectedStyle().setFgColor(0x000000);
        clr.getAllStyles().setMargin(Component.TOP, 10);
        clr.getAllStyles().setMargin(Component.BOTTOM, 10);
        clr.getAllStyles().setMargin(Component.LEFT, 10);
        clr.getAllStyles().setMargin(Component.RIGHT, 10);
        clr.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        clr.getAllStyles().setBgColor(0xff9900);

        Button num_4 = new Button ("4");
        num_4.getUnselectedStyle().setBgTransparency(255);
        num_4.getUnselectedStyle().setFgColor(0x000000);
        num_4.getAllStyles().setMargin(Component.TOP, 10);
        num_4.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_4.getAllStyles().setMargin(Component.LEFT, 10);
        num_4.getAllStyles().setMargin(Component.RIGHT, 10);
        num_4.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_4.getAllStyles().setBgColor(0xff9900);

        Button num_5 = new Button ("5");
        num_5.getUnselectedStyle().setBgTransparency(255);
        num_5.getUnselectedStyle().setFgColor(0x000000);
        num_5.getAllStyles().setMargin(Component.TOP, 10);
        num_5.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_5.getAllStyles().setMargin(Component.LEFT, 10);
        num_5.getAllStyles().setMargin(Component.RIGHT, 10);
        num_5.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_5.getAllStyles().setBgColor(0xff9900);

        Button num_6 = new Button ("6");
        num_6.getUnselectedStyle().setBgTransparency(255);
        num_6.getUnselectedStyle().setFgColor(0x000000);
        num_6.getAllStyles().setMargin(Component.TOP, 10);
        num_6.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_6.getAllStyles().setMargin(Component.LEFT, 10);
        num_6.getAllStyles().setMargin(Component.RIGHT, 10);
        num_6.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_6.getAllStyles().setBgColor(0xff9900);

        Button multiply = new Button ("*");
        multiply.getUnselectedStyle().setBgTransparency(255);
        multiply.getUnselectedStyle().setFgColor(0x000000);
        multiply.getAllStyles().setMargin(Component.TOP, 10);
        multiply.getAllStyles().setMargin(Component.BOTTOM, 10);
        multiply.getAllStyles().setMargin(Component.LEFT, 10);
        multiply.getAllStyles().setMargin(Component.RIGHT, 10);
        multiply.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        multiply.getAllStyles().setBgColor(0xff9900);


        Button delete = new Button ("<-");
        delete.getUnselectedStyle().setBgTransparency(255);
        delete.getUnselectedStyle().setFgColor(0x000000);
        delete.getAllStyles().setMargin(Component.TOP, 10);
        delete.getAllStyles().setMargin(Component.BOTTOM, 10);
        delete.getAllStyles().setMargin(Component.LEFT, 10);
        delete.getAllStyles().setMargin(Component.RIGHT, 10);
        delete.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        delete.getAllStyles().setBgColor(0xff9900);

        Button num_1 = new Button ("1");
        num_1.getUnselectedStyle().setBgTransparency(255);
        num_1.getUnselectedStyle().setFgColor(0x000000);
        num_1.getAllStyles().setMargin(Component.TOP, 10);
        num_1.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_1.getAllStyles().setMargin(Component.LEFT, 10);
        num_1.getAllStyles().setMargin(Component.RIGHT, 10);
        num_1.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_1.getAllStyles().setBgColor(0xff9900);

        Button num_2 = new Button ("2");
        num_2.getUnselectedStyle().setBgTransparency(255);
        num_2.getUnselectedStyle().setFgColor(0x000000);
        num_2.getAllStyles().setMargin(Component.TOP, 10);
        num_2.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_2.getAllStyles().setMargin(Component.LEFT, 10);
        num_2.getAllStyles().setMargin(Component.RIGHT, 10);
        num_2.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_2.getAllStyles().setBgColor(0xff9900);

        Button num_3 = new Button ("3");
        num_3.getUnselectedStyle().setBgTransparency(255);
        num_3.getUnselectedStyle().setFgColor(0x000000);
        num_3.getAllStyles().setMargin(Component.TOP, 10);
        num_3.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_3.getAllStyles().setMargin(Component.LEFT, 10);
        num_3.getAllStyles().setMargin(Component.RIGHT, 10);
        num_3.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_3.getAllStyles().setBgColor(0xff9900);

        Button minus = new Button ("-");
        minus.getUnselectedStyle().setBgTransparency(255);
        minus.getUnselectedStyle().setFgColor(0x000000);
        minus.getAllStyles().setMargin(Component.TOP, 10);
        minus.getAllStyles().setMargin(Component.BOTTOM, 10);
        minus.getAllStyles().setMargin(Component.LEFT, 10);
        minus.getAllStyles().setMargin(Component.RIGHT, 10);
        minus.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        minus.getAllStyles().setBgColor(0xff9900);

        Button ent = new Button ("ENT");
        ent.getUnselectedStyle().setBgTransparency(255);
        ent.getUnselectedStyle().setFgColor(0x000000);
        ent.getAllStyles().setMargin(Component.TOP, 10);
        ent.getAllStyles().setMargin(Component.BOTTOM, 10);
        ent.getAllStyles().setMargin(Component.LEFT, 10);
        ent.getAllStyles().setMargin(Component.RIGHT, 10);
        ent.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        ent.getAllStyles().setBgColor(0xff9900);

        Button num_0 = new Button ("0");
        num_0.getUnselectedStyle().setBgTransparency(255);
        num_0.getUnselectedStyle().setFgColor(0x000000);
        num_0.getAllStyles().setMargin(Component.TOP, 10);
        num_0.getAllStyles().setMargin(Component.BOTTOM, 10);
        num_0.getAllStyles().setMargin(Component.LEFT, 10);
        num_0.getAllStyles().setMargin(Component.RIGHT, 10);
        num_0.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        num_0.getAllStyles().setBgColor(0xff9900);

        Button dot = new Button (".");
        dot.getUnselectedStyle().setBgTransparency(255);
        dot.getUnselectedStyle().setFgColor(0x000000);
        dot.getAllStyles().setMargin(Component.TOP, 10);
        dot.getAllStyles().setMargin(Component.BOTTOM, 10);
        dot.getAllStyles().setMargin(Component.LEFT, 10);
        dot.getAllStyles().setMargin(Component.RIGHT, 10);
        dot.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        dot.getAllStyles().setBgColor(0xff9900);

        Button polyn = new Button ("Y^X");
        polyn.getUnselectedStyle().setBgTransparency(255);
        polyn.getUnselectedStyle().setFgColor(0x000000);
        polyn.getAllStyles().setMargin(Component.TOP, 10);
        polyn.getAllStyles().setMargin(Component.BOTTOM, 10);
        polyn.getAllStyles().setMargin(Component.LEFT, 10);
        polyn.getAllStyles().setMargin(Component.RIGHT, 10);
        polyn.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        polyn.getAllStyles().setBgColor(0xff9900);

        Button add = new Button ("+");
        add.getUnselectedStyle().setBgTransparency(255);
        add.getUnselectedStyle().setFgColor(0x000000);
        add.getAllStyles().setMargin(Component.TOP, 10);
        add.getAllStyles().setMargin(Component.BOTTOM, 10);
        add.getAllStyles().setMargin(Component.LEFT, 10);
        add.getAllStyles().setMargin(Component.RIGHT, 10);
        add.getAllStyles().setBorder(Border.createDashedBorder(4, ColorUtil.BLACK));
        add.getAllStyles().setBgColor(0xff9900);
        //Style s = UIManager.getInstance().getComponentStyle("Button");
        //FontImage icon1 = FontImage.createMaterial(FontImage.MATERIAL_ALARM, s);

        sci1.add(sin); sci1.add(square);
        sci2.add(cos); sci2.add(cube);
        sci3.add(tan); sci3.add(SQRT);
        sci4.add(Log); sci4.add(Pi);
        sci5.add(Ln); sci5.add(E);
        sci6.add(X_Y); sci6.add(POP);

        keyboard.add(sci1);
        keyboard.add(sci2);
        keyboard.add(sci3);
        keyboard.add(sci4);
        keyboard.add(sci5);
        keyboard.add(sci6);
        keyboard.add(num_7);
        keyboard.add(num_8);
        keyboard.add(num_9);
        keyboard.add(divide);
        keyboard.add(clr);
        keyboard.add(num_4);
        keyboard.add(num_5);
        keyboard.add(num_6);
        keyboard.add(multiply);
        keyboard.add(delete);
        keyboard.add(num_1);
        keyboard.add(num_2);
        keyboard.add(num_3);
        keyboard.add(minus);
        keyboard.add(ent);
        keyboard.add(num_0);
        keyboard.add(dot);
        keyboard.add(polyn);
        keyboard.add(add);

        add(BorderLayout.NORTH, display);
        add(BorderLayout.CENTER, keyboard);
        this.show();

        //sin.addActionListener((e) -> Log.p("Clicked"));
    }

}