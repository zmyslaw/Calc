import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Kalkulator extends JFrame implements ActionListener
{
    JLabel WprowadzaLiczbe;
    JLabel PokazujeWynik;
    JLabel PokazujeRachunek;

    JButton PrzyciskCzyszczenia;
    JButton PrzyciskDodawania;
    JButton PrzyciskOdejmowania;
    JButton PrzyciskDzielenia;
    JButton PrzyciskMnozenia;
    JButton PrzyciskRownosci;

    JButton P1;
    JButton P2;
    JButton P3;
    JButton P4;
    JButton P5;
    JButton P6;
    JButton P7;
    JButton P8;
    JButton P9;
    JButton P0;

    JButton Kropka;
    JButton Usun;

    Object obj;

    String WpiszLiczbe;
    String PrzyciskLiczby;
    String Rachunek;

    double liczba1;
    double liczba2;

    int licznik;
    public Kalkulator(){
        super("Kalkulator");

        this.obj=null;

        this.WpiszLiczbe="";
        this.Rachunek="";

        this.liczba1=0.0;
        this.liczba2=0.0;

        this.licznik=0;

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 30, 0));

        PrzyciskDodawania = new JButton( " + " );
        PrzyciskOdejmowania = new JButton( " - " );
        PrzyciskMnozenia = new JButton( " * " );
        PrzyciskDzielenia = new JButton( " / " );

        PrzyciskRownosci = new JButton(  " = " );
        Kropka = new JButton( " . " );
        Usun = new JButton( " CE " );

        P1 = new JButton( " 1 " );
        P2 = new JButton( " 2 " );
        P3 = new JButton( " 3 " );
        P4 = new JButton( " 4 " );
        P5 = new JButton( " 5 " );
        P6 = new JButton( " 6 " );
        P7 = new JButton( " 7 " );
        P8 = new JButton( " 8 " );
        P9 = new JButton( " 9 " );
        P0 = new JButton( " 0 " );
        PrzyciskCzyszczenia = new JButton( " C " );

        PokazujeRachunek =  new JLabel("");
        PokazujeWynik =  new JLabel("");
        WprowadzaLiczbe =  new JLabel("");

        add(new JLabel("=================================="));

        add( P7 );
        add( P8 );
        add( P9 );

        add( P4 );
        add( P5 );
        add( P6 );

        add( P1 );
        add( P2 );
        add( P3 );
        add( P0 );

        add( Usun );
        add( PrzyciskCzyszczenia );
        add(new JLabel("=================================="));

        add( PrzyciskDodawania );
        add( PrzyciskMnozenia );
        add( Kropka );

        add( PrzyciskOdejmowania );
        add( PrzyciskDzielenia );
        add( PrzyciskRownosci );

        add(new JLabel("=================================="));
        add(new JLabel("Liczba: "));
        add(WprowadzaLiczbe);
        add(new JLabel("=================================="));
        add(new JLabel("Rachunek: "));
        add(PokazujeRachunek);
        add(new JLabel("=================================="));
        add(new JLabel("Wynik: "));
        add( PokazujeWynik );
        add(new JLabel("=================================="));

        PrzyciskDodawania.addActionListener( this );
        PrzyciskOdejmowania.addActionListener( this );
        PrzyciskDzielenia.addActionListener( this );
        PrzyciskMnozenia.addActionListener( this );

        P1.addActionListener( this );
        P2.addActionListener( this );
        P3.addActionListener( this );
        P4.addActionListener( this );
        P5.addActionListener( this );
        P6.addActionListener( this );
        P7.addActionListener( this );
        P8.addActionListener( this );
        P9.addActionListener( this );
        P0.addActionListener( this );

        PrzyciskCzyszczenia.addActionListener( this );
        Kropka.addActionListener( this );
        Usun.addActionListener( this );
        PrzyciskRownosci.addActionListener( this );

        JMenuBar menu = new JMenuBar();
        JMenu Autor = new JMenu("Autor");
        JMenuItem menuOAutorze = new JMenuItem("O autorze");
        menuOAutorze.addActionListener(this);
        Autor.add(menuOAutorze);
        menu.add(Autor);
        setJMenuBar(menu);
        setResizable(false);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent akcja)
    {
        String autor = akcja.getActionCommand();
        if(autor.equals("O autorze")){
            JOptionPane.showMessageDialog(null,"Adrian Zmyslowski"+"\n"+"Indeks: 26580");
        }

        Object zrodlo = akcja.getSource();
        if(zrodlo == PrzyciskDodawania) {
            try {
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDodawania ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1+this.liczba2;
                    PokazujeWynik.setText(this.liczba1+"");
                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"+";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDodawania;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskOdejmowania  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1-this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe   +"+";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDodawania;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskMnozenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1*this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"+"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDodawania;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDzielenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1/this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"+"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDodawania;
                }
                if(this.licznik==0 &&
                        this.obj==null){
                    this.licznik++;

                    this.liczba1=Double.parseDouble(this.WpiszLiczbe);

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe  +"+" ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDodawania;
                }
            }
            catch (NumberFormatException error) {

            }
        }
        if(zrodlo == PrzyciskOdejmowania){
            try {
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDodawania ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1+this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"-";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskOdejmowania;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskOdejmowania  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1-this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe   +"-";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskOdejmowania;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskMnozenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1*this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"-"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskOdejmowania;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDzielenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1/this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"-"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskOdejmowania;
                }
                if(this.licznik==0 &&
                        this.obj==null){
                    this.licznik++;

                    this.liczba1=Double.parseDouble(this.WpiszLiczbe);

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe  +"-" ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskOdejmowania;
                }
            }
            catch (NumberFormatException error) {

            }
        }
        if(zrodlo == PrzyciskMnozenia) {
            try {
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDodawania ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1+this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"*";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskMnozenia;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskOdejmowania  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1-this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe   +"*";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskMnozenia;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskMnozenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1*this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"*"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskMnozenia;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDzielenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1/this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"*"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskMnozenia;
                }
                if(this.licznik==0 &&
                        this.obj==null  ){
                    this.licznik++;

                    this.liczba1=Double.parseDouble(this.WpiszLiczbe);

                    PokazujeWynik.setText(this.liczba1+" ");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"*"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskMnozenia;
                }
            }
            catch (NumberFormatException error) {

            }
        }
        if(zrodlo == PrzyciskDzielenia)  {
            try {
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDodawania ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1+this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"/";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDzielenia;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskOdejmowania  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1-this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe   +"/";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDzielenia;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskMnozenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1*this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"/"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDzielenia;
                }
                if(this.licznik!=0 &&
                        this.obj==PrzyciskDzielenia  ){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1/this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"/"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=PrzyciskDzielenia;
                }
                if(this.licznik==0 &&
                        this.obj==null){
                    this.licznik++;

                    this.liczba1=Double.parseDouble(this.WpiszLiczbe);

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+   this.WpiszLiczbe +"/"  ;
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(" "+this.WpiszLiczbe);

                    this.obj=PrzyciskDzielenia;
                }
            }
            catch (NumberFormatException error) {

            }
        }
        if(zrodlo == PrzyciskCzyszczenia)   {
            this.PokazujeWynik.setText(0+" ");

            this.WpiszLiczbe ="";
            this.PrzyciskLiczby ="";
            this.Rachunek="";

            this.liczba2=0.0;
            this.liczba1=0.0;

            this.obj=null;

            this.licznik=0;

            PokazujeWynik.setText(""+this.WpiszLiczbe);
            PokazujeRachunek.setText(""+this.Rachunek);
            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P1)   {
            this.PrzyciskLiczby="1";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P2)   {
            this.PrzyciskLiczby="2";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P3)   {
            this.PrzyciskLiczby="3";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P4)   {
            this.PrzyciskLiczby="4";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P5)   {
            this.PrzyciskLiczby="5";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P6)   {
            this.PrzyciskLiczby="6";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P7)    {
            this.PrzyciskLiczby="7";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P8)  {
            this.PrzyciskLiczby="8";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P9)  {
            this.PrzyciskLiczby="9";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == P0)  {
            this.PrzyciskLiczby="0";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == Kropka)  {
            this.PrzyciskLiczby=".";

            this.WpiszLiczbe=this.WpiszLiczbe+this.PrzyciskLiczby;

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == Usun)    {
            this.WpiszLiczbe="";

            WprowadzaLiczbe.setText(""+this.WpiszLiczbe);
        }
        if(zrodlo == PrzyciskRownosci)    {
            try{
                if(this.obj==PrzyciskDodawania){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1+this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"=";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=null;
                    this.licznik=0;
                    this.liczba2=0.0;
                    this.liczba1=0.0;
                    this.PrzyciskLiczby ="";
                    this.Rachunek="";
                }
                if(this.obj==PrzyciskOdejmowania){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1-this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"=";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=null;
                    this.licznik=0;
                    this.liczba2=0.0;
                    this.liczba1=0.0;
                    this.PrzyciskLiczby ="";
                    this.Rachunek="";
                }
                if(this.obj==PrzyciskMnozenia){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1*this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");

                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"=";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=null;
                    this.licznik=0;
                    this.liczba2=0.0;
                    this.liczba1=0.0;
                    this.PrzyciskLiczby ="";
                    this.Rachunek="";
                }
                if(this.obj==PrzyciskDzielenia){
                    this.liczba2=Double.parseDouble(this.WpiszLiczbe);

                    this.liczba1=this.liczba1/this.liczba2;

                    PokazujeWynik.setText(this.liczba1+"");
                    this.Rachunek= this.Rachunek+this.WpiszLiczbe+"=";
                    PokazujeRachunek.setText(""+this.Rachunek);

                    this.WpiszLiczbe="";
                    WprowadzaLiczbe.setText(""+this.WpiszLiczbe);

                    this.obj=null;
                    this.licznik=0;
                    this.liczba2=0.0;
                    this.liczba1=0.0;
                    this.PrzyciskLiczby ="";
                    this.Rachunek="";
                }
            }
            catch (NumberFormatException error) {

            }
        }
    }
}