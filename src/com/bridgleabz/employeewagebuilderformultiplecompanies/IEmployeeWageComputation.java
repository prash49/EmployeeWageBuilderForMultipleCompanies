package com.bridgleabz.employeewagebuilderformultiplecompanies;

public interface IEmployeeWageComputation {
    public interface IComputeEmployeeWage {
        public void addCompanyInfo(String companyName, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
        public void computeEmpWage();

    }
}
