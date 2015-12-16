

package j_Snake.PanelMain;

import j_Snake.PanelMain.Serpiente.Fruta;
import j_Snake.PanelMain.Serpiente.Serpiente;
import j_Snake.PanelMain.Serpiente.Serpiente2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ejecutar_Juego.ejecutarJuego;


public class miPanel extends JPanel  {
 
private ejecutarJuego ejecutor=new ejecutarJuego();
private int Parte_X[];
private int Parte_Y[];
private int Parte_Z[];
private int Parte_J[];
private int direccion=2;

private boolean Primer_Movimiento=true;

private final MY_Thread mithread=new MY_Thread();
private final int tama�o_Objeto =ejecutor.get_tama�o_Objeto();
private final int tama�o_Objeto2 =ejecutor.get_tama�o_Objeto2();

private final int IZQUIERDA = 37;
private final int DERECHA = 39;
private final int ARRIBA = 38;
private final int ABAJO = 40;
private LineBorder border=new LineBorder(Color.black.darker(),3);  
private int nivel;


    public miPanel(int i) {
        nivel=i;
        
        
        setBorder(border);
        
       
        mithread.start();
        
    }
    public   void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D  g2D=(Graphics2D)g;
        
      
        
        g2D.setColor(Color.GREEN);
        
     
        
        Parte_X=ejecutor.return_Snake_postionsX();
        Parte_Y=ejecutor.return_Snake_postionsY();
        
        for(int i=0;i<ejecutor.get_my_snake_lenght();i++) {
            
            
            
            g2D.fillRect(Parte_X[i],Parte_Y[i],tama�o_Objeto,tama�o_Objeto);
            
            
            
        }
        
        Parte_Z=ejecutor.return_Snake_postionsZ();
        Parte_J=ejecutor.return_Snake_postionsJ();
        
        for(int i=0;i<ejecutor.get_my_snake_lenght();i++) {
            
            
            
            g2D.fillRect(Parte_Z[i],Parte_J[i],tama�o_Objeto2,tama�o_Objeto2);
            
            
            
        }
        
        g2D.setColor(Color.RED);
        g2D.fillOval(ejecutor.get_Fruta_X()+5,ejecutor.get_Fruta_Y()+5,tama�o_Objeto-5,tama�o_Objeto-5);
        
      //  g2D.setColor(Color.black);
      //  g2D.fillOval(ejecutor.get_Bomba_X()+5,ejecutor.get_Bomba_Y()+5,tama�o_Objeto-5,tama�o_Objeto-5);
        
        
     if (nivel==1) { 
    	 //pones una bomba
     }else if(nivel==2){
        	
           //     g2D.setColor(Color.black);
          //  g2D.fillOval(ejecutor.get_Bomba_X()+5,ejecutor.get_Bomba_Y()+5,tama�o_Objeto-5,tama�o_Objeto-5);
        
                
        }else if(nivel==3){
        	//pones dos bombas
                
                
        	//    g2D.setColor(Color.black);
         //   g2D.fillOval(ejecutor.get_Bomba_X()+5,ejecutor.get_Bomba_Y()+5,tama�o_Objeto-5,tama�o_Objeto-5);
            
            //    g2D.setColor(Color.black);
          //  g2D.fillOval(ejecutor.get_Bomba_X()+5,ejecutor.get_Bomba_Y()+5,tama�o_Objeto-5,tama�o_Objeto-5);
        }
    }
    
    
    class MY_Thread extends Thread {
        public   void run() {
            while(true) {
            	ejecutor.Mover_mySnake(direccion, false, false);
                try {
                    
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                repaint();
                if(ejecutor.get_Game_over()) {
                    stop();
                }
            }
        }
    }
    
    public void set_Direction(int newDireccion) {
        direccion=newDireccion;
    }
    
    
    
}
