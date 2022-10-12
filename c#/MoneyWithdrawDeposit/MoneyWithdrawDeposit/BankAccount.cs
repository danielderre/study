using System;
namespace MoneyWithdrawDeposit
{
    public class BankAccount
    {
        public int Number { get; private set; }
        public string Owner { get; set; }
        public double Balance { get; private set; }

        public BankAccount(int number, string owner)
        {
            Number = number;
            Owner = owner;
        }

        public BankAccount(int number, string owner, double balance): this(number,owner)
        {
            Balance = balance;
        }

        public override string ToString()
        {
            return "Account"
            + Number
            + ", Account owner: "
            + Owner
            + ", Account balance: $"
            + Balance.ToString("F2");
        }
    }
}
