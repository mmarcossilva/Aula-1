package aula1.pt2;

public class Ex3 {
    public static void main(String[] args) {
        Produto[] products = new Produto[3];
        products[0] = new Produto(1, "Arroz", 10.99, 2);
        products[1] = new Produto(2, "Feijão", 14.49, 1);
        products[2] = new Produto(3, "Tomate", 9.99, 5);
        double total = 0;
        for (Produto product : products) {
            System.out.println(product.toString());
            total += product.getTotalValue();
        }
        System.out.println("Valor total: " + total);
    }
}

class Produto{
    private int id;
    private String nome;
    private double value;
    private int quantity;

    public Produto(int id, String name, double value, int quantity){
        setId(id);
        setNome(name);
        setQuantity(quantity);
        setValue(value);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalValue(){
        return quantity*value;
    }

    public String toString(){
        return "Produto " + this.getId() +
                "\n" + this.getNome() +
                "\nR$" + this.getValue() +
                "\nQuantidade: " + this.getQuantity() +
                "\n";
    }
}
