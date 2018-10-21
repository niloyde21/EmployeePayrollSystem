package employee.payroll.system.model;

import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class EmployeeDetails {
	@JsonProperty("employee")
    private List<Employee> employees;

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}


}
