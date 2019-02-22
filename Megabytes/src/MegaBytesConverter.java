public class MegaBytesConverter {

    public static void main(String[] args) {

        printMegaBytesAndKiloBytes(-4000) ;
        printMegaBytesAndKiloBytes(5656) ;

    }

    public static void printMegaBytesAndKiloBytes (int number) {
    int KB, XX,kbleft;
    KB=number;
    XX=KB/1024;
    kbleft=KB%1024;
    if (KB<0){
        System.out.println("Invalid Value");
        }else
        System.out.println(KB +" KB = "+ XX + " MB and "+ kbleft + " KB");
    }
}