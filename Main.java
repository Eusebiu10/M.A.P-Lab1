package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
class MatheAufgabe1{
    private ArrayList<int> v=new ArrayList<>();
    //aufgabe 1
    //se returneaza notele insuficiente
    public static int<> tr(int v<>,int n)
    {
        int a[10];
        int j=1;
        for(int i=1;i<=n;i++)
            if(v[i]<40) {
                a[j] = v[i];
                j+=1;
            }
        return a;
    }

    //2
    //returneaza valoarea medie
    public static int med(int v[],int n)
    {int m=0,e=0;
        for(int i=1;i<=n;i++) {
            m+=v[i];
            e++;
        }
    return m/e;
    }
    //3
    //functia rotunjeste notele
    public static void ro(int v[],int n)
    {
        for(int i=1;i<=n;i++)
            if(v[i]%5!=0)if(v[i]%5<3&&v[i]>38)v[i]=v[i]+5-v[i]%5;
    }

    public static int max(int v[])
    {int max=v[1];
        for(int i=1;i<=n;i++){
            if(v[i]%5!=0)if(v[i]%5<3&&v[i]>38)v[i]=v[i]+5-v[i]%5;
            if(v[i]>max)max=v[i];
            }
        return max;
    }


}

//aufgabe 2
class MatheAufgabe2 {
    private ArrayList<Integer> zahlen;

    public MatheAufgabe2(){
        this.zahlen = new ArrayList<>();
    }

    //- Constructor

    public MinMaxFinder(ArrayList<Integer> zahlen){
        this.zahlen = zahlen;
    }


    //numar maxim
    public int findeMax() throws Exception {
        if (this.zahlen.isEmpty()){
            throw new Exception("Sirul este gol");
        }
        int max = this.zahlen.get(0);
        for (int zahl : this.zahlen){
            if (zahl > max){
                max = zahl;
            }
        }
        return max;
    }
    //numar minim
    public int findeMin() throws Exception {
        if (this.zahlen.isEmpty()){
            throw new Exception("Sirul este gol");
        }
        int min = this.zahlen.get(0);
        for (int zahl : this.zahlen){
            if (zahl < min){
                min = zahl;
            }
        }
        return min;
    }

//suma maxima de n numere din arr
public int findeMaxSumNMinusEinsZahlen() {
    int sum = 0;
    try {
        int min = findeMin();
        for (int zahl : this.zahlen) {
            sum += zahl;
        }
        return sum-min;
    } catch (Exception exception) {
        return sum;
    }
}

    //functia calculeaza suma minima
    public int findeMinSumNMinusEinsZahlen() {
        int sum = 0;
        try {
            int max = findeMax();
            for (int zahl : this.zahlen) {
                sum += zahl;
            }
            return sum-max;
        } catch (Exception exception) {
            return sum;
        }
    }

}



class MatheAufgabe3
{
    //1
    //Calculez suma a 2 nr mari
    public ArrayList<Integer> Summe(ArrayList<Integer> z1, ArrayList<Integer> z2){
        int carry = 0;
        ArrayList<Integer> r = new ArrayList<>();
        
        }
        for (int idx = z1.size() - 1; idx >= 0; idx--){
            r.set(idx, (z1.get(idx) + z2.get(idx) + carry) % 10);
            if ((z1.get(idx) + z2.get(idx) + carry) > 9){
                carry = 1;
            } else {
                carry = 0;
            }
        }

        //se verifica trecere peste ordin
        if (carry == 1){
            r.add(0, 1);
        }
        return r;
    }


    //2
    //diferenta a 2 nr
    public ArrayList<Integer> Dif(ArrayList<Integer> z1, ArrayList<Integer> z2){
        int borrow = 0;
        ArrayList<Integer> r = new ArrayList<>();

        for (int idx = z1.size() - 1; idx >= 0; idx--){
            if (z1.get(idx) - z2.get(idx) - borrow < 0){
                r.set(idx, (10 + z1.get(idx) - z2.get(idx) - borrow));
                borrow = 1;
            } else {
                r.set(idx, (z1.get(idx) - z2.get(idx) - borrow));
                borrow = 0;
            }
        }
        return r;
    }


    //3
    //inmultire
    public ArrayList<Integer> imul(ArrayList<Integer> z1, int z2){
        ArrayList<Integer> r = new ArrayList<>();
        for (int idx = 0; idx < z1.size(); idx++){
            r.add(0);
        }
        int carry = 0;
        // Man durchquert die Ziffern des Zahles von rechts nach links
        for (int idx = z1.size() - 1; idx >= 0; idx--){
            r.set(idx, (z1.get(idx) * z2 + carry) % 10);
            carry = ((z1.get(idx) * z2 + carry) / 10);
        }
        if (carry != 0){
            r.add(0, carry);
        }

        return r;
    }

    //4
    //div
    public ArrayList<Integer> Div(ArrayList<Integer> z1, int z2){
        ArrayList<Integer> r = new ArrayList<>();
        // Das rat wird vorbereitet
        for (int idx = 0; idx < z1.size(); idx++){
            r.add(0);
        }
        int carry = 0;
        // Man durchquert die Ziffern des Zahles von links nach rechts
        for (int idx = 0; idx < r.size(); idx++){
            r.set(idx, (carry*10 + z1.get(idx)) / z2);
            carry = (carry*10 + z1.get(idx)) % z2;
        }
        if (r.get(0) == 0){
            r.remove(0);
        }
        return r;
    }

public class MathAufgabe4 {
    private ArrayList<Integer> preiseTastaturen;
    private ArrayList<Integer> preiseUSBLaufwerke;

    //Constructor

    ElektronikShop(ArrayList<Integer> preiseTast, ArrayList<Integer> preiseUsbL){
        preiseTastaturen = new ArrayList<>(preiseTast);
        preiseUSBLaufwerke = new ArrayList<>(preiseUsbL);
    }


 ///1
    //pretul min.
    public int findeMax() throws Exception {
     if (this.preiseTastaturen.isEmpty()){
         throw new Exception("Sirul este gol");
     }
     int max = this.zahlen.get(0);
     for (int zahl : this.zahlen){
         if (zahl > max){
             max = zahl;
         }
     }
     return max;
 }

    //3
    //cel mai scum usb in buget
    public int UsbLBudget(int budget){
        int MP = -1;
        for (int preis : preiseUSBLaufwerke){
            if (preis <= budget && preis > MP){
                MP = preis;
            }
        }
        if (MP == -1){
            throw new Exception("Sirul ewste gol");
        }
        return MP;
    }

}