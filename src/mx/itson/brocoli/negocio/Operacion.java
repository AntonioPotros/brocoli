/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.negocio;

/**
 * Contiene metodos para trabajar cadena de Sting.
 * @author Antonio
 */
public class Operacion {
    /**
     * Separa una cadena de texto a partir de la expresion guion medio.
     * @param valor Cadena de texto que sera separada a partir de la expresion.
     * @return Array de String en donde cada posicion representa una division.
     * 
     */
        public String[] separar(String valor){            
           String[] elementos = valor.split("-");
            return elementos;
                    
        }
        
    }
   
    

