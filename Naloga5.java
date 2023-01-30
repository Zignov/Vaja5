import java.util.Scanner;

class Naloga5{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        String[] vnos = new String[999];


        for(int i = 0;; i++){
            System.out.println("Vnesite");

            vnos[i] = sc.nextLine();

            if(vnos[i].equalsIgnoreCase("konec")){
                System.out.println("----------------------");
                for (int j = 0; j<i; j++){
                    System.out.println(vnos[j]);
                }
                System.exit(0);
            }
        }
    }
}