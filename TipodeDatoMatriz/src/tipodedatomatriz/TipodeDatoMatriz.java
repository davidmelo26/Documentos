
package tipodedatomatriz;

/**
 *
 * @author ASUS
 */
public class TipodeDatoMatriz {

   
    public class MiMatriz{
            
        int tFilas =3;
        int tColumnas = 3;
        int Matriz = [][];
            
        public MiMatriz (int nFilas, int nColumnas){
                
            this.tColumnas = nColumnas;  
            this.tFilas = nFilas;
            this.Matriz = new int [nFilas][nColumnas];
     
        }
        public void insertar (int Fila, int Columna, int dato){
            
            if (tFilas< Fila || tColumnas < Columna){
                
                System.out.println("ERROR: Nuemro no correcto");
                
            }else {
                this.Matriz[Fila][Columna]= dato;
            }
        }
        public void listar (){
            
            for (int i; i<tFilas; i++){
                for (int j;j<=tColumna;j++){
                    System.out.println(this.Matriz[i][j]);
                }
            }
        }
        public int buscar (int Fila,int Columna){
            
            if (tFilas<Fila || tColumna<Columna || Fila < 0 || Columna < 0){
                System.out.println("ERROR: Dato no es correcto");
            }else{
                return this.Matriz[Fila][Columna];
                
            }
        }
         public int actualizar (int dato, int Fila,int Columna){
            
            if (tFilas<Fila || tColumna<Columna || Fila < 0 || Columna < 0){
                System.out.println("ERROR: Dato no es correcto");
            }else{
                this.Matriz[Fila][Columna]= dato;
                
            }
        }
         public void eliminar (int Fila,int Columna){
            
            if (tFilas<Fila || tColumna<Columna || Fila < 0 || Columna < 0){
                System.out.println("ERROR: Dato no es correcto");
            }else{
                this.Matriz[Fila][Columna]= null;
                
            }
        }
        
        
    }
}
