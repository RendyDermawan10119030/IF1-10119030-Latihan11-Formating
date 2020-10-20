package if1.pkg10119030.latihan11.formatting;
/*
 * Nama     : Rendy Dermawan
 * Kelas    : IF-1
 * NIM      : 10119030
 * Deskripsi Program :Latihan Teks
 */
public class IF110119030Latihan11Formatting {
    
    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i : " + i);
        System.out.println("%%d : %d%n", i);
        System.out.println("%%10d : %10d%n", i);
        System.out.println("%%+10d : %+10d%n", i);
        System.out.println("%%+10d : %+10d%n", iMinus);
        System.out.println("%%,10d : %,10d%n", i);
        System.out.println("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.println("%%f : %f%n", f);
        System.out.println("%%.2f : %.2f%n", f);
        System.out.println("%%12.2f : %12.2f%n", f);
        System.out.println("%%,12.2f : %,12.2f%n",f);
        

    }
    
}
