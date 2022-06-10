package rrhh;
// Tendremos herencia con la palabra extends seguida de la superClase

public class SalesDirector extends Employee {
    private String area;
    private String division;

    SalesDirector(String name, 
                  String surname, 
                  String city,
                  String area,
                  String division) {
       super(name, surname, city);
       this.area = area;
       this.division = division;
    }

    public String getArea(){
        return this.area;
    }
    public void  setArea(String area) {
        this.area = area;
    }

    
    public String getDivision(){
        return this.division;
    }
    public void  setDivision(String division) {
        this.division = division;
    }
}
