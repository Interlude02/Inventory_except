package Lab_5_Starter;

import javax.swing.*;

/**

 Lab 5 Starter program
 The CellPhone class holds data about a cell phone.
*/
public class CellPhone//add construcotrs and stuff
{
   // Fields
   private String model;
   private String manufacturer;    // Manufacturer
   private double retailPrice; // Retail price

   public CellPhone(String model, String manufacturer, double price)
           throws InvalidModelException, InvalidManufacturerException, InvalidRetailPriceException
   {
      setModel(model);
      setManufacturer(manufacturer);
      setRetailPrice(price);
   }
   public CellPhone() throws InvalidModelException, InvalidManufacturerException, InvalidRetailPriceException {
      this("","",0.0);
   }

   public void setModel(String model) throws InvalidModelException
   {
      if (model.length() == 0)
         throw new InvalidModelException();
      else
         this.model = model;


   }
   public void setManufacturer(String manufacturer) throws InvalidManufacturerException
   {
      if (manufacturer.length() == 0)
         throw new InvalidManufacturerException();
      else
      this.manufacturer = manufacturer;
   }
   
   public void setRetailPrice(double price) throws InvalidRetailPriceException
   {
      if (price < 0 || price > 1500)//price == 0 not work//fix it to where if left blank the exception appears
         throw new InvalidRetailPriceException();//also when an error pops up it must say in the terminal
      else//check page 7 of lab 5 doc
      retailPrice = price;

   }

   public String getModel()
   {
      return model;
   }
   public String getManufacturer()
   {
      return manufacturer;
   }
   public double getRetailPrice()
   {
      return retailPrice;
   }

   //modify so that it throws exception when error occurs, invalidmodel, invalid manufacturer,
   // invalid price

   @Override
   public String toString(){
      return String.format("Model: %-20sManufacturer: %-20sretail price: %10.2f%n",getModel(), getManufacturer(),
              getRetailPrice());

    }
}