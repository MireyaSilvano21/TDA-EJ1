import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Alumno alumno1 = new Alumno(001, "Mireya", 9);
        Alumno alumno2 = new Alumno(002, "Usiel", 9);
        Alumno alumno3 = new Alumno(003, "Mariana", 10);
        Alumno alumno4 = new Alumno(004, "Fernando", 5);
        Alumno alumno5 = new Alumno(005, "Leo", 7);
        Alumno alumno6 = new Alumno(06, "Eliel", 10);

       List<Alumno> alumnos = new ArrayList<>();
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);
        alumnos.add(alumno4);
        alumnos.add(alumno5);
        alumnos.add(alumno6);
        

        //Recorrer elementos de la lista
        for(Alumno alumnoo : alumnos){
            System.out.println(alumnoo.calificacion);
        }

        //Promedio 
        double sumaCalif = 0;
        for(Alumno alumnoo : alumnos){
            sumaCalif += alumnoo.calificacion;
        }

        double promedio = sumaCalif / alumnos.size();
        System.out.println("-----------------");
        System.out.println("Promedio:"+promedio);

        //Remove 
        for(int i = 0; i<alumnos.size(); i++){
            if (alumnos.get(i).calificacion <6){
                alumnos.remove(i);
                break;
            }
        }
        
        System.out.println("-----------------");
        System.out.println("Nueva Lista");
        //elementos de la lista nueva
        for(Alumno alumnoo : alumnos){
            System.out.println(alumnoo.calificacion);
        }
    }
}
