import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Test
{
    public static void main(String[] args)
    {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account(100,"Alan", "Jones", 348.17));
        accounts.add(new Account(300,"Mary", "Smith", 27.19));
        accounts.add(new Account(500,"Sam", "Sharp", 0));
        accounts.add(new Account(700,"Suzy", "Green", -14.22));
        

        ArrayList<TransactionRecord> transactions = new ArrayList<>();
        transactions.add(new TransactionRecord(100, 27.14));
        transactions.add(new TransactionRecord(300, 62.11));
        transactions.add(new TransactionRecord(400, 100.56));
        transactions.add(new TransactionRecord(900, 82.17));




        if(!CreateOldMaster(accounts))
        {
            Log("Error: CreateOldMaster() failed.");
            System.exit(-1);
        }

        if(!CreateTransaction(transactions))
        {
            Log("Error: CreateTransaction() failed.");
            System.exit(-1);
        }
        if(!FileMatch())
        {
            Log("Error: CreateNewMaster() failed.");
            System.exit(-1);
        }
        Log("Testing successful.");
    }

    public static Boolean CreateOldMaster(ArrayList<Account> accounts)
    {
        String accountInfo = "";
        for(Account account : accounts)
        {    
            accountInfo += String.format("%d %s %s %.2f%n", account.getAccountNumber(), account.getFirstName(),account.getLastName(),account.getBalance());
        }
        try
        {   
            
            Files.writeString(Path.of("oldmast.txt"),accountInfo);
        }
        catch(IOException e)
        {
            Log(e.getMessage());
            return false;
        }
        return true;
    }

    public static Boolean CreateTransaction(ArrayList<TransactionRecord> transactions)
    {
        String transactionInfo = "";
        for(TransactionRecord t : transactions)
        {
            transactionInfo += String.format("%d %.2f%n", t.getAccountNumber(), t.getTransactionAmount());
        }
        try
        {
            Files.writeString(Path.of("trans.txt"), transactionInfo);
        }
        catch(IOException e)
        {
            Log(e.getMessage());
            return false;
        }
        return true;
    }

    public static Boolean FileMatch()
    {
        try
        {
            List<String> mastLines = Files.readAllLines(Path.of("oldmast.txt"));
            List<String> transLines = Files.readAllLines(Path.of("trans.txt"));

            ArrayList<Account> accounts = new ArrayList<>();
            Map<Integer, Account> accountsMap = new HashMap<>();

            for(String line : mastLines)
            {
                if(line == null || line.trim().isEmpty())
                {
                    continue;
                }

                String[] split = line.trim().split("\\s+");
                if(split.length < 4)
                {
                    Log("Invalid old master record: " + line);
                    return false;
                }

                Account account = new Account(
                    Integer.parseInt(split[0]),
                    split[1],
                    split[2],
                    Double.parseDouble(split[3])
                );

                accounts.add(account);
                accountsMap.put(account.getAccountNumber(), account);
            }

            for(String line : transLines)
            {
                if(line == null || line.trim().isEmpty())
                {
                    continue;
                }

                String[] split = line.trim().split("\\s+");
                if(split.length < 2)
                {
                    Log("Invalid transaction record: " + line);
                    return false;
                }

                TransactionRecord transaction = new TransactionRecord(
                    Integer.parseInt(split[0]),
                    Double.parseDouble(split[1])
                );

                Account account = accountsMap.get(transaction.getAccountNumber());
                if(account != null)
                {
                    account.combine(transaction);
                }
                else
                {
                    Log(String.format("Unmatched transaction record for account number %d%n", transaction.getAccountNumber()));
                }
            }

            StringBuilder out = new StringBuilder();
            for(Account account : accounts)
            {
                out.append(String.format("%d %s %s %.2f%n",
                    account.getAccountNumber(),
                    account.getFirstName(),
                    account.getLastName(),
                    account.getBalance()));
            }

            Files.writeString(Path.of("newmast.txt"), out.toString());
        }
        catch (NumberFormatException e)
        {
            Log(e.getMessage());
            return false;
        }
        catch (IOException e)
        {
            Log(e.getMessage());
            return false;
        }



        return true;
    }
    private static void Log(String msg)
    {
        try
        {
            Files.writeString(Path.of("log.txt"),msg,StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        }
        catch(IOException e)
        {
            System.err.printf("Lol somehow logging messed up. %s%n",e.getMessage());
        }
    }
}