

package j_Snake.PanelMain.Serpiente;

import javax.swing.JOptionPane;



public class Serpiente {
    
    private int headX=20;
    private int headY=20;
    private int[] PostionsX=new int[300];
    private int[] PostionsY=new int[300];
    private int snake_length=5;
    private final int tama�o_Objeto=20;
    
    
    public Serpiente() {
        for(int i=0;i<snake_length;i++) {
            PostionsX[i]=20;
            PostionsY[i]=20;
            
        }
    }
    
    public   void Mover_snake() {
        for(int i=0;i<snake_length;i++) {
            PostionsX[snake_length-i]=PostionsX[snake_length-(i+1)];
            PostionsY[snake_length-i]=PostionsY[snake_length-(i+1)];
            
            
        }
        
        PostionsX[0]=headX;
        PostionsY[0]=headY;
      
    }
    
  
    public    void ponerPosicionCabeza(int x,int y) {
        headX+=x;
        headY+=y;
        
    }
    public    boolean check_game_over() {
        for(int i=1;i<snake_length;i++)
            
        {
            if((PostionsX[i]==headX)&&(PostionsY[i]==headY)) {
                
                
                return true;
            }
        }
        if(headX<0||headX>1150||headY<0||headY>650) {
            
            return true;
        }
        
        return false;
    }
    
    public boolean compararConLaPosicionFruta(int x,int y) {
        
        for(int i=0;i<snake_length;i++) {
            if(x==PostionsX[i]&&y==PostionsY[i]) {
                return true;
            }
        }
        
        return false;
    }
    
 public boolean compararConLaPosicionBomba(int x,int y) {
        
        for(int i=0;i<snake_length;i++) {
            if(x==PostionsX[i]&&y==PostionsY[i]) {
                return true;
            }
        }
        
        return false;
    }
    
    public synchronized void Increase_lenght() {
        snake_length++;
    }
    
    public int get_lenght() {
        return snake_length;
    }
    
    public int get_tama�o_Objeto() {
        return tama�o_Objeto;
    }
    
    
    
    public int[] get_All_postionsX() {
        return PostionsX;
    }
    
    public int[] get_All_postionsY() {
        return PostionsY;
    }
    
    public int getHeadX() {
        return  PostionsX[0];
    }
    public int getHeadY() {
        return  PostionsY[0];
    }
    
   
    
}

