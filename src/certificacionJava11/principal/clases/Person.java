package certificacionJava11.principal.clases;

public class Person {
    private String name="Green";
    public void setName (String name){
        String tittle ="Mr.";
        name= tittle + name;
    }
    public String toString(){
        return name;
    }

}
