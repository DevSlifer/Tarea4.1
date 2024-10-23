/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProcesarDatos;

/**
 *
 * @author Supre
 */
public class ProcesarDatos {
    private String nombre;
    private String apellido;
    private String matricula;
    private String correo;
    
    //public ProcesarDatos(){}

    public void capturarDatos(String nombre, String apellido, String matricula, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.correo = correo;
    }
    
    public String presentarDatos(){
        return  "Nombre: " + nombre + "\nApellido: " + 
                apellido + "Matricula" + matricula + "\nCorreo: " + correo;

    }
}
