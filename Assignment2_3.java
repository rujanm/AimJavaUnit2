public class Assignment2_3 {
    
    public static void main(String args[]) {


        System.out.println("\n" + "Kilograms" + "\t" + "Pounds");
        System.out.println("---------" + "\t" + "------");

        for(int rows = 0; rows < 8; rows++) {
            int Kilos = (rows * 2) + 1;
                float Lbs = Kilos * 2.2f;
                System.out.println(Kilos + "\t\t" + String.format("%.1f",Lbs));
        }

        System.out.println("\nGoodbye... \n");

    }

}
