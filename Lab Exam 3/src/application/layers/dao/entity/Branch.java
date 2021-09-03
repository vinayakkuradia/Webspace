package application.layers.dao.entity;

import application.exceptions.IllegalBranchException;

public enum Branch {
	JAVA, ORACLE, PHP, DOTNET;
	
	public Branch resolver(String branchString) {
		Branch branch;
		if (branchString.toLowerCase().equals("java")) {
			branch = Branch.JAVA;
		}
		else if (branchString.toLowerCase().equals("oracle")) {
			branch = Branch.ORACLE;
		}
		else if (branchString.toLowerCase().equals("php")) {
			branch = Branch.PHP;
		}
		else if (branchString.toLowerCase().equals("dotnet")) {
			branch = Branch.DOTNET;
		}
		else {
			throw new IllegalBranchException("Invalid Branch");
		}
		return branch;
	}
	
}
