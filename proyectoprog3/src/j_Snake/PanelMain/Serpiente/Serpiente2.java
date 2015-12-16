package j_Snake.PanelMain.Serpiente;

public class Serpiente2 {

		
		
		   private int headZ=60;
		    private int headJ=60;
		    private int[] PostionsZ=new int[300];
		    private int[] PostionsJ=new int[300];
		    private int snake_length=5;
		    private final int tamaño_Objeto2=20;
		    
		    
		    public Serpiente2() {
		        for(int i=0;i<snake_length;i++) {
		            PostionsZ[i]=20;
		            PostionsJ[i]=20;
		            
		        }
		    }
		    
		    public   void Mover_snake2() {
		        for(int i=0;i<snake_length;i++) {
		            PostionsZ[snake_length-i]=PostionsZ[snake_length-(i+1)];
		            PostionsJ[snake_length-i]=PostionsJ[snake_length-(i+1)];
		            
		            
		        }
		        
		        PostionsZ[0]=headZ;
		        PostionsJ[0]=headJ;
		      
		    }
		    
		  
		    public    void ponerPosicionCabeza(int z,int j) {
		        headZ+=z;
		        headJ+=j;
		        
		    }
		    public    boolean check_game_over() {
		        for(int i=1;i<snake_length;i++)
		            
		        {
		            if((PostionsZ[i]==headZ)&&(PostionsZ[i]==headJ)) {
		                
		                
		                return true;
		            }
		        }
		        if(headZ<0||headZ>1150||headJ<0||headJ>650) {
		            
		            return true;
		        }
		        
		        return false;
		    }
		    
		    public boolean compararConLaPosicionFruta2(int z,int j) {
		        
		        for(int i=0;i<snake_length;i++) {
		            if(z==PostionsZ[i]&&j==PostionsZ[i]) {
		                return true;
		            }
		        }
		        
		        return false;
		    }
		    
		 public boolean compararConLaPosicionBomba2(int z,int j) {
		        
		        for(int i=0;i<snake_length;i++) {
		            if(z==PostionsZ[i]&&j==PostionsJ[i]) {
		                return true;
		            }
		        }
		        
		        return false;
		    }
		    
		    public synchronized void Increase_lenght2() {
		        snake_length++;
		    }
		    
		    public int get_lenght2() {
		        return snake_length;
		    }
		    
		    public int get_tamaño_Objeto2() {
		        return tamaño_Objeto2;
		    }
		    
		    
		    
		    public int[] get_All_postionsZ() {
		        return PostionsZ;
		    }
		    
		    public int[] get_All_postionsJ() {
		        return PostionsJ;
		    }
		    
		    public int getHeadZ() {
		        return  PostionsZ[0];
		    }
		    public int getHeadJ() {
		        return  PostionsJ[0];
		    }
		    
}
