package boxLayout;

/*
BoxLayout, es un Layout recontra parecido al FlowLayout, cual es la diferencia? 
es simple, FlowLayout ubica todos los componentes solo de forma horizontal, 
mientras que BoxLayout los ubica, tanto horizontal como vertical.

Para crear una clase BoxLayout, necesitamos 2 argumentos: el objeto contenedor, 
y la clase que indica la forma de como ordenara los componetes,.

BoxLayout.X_AXIS —– Forma Horizontal
BoxLayout.Y_AXIS —– Forma Vertical

JFrame frame = new JFrame();
frame.setLayout(new BoxLayout(frame,BoxLayout.X_AXIS));

Luego para agregar los componentes es simple, lo mismo como  hicimos con FlowLayout.

JButton boton =  new JButton("Aceptar");
frame.add(boton);

Aqui  tengo un ejemplo, sobre una clasica ventana de logueo, cabe destacar q para 
este ejemplo demostrativo, solo me limite a usar BoxLayout.

La idea general, es crear un JFrame geeneral, el cual tendra 3 paneles  y una etiqueta, 
Estos  estaran  ordenados con BoxLayout en forma vertical.

Cada panel tendran cajas de textos y etiquetas. Estos  estaran ordenados 
con BoxLayout en forma horizontal.
*/

import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

public class DemoBoxLayout{
    private JPanel panelSuperior, panelMedio, panelInferior;
    private JLabel etiqueta1, etiqueta2, etiqueta3;
    private JTextField cajaTexto;
    private JPasswordField cajaPass;
    private JButton botonAceptar, botonCancelar;
    private JFrame frame;

    public void construyePanelSuperior(){
        panelSuperior =new JPanel();
        etiqueta2= new JLabel("Usuario");
        cajaTexto = new JTextField(10);
        panelSuperior.setLayout(new BoxLayout(panelSuperior, BoxLayout.X_AXIS));
        panelSuperior.add(etiqueta2);
        panelSuperior.add(cajaTexto);
    }

    public void construyePanelMedio(){
        panelMedio=new JPanel();
        etiqueta3= new JLabel("Password");
        cajaPass = new JPasswordField(10);
        panelMedio.setLayout(new BoxLayout(panelMedio, BoxLayout.X_AXIS));
        panelMedio.add(etiqueta3);
        panelMedio.add(cajaPass);
    }

    public void construyePanelInferior(){
        panelInferior=new JPanel();
        botonAceptar=new JButton("Aceptar");
        botonCancelar=new JButton("Cancelar");
        panelInferior.setLayout(new BoxLayout(panelInferior, BoxLayout.X_AXIS));
        panelInferior.add(botonAceptar);
        panelInferior.add(botonCancelar);
    }

    public void construyeVentana(){
        frame = new JFrame();
        etiqueta1 = new JLabel("Demo por inforux");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS) );
        frame.add(etiqueta1);
        frame.add(panelSuperior);
        frame.add(panelMedio);
        frame.add(panelInferior);
        frame.pack();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public DemoBoxLayout(){
        construyePanelSuperior();
        construyePanelMedio();
        construyePanelInferior();
        construyeVentana();
    }
}
