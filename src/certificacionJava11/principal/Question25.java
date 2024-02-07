package certificacionJava11.principal;

public class Question25 {


    public static void main (String args[]){
        char [] characters = new char[100];
        try (FileReader reader= new FileReader("file_to_path");) {

            System.out.println(String.valueOf(characters));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
