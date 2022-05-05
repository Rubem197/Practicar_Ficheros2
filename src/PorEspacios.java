import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PorEspacios {
    public static void main(String[] args) {
        try {
            BufferedReader bf = new BufferedReader(new FileReader("porespacio.txt"));
            String linea = null;
            String [] datos = null;
            int contador=0;
            List<String> cleanData = new ArrayList<String>();
            while ((linea = bf.readLine()) != null) {
                StringBuilder sb = new StringBuilder();
                datos = linea.split(" ");
                for ( String valor : datos){
                    sb.append(valor);
                    System.out.println(sb);
                    sb.delete(0,datos.length);
                }
                cleanData.add(sb.toString());
            }
        } catch (Exception e) {
            System.out.println("awa");
        }

    }
}


