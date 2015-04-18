/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Solution.Lab0;

/**
 *
 * @author Taylor
 */
import java.util.Date;


public class Employee {
    public static final int MAX_VACATION_DAYS = 28;
    public static final int MIN_NAME_LENGTH = 3;
    private String firstName;
    private String lastName;
    private String ssn;
    private Date hireDate;
    private int daysVacation;

    public Employee() {
        firstName = "Unknown";
        lastName = "Unknown";
        ssn = "Unknown";
        hireDate = new Date();
        daysVacation = 0;
    }

    public Employee(String firstName, String lastName, String ssn, Date hireDate, int daysVacation) throws IllegalArgumentException {
        setFirstName(firstName);
        setLastName(lastName);
        setSsn(ssn);
        this.hireDate = hireDate;
        this.daysVacation = daysVacation;
    }
    
    public int getDaysVacation() {
        return daysVacation;
    }

    public void setDaysVacation(int daysVacation) {
        if (daysVacation  <= 0 || daysVacation >= MAX_VACATION_DAYS) {
            throw new IllegalArgumentException("Vacation days must be between 0 and " + MAX_VACATION_DAYS);
        }
        this.daysVacation = daysVacation;
    }

    public String getFirstName() {
        return firstName;
    }

    public final void setFirstName(String firstName) {
       if (firstName == null || firstName.length() <= MIN_NAME_LENGTH) {
           throw new IllegalArgumentException("First Name must be at least " + MIN_NAME_LENGTH + " characters long");
       }
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        if(hireDate == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        this.hireDate = hireDate;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() <= MIN_NAME_LENGTH) {
           throw new IllegalArgumentException("Last Name must be at least " + MIN_NAME_LENGTH + " characters long");
       }
        this.lastName = lastName;
    }

    public final String getSsn() {
        return ssn;
    }

    // 333-33-3333
    // 333333333
    public void setSsn(String ssn) {
        if (ssn == null ) {
            
        }
        this.ssn = ssn;
    }
    
    
    
}

