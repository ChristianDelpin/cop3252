public class PieceWorker extends Employee
{
    private final int pieces;
    private final double wage;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, int pieces, double wage)
    {
        super(firstName, lastName, socialSecurityNumber);
        this.pieces = pieces;
        this.wage = wage;
    }

    public double earnings()
    {
        return wage*pieces;
    }

    @Override
    public String toString()
    {
        return String.format("piece worker %s%n%s: %d%n%s: $%,.2f", super.toString(), "pieces", pieces, "wage per piece", wage);
    }
}