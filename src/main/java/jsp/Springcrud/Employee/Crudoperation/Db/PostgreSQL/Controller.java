package jsp.Springcrud.Employee.Crudoperation.Db.PostgreSQL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
/*
	@Autowired
	private Emprepo emrp;
	//inserting Data
	@PostMapping("/emp")
	public String addData(@RequestBody Employee e) {
		emrp.save(e);
		return "Data added/employee dataInserted";
	}
	// Get all employees
    @GetMapping("/emp")
    public List<Employee> getAllEmployees() {
        return emrp.findAll();
    }
     // Get employee by ID
    @GetMapping("/emp/{id}")
    public Employee getDataById(@PathVariable int id) {
        		Optional<Employee> op= emrp.findById(id);
        		if(op.isPresent()) {
        			return op.get();
        		}
        		else {
        			return null;
        		}
    }
    //  Update full employee by sending all fields
    @PutMapping("/emp")
    public String updateData(@RequestBody Employee e) {
    	emrp.save(e);
       
            return "Employee updated successfully";
 
    }
 // Update employee by ID (partial or full)
    @PutMapping("/emp/{id}")
    public String updateDataById(@PathVariable int id, @RequestBody Employee e) {
        Optional<Employee> empOptional = emrp.findById(id);
        if (empOptional.isPresent()) {
            Employee emp = empOptional.get();
            emp.setName(e.getName());
            emp.setDepartment(e.getDepartment());
            emp.setEmail(e.getEmail());
            emrp.save(emp);
            return "Employee with ID " + id + " updated successfully";
        } else {
            return "Employee with ID " + id + " not found";
        }
    }
    //  Delete employee by ID
    @DeleteMapping("/emp/{id}")
    public String deleteDataById(@PathVariable int id) {
        if (emrp.existsById(id)) {
            emrp.deleteById(id);
            return "Employee with ID " + id + " deleted successfully";
        } else {
            return "Employee with ID " + id + " not found";
        }
    }*/
}
