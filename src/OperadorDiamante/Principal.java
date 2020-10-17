package OperadorDiamante;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Principal {

	public static void main(String[] args) {
		
		/* 
		 * ejemplo de operador diamante en java
		 * 
		 */
		
		        List<Map<String, String>> lista= new ArrayList<Map<String,String>>();
		        Map<String,String> mapa= new HashMap<String,String>();
		        mapa.put("clave1", "valor1");
		        lista.add(mapa);
		        lista.forEach(System.out::println);
		        
		        List<Map<String, String>> lista2= new ArrayList<>();
		        Map<String,String> mapa2= new HashMap<>();
		        mapa2.put("clave1", "valor1");
		        lista2.add(mapa2);
		         
		        lista2.forEach(System.out::println);
		    }		  
		}

