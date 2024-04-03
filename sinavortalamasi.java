import java.util.Scanner;
public class sinavortalamasi {
    public static void main(String[]args){
        Scanner giris=new Scanner(System.in);
        System.out.println("Vize notunuzu giriniz: ");
        int vize=giris.nextInt();
        System.out.println("Final notunuzu giriniz: ");
        int finalNotu=giris.nextInt();
        double ortalama=(vize*0.4)+(finalNotu*0.6);
        if(ortalama<45){
            System.out.println("Ortalama:"+ortalama+" Zayıf not");
        }
        else if(ortalama<55){
            System.out.println("Ortalama:"+ortalama+" Geçer");
        }
        else if(ortalama<77){
            System.out.println("Ortalama:"+ortalama+" Orta");
        }
        else if(ortalama<85){
            System.out.println("Ortalama: "+ortalama+" İyi");
        }
        else{
            System.out.println("Ortalama: "+ortalama+" Pekiyi");
        }
    }
}
