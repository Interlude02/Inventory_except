package Lab_5_Starter;

public class InvalidRetailPriceException extends Exception{
    public InvalidRetailPriceException(){
        super("Invalid Retail Price");
    }
    public InvalidRetailPriceException(double price){
        super("Invalid Retail Price" + price);
    }
}
