package Bpackage;

/**
 * Created by Bonny on 2015-01-03.
 */
public class Main {


    public static void main (String args[]){
        String os = System.getProperty("os.name");
        System.out.println(os);
        EditorTwo app = new EditorTwo();
        app.buildGUI();
    }

}
