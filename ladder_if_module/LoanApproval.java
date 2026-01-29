package ladder_if_module;

public class LoanApproval {
	public String checkLoanApproval(double salary,int creditScore) {
		if(salary>80000 && creditScore>750)
			return "Loan Approved Immediately";
		else if((salary<=80000 && salary>50000) && (creditScore<=750 && creditScore>650))
				return "Loan  Approved with Higher Interest Rate";
		else if((salary<50000 && salary>30000) && (creditScore<=650 && creditScore>500))
				return "Co-signer Required";
		else if(salary>80000 || creditScore>750)
			return "Requirement not matched for loan approval";
		else if((salary<=80000 && salary>50000) || (creditScore<=750 && creditScore>650))
				return "Mismatched eligibility for loan";
		else if((salary<50000 && salary>30000) || (creditScore<=650 && creditScore>500))
				return "Mismatched eligibility for loan";
		return "Loan Rejected";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanApproval lpo=new LoanApproval();
		System.out.println(lpo.checkLoanApproval(85000, 50));

	}

}
