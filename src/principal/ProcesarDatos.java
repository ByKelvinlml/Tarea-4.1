/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

//Kelvin Garcia Vargas 20241606

public class ProcesarDatos {
    private String matricula;
    private String nombres;
    private String apellidos;
    private String carrera;
    
    //Metedos para capturar y presentar datos
    
    public void capturarDatos(String matricula,
                              String nombres,
                              String apellidos,
                              String carrera){

        this.matricula = matricula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;

    }

    public String presentarDatos(){

        return "Matrícula: " + matricula +
               "\nNombres: " + nombres +
               "\nApellidos: " + apellidos +
               "\nCuatrimestre: " + carrera;
    }
}
