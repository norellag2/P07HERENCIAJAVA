package rrhh;

public class Main {
    public static void main(String[] args) {
        SalesDirector directorCC = new SalesDirector("Juan", "Perez", "Cáceres", "Electrónica", "PCs");
        System.out.println(directorCC.getName());
        //aunque no fuera común podemos usar la superClase Employee
        Employee empleado = new Employee ("Lucía", "Gómez", "Badajoz");
        System.out.println (empleado.getSurname());
    }
}
