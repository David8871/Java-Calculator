import java.util.ArrayList;


public class Produs {
    public static void main(String[] args)
    {
        ArrayList attribute = new ArrayList();
        //ArrayList line = new ArrayList();

        attribute.add("nume");
        attribute.add("pret");
        attribute.add("raion");

        for (double calc=0.0;calc<=200;)
        {
            calc++;
            if(calc<100)
            {
                System.out.println("Suma este de: " +calc);
            }
            else{
                System.out.println("Felicitari suma ta este de: "+calc + attribute.contains("raion"));
                break;
            }
        }
    }

    private static int attribute(int i) {
        return attribute(2);
    }

}
