import java.util.Scanner;

public class kk {
    public static void main(String[] args) {
        ProgrammingBook a[] = new ProgrammingBook[10];
        a[0] = new ProgrammingBook("ko",15,"java");
        a[1] = new ProgrammingBook("ko1",151,"lo");
        a[2] = new ProgrammingBook("ko2",152,"java");
        a[3] = new ProgrammingBook("ko3",153,"lo");
        a[4] = new ProgrammingBook("ko4",154,"java");
        a[5] = new ProgrammingBook("ko5",155,"lo");
        a[6] = new ProgrammingBook("ko6",156,"lo");
        a[7] = new ProgrammingBook("ko7",157,"java");
        a[8] = new ProgrammingBook("ko8",158,"lo");
        a[9] = new ProgrammingBook("ko9",159,"lo");

        int total = 0;
        Scanner p = new Scanner(System.in);
        System.out.println("nhap ");
        int gia = p.nextInt();

        for (int i = 0; i < 10; i++) {
            total +=  a[i].getPrice();
            System.out.println(a[i].getBookCode()+" "+a[i].getPrice());
        if(a[i].getLanguage() == "java"){
            System.out.println(a[i].getBookCode());
        };
            if(a[i].getPrice()<gia) {
                System.out.println(" sach "+ a[i].getBookCode());
            }

        }
        System.out.println("tong: "+ total);

    }

}
