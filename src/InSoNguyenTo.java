import java.util.Scanner;

public class InSoNguyenTo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Moi Ban Nhap So Luong So Nguyen To Muon In Ra : ");
        int number = input.nextInt();

        int count = 0;
        int prime=0;
        while (count < number) {
            if (prime(prime)) {
                System.out.println(prime);
                count++;
            }

            prime = prime + 1;
        }

    }

    private static boolean prime(int prime) {
        if (prime == 2) {
            return true;
        }
        if (prime < 2) {
            return false;
        } else {
            for (int i = 2; i < Math.sqrt(prime); i++) {
                if (prime % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
