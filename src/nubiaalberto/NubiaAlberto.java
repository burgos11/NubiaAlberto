
package nubiaalberto;

import javax.swing.JOptionPane;

/**Clase: NubiaAlberto
 * Fecha: 17-04-18
 * Version: 1.0
 * CopyRight: ITCA-FEPADE
 * @author PracticaEvaluada1
 */
public class NubiaAlberto {

    public static void main(String[] args) {
        int n;
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));
        
        String nombre[]= new String[n];
        double nota1[]= new double[n];
        double nota2[]= new double[n];
        double nota3[]= new double[n];
        double promedio[]= new double[n];
        double acuProm=0;
        double promT=0;
        boolean band=true;
        int aprobados=0, reprobados=0;
        int edad[]= new int[n];
        
        int op;
        
      //  op= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion \n 1- Agregar notas \n 2- Calcular promedio \n 3- Salir"));
        
      
          while(band==true){
              
        for(int a=0; a<1;a++){
            op= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion \n 1- Agregar notas \n 2- Calcular promedio \n 3- Salir"));
       
        switch(op){
            case 1:
                for(int i=0;i<nombre.length; i++){
                    nombre[i]= JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
                    edad[i]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del estudiante"));
                    nota1[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1 del estudiante"));
                    nota2[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2 del estudiante"));
                    nota3[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3 del estudiante"));
                    
                    promedio[i]=(nota1[i]*0.35)+(nota2[i]*0.35)+(nota3[i]*0.30);
                    acuProm+=promedio[i];
                }
                
            break;
            
            case 2:
                promT=acuProm/n;
                for(int j=0;j<nombre.length; j++){
                   
                    
                    JOptionPane.showMessageDialog(null, "Datos estudiante: \n Nombre: "+nombre[j]+
                                                    "\n Nota 1: "+nota1[j]+"\n Nota 2: "+nota2[j]+"\n Nota 3: "+ nota3[j]
                                                     +"\n Promedio: "+promedio[j]);
                     if(promedio[j]>=7){
                        aprobados++;
                        JOptionPane.showMessageDialog(null, "Ha aprobado");
                                
                    }else{
                        reprobados++;
                        JOptionPane.showMessageDialog(null, "Ha reprobado");
                    }
                 
                }
            JOptionPane.showMessageDialog(null, "La cantidad de alumnos aprobados es: "+aprobados+
                                                "\n La cantidad de alumnos reprobados es: "+reprobados);
            break;
            case 3:
                band=false;
                break;
                
        }
         }
        }
    }}
    
    
    

