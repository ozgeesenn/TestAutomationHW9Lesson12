public class main {

    public static void main (String[] args)
    {
        //Exception-1
        int[] numberList = {1,2,3,4,5,6};

        try{
            int searchNumber = numberList[45];
            System.out.println("Değer: "+searchNumber);


        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hata Mesajı 1: " + e.getMessage());
        }

        //Exception-2

        try {
            int result = divide(10, 0);
            System.out.println("Sonuc: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hata Mesajı 2: " + e.getMessage());
        }

        //Exception-3
        try {
            int result = squareRoot(-1);
            System.out.println("KaresiSonucu: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata Mesajı 3: " + e.getMessage());
        }
    }

    static int divide(int a,int b) {
        if (b == 0) {
            throw new ArithmeticException("Br sayı 0'a bölünemez!");
        }
        return a / b;
    }

    static int squareRoot(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Kare alma islemi icin 0'dan buyuk sayi girilmelidir.");
        }
        return (int) Math.sqrt(number);
    }
}
