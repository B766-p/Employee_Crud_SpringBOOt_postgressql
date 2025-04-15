package jsp.Springcrud.Employee.Crudoperation.Db.PostgreSQL;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequestMapping("/emp")
public class Controlerclasswithresponse {
	   /*@Autowired
	    private Emprepo emrp;

	    // Add new employee
	    @PostMapping
	    public ResponseEntity<EmployeeResponcesStatus<Employee>> addData(@RequestBody Employee e) {
	        Employee savedEmp = emrp.save(e);
	        EmployeeResponcesStatus<Employee> response = new EmployeeResponcesStatus<>();
	        response.setStatus(HttpStatus.CREATED.value());
	        response.setMessage("Employee added successfully");
	        response.setData(savedEmp);
	        return new ResponseEntity<>(response, HttpStatus.CREATED);
	    }

	    // Get all employees
	    @GetExchange
	    public ResponseEntity<EmployeeResponcesStatus<List<Employee>>> getAllEmployees() {
	        List<Employee> list = emrp.findAll();
	        EmployeeResponcesStatus<List<Employee>> response = new EmployeeResponcesStatus<>();
	        response.setStatus(HttpStatus.OK.value());
	        response.setMessage("All employee data fetched successfully");
	        response.setData(list);
	        return new ResponseEntity(response,HttpStatus.OK);
	    }

	    // Get employee by ID
	    @GetMapping("/{id}")
	    public ResponseEntity<EmployeeResponcesStatus<Employee>> getDataById(@PathVariable int id) {
	        Optional<Employee> emp = emrp.findById(id);
	        EmployeeResponcesStatus<Employee> response = new EmployeeResponcesStatus<>();

	        if (emp.isPresent()) {
	            response.setStatus(HttpStatus.OK.value());
	            response.setMessage("Employee found");
	            response.setData(emp.get());
	            return  new ResponseEntity(response,HttpStatus.OK);
	        } else {
	            response.setStatus(HttpStatus.NOT_FOUND.value());
	            response.setMessage("Employee not found with ID: " + id);
	            response.setData(null);
	            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	        }
	    }

	    // Update employee by ID
	    @PutMapping("/{id}")
	    public ResponseEntity<EmployeeResponcesStatus<Employee>> updateDataById(@PathVariable int id, @RequestBody Employee e) {
	        Optional<Employee> empOptional = emrp.findById(id);
	        EmployeeResponcesStatus<Employee> response = new EmployeeResponcesStatus<>();

	        if (empOptional.isPresent()) {
	            Employee emp = empOptional.get();
	            emp.setName(e.getName());
	            emp.setDepartment(e.getDepartment());
	            emp.setEmail(e.getEmail());
	            Employee updated = emrp.save(emp);

	            response.setStatus(HttpStatus.OK.value());
	            response.setMessage("Employee updated successfully");
	            response.setData(updated);
	            return ResponseEntity.ok(response);
	        } else {
	            response.setStatus(HttpStatus.NOT_FOUND.value());
	            response.setMessage("Employee not found with ID: " + id);
	            response.setData(null);
	            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	        }
	    }

	    // Delete employee by ID
	    @DeleteMapping("/{id}")
	    public ResponseEntity<EmployeeResponcesStatus<Void>> deleteDataById(@PathVariable int id) {
	        EmployeeResponcesStatus<Void> response = new EmployeeResponcesStatus<>();

	        if (emrp.existsById(id)) {
	            emrp.deleteById(id);
	            response.setStatus(HttpStatus.OK.value());
	            response.setMessage("Employee deleted successfully");
	            response.setData(null);
	            return ResponseEntity.ok(response);
	        } else {
	            response.setStatus(HttpStatus.NOT_FOUND.value());
	            response.setMessage("Employee not found with ID: " + id);
	            response.setData(null);
	            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	        }
	    }*/
}
