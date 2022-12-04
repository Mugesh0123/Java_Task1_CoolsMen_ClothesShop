package coolmens;

public class EmployeeDetails {
	private String eName;
	private int eSalary;
	private int Experience;
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	public int getExperience() {
		return Experience;
	}
	public void setExperience(int experience) {
		Experience = experience;
	}
	public EmployeeDetails(String eName, int eSalary, int experience) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
		Experience = experience;
	}
	@Override
	public String toString() {
		return "\n Employees Details : \n Employee Name : " + eName + " \n Employee Salary : " + eSalary + " \n Experience : " + Experience + "\n";
	}
	

}
