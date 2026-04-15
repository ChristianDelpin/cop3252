public class TransactionRecord 
{
    private int accountNumber;
    private Double transactionAmount;

    public TransactionRecord(int accountNumber, Double transactionAmount)
    {
        this.accountNumber = accountNumber;
        this.transactionAmount = transactionAmount;
    }


    public int getAccountNumber()
    {
        // TODO: input validation?
        return accountNumber;
    }
    public Double getTransactionAmount()
    {
        // TODO: input validation?
        return transactionAmount;
    }

    
}