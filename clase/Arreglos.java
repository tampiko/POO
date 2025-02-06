import java.util.ArrayList;
public class Arreglos {
  public static void main(String args[]) {
        ArrayList<String> nombres = new ArrayList<>();
        // Create
        nombres.add("Luis");
        nombres.add("Daniel");
        nombres.add("Aranza");
        nombres.add("Cuasimodo");
        nombres.add("Luis");
        nombres.add(0,"Flor");
        System.out.println("Los Alumnos son :" + nombres);
        
        // Read
        System.out.println("Existe Luis en el arreglo? => "+nombres.contains("Luis"));
        System.out.println("Luis esta en  => "+ nombres.indexOf("Luis"));
        
        // Update
        int indice = nombres.indexOf("Luis");
        nombres.set(indice,"Luis Angel");
        System.out.println("Los Alumnos son :" + nombres);
        
        // Delete
        System.out.println("Eliminando elementoi 0");
        nombres.remove(0);
        System.out.println("Los Alumnos son :" + nombres);
        
        int dondeEsta = buscarElemento(nombres,"luis");
        System.out.println("luis esta en => " + dondeEsta);
  }
  
  public static int buscarElemento(ArrayList<String> lista, String texto){
      for(int i=0; i<lista.size(); i++){
          if(lista.get(i).toLowerCase().equals(texto.toLowerCase())){
              return i;
          }
      }
      return -1;
  }
  
}