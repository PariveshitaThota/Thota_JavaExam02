/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author Pariveshita Thota
 */
public class Loan {
	private double annuallyInterestRate;
	private int numberOfYears;
	private double loanAmount;
	

	/** Default constructor */
	public Loan() {
		this(2.5, 1, 1000);
	}

	/** Constructor for loan with specified annually interest rate, 
	    number of years, and loan amount
     * @param annualInterestRate
     * @param numberOfYears
     * @param loanAmount
	 */
	public Loan(double annualInterestRate, int numberOfYears,
		double loanAmount) {
		this.annuallyInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
	
	}

	/** Returning annuallyInterestRate
     * @return  */
	public double getAnnualInterestRate() {
		return annuallyInterestRate;
	}

	/** Setting a new annuallyInterestRate
     * @param annuallyInterestRate */
	public void setAnnuallyInterestRate(double annuallyInterestRate) {
		this.annuallyInterestRate = annuallyInterestRate;
	}

	/** Returning the numberOfYears
     * @return  */
	public int getNumberOfYears() {
		return numberOfYears;
	}

	/** Setting the new numberOfYears
     * @param numberOfYears */
	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	/** Returning the loanAmount
     * @return  */
	public double getLoanAmount() {
		return loanAmount;
	}

	/** Setting a new loanAmount
     * @param loanAmount */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	} 

    @Override
    public String toString() {
        return "Loan{" + "annualInterestRate=" + annuallyInterestRate + ", numberOfYears=" + numberOfYears + ", loanAmount=" + loanAmount + '}';
    }
        

	/** Finding monthly payment
     * @return  */
	public double getMonthlyPayment() {
		double monthlyInterestRate = annuallyInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
			(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/** Finding total payment
     * @return  */
	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	
}

