import java.util.Locale;

public class Solver{
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Pig pig = new Pig(20);
        System.out.println(pig); //I:() M:0.00 V:0/20 EQ:false
        pig.addCoin(Coin.M10);
        pig.addCoin(Coin.M50);
        System.out.println(pig); //I:() M:0.60 V:4/20 EQ:false

        pig.addItem(new Item("ouro", 3));
        System.out.println(pig); //I:(ouro) M:0.60 V:7/20 EQ:false

        pig.addItem(new Item("passaporte", 2));
        System.out.println(pig); //I:(ouro, passaporte) M:0.60 V:9/20 EQ:false

        pig.getItens();  //Voce deve quebrar o cofre primeiro
        pig.getCoins(); //Voce deve quebrar o cofre primeiro
        System.out.println(pig); //I:(ouro, passaporte) M:0.60 V:9/20 EQ:false
        pig.addItem(new Item("travesseiro", 22)); //nao cabe no porco

        pig.breakPig();
        pig.breakPig(); //fail: porco ja esta quebrado

        System.out.println(pig.getItens());  //ouro, passaporte
        System.out.println(pig.getCoins()); //0.60
        System.out.println(pig); //I:() M:0.00 V:0/20 EQ:true
    }
}