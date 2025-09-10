public class Alumno {
    int id;
   String nombre;
   int calificacion;

public int getid(){return id;}
public void setid(int id){this.id = id;}

public String getNombre() {return nombre;}
public void setNombre(String nombre) {this.nombre = nombre;}

public int getcalificacion() {return calificacion;}
public void setcalificacion(int calificacion) {this.calificacion = calificacion;}

  public Alumno(int id, String nombre, int calificacion){
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
  }

  void mostrar(){
    System.out.print("Calificacion " + this.calificacion);

  }
}
