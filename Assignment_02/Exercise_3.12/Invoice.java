public class Invoice
{
    private String partNumber;
    private String partDescription;

    private int quantity;
    private double pricePerItem;
    Invoice(String partNumber, String partDescription, int quantity, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    // Get
    public String getPartNumber()
    {
        return partNumber;
    }
    public String getPartDescription()
    {
        return partDescription;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    
    // Set
    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity)
    {
            this.quantity = quantity;
    }
    public void setPricePerItem(double pricePerItem)
    {
        this.pricePerItem = pricePerItem;
    }

    // I think I'm required to modify quantity and pricePerItem here if negative, not in the setters.
    public double getInvoiceAmount()
    {
        if(quantity < 0)
            quantity = 0;
        if(pricePerItem < 0)
            pricePerItem = 0.0;

        return quantity * pricePerItem;
    }

}