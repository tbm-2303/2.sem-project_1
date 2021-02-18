public class Transactions {

    int amount;
    //date
    String type; // type skal sættes alt efter om der hæves, indsættes eller overføres.

    public Transactions(int amount, String type) {
        this.amount = amount;
        this.type = type;
    }
}
