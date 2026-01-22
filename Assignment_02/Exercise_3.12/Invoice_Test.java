public class Invoice_Test
{
    public static void main(String[] args)
    {
        Invoice invoice = new Invoice("1234", "Widget", 10, 2.5);
        
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());

        System.out.println("\n\nTesting negative values\n\n");
        invoice.setPartNumber("5678");
        invoice.setPartDescription("Magnet");
        invoice.setQuantity(-5); // Testing negative quantity
        invoice.setPricePerItem(-3.0); // Testing negative price

        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Part Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price Per Item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}