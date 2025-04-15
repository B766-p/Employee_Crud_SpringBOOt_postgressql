package jsp.Springcrud.Employee.Crudoperation.Db.PostgreSQL;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import Exception.SpringBoot.IdNotFoundException;

@ControllerAdvice
public class GlobalExceptinHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<EmployeeResponcesStatus<String>> handelIdnfo(IdNotFoundException e){
		EmployeeResponcesStatus<String> rs=new EmployeeResponcesStatus<String>();
		rs.setStatus(HttpStatus.NOT_FOUND.value());
		rs.setMessage("id not found");
		rs.setData(e.getMessage());
		return new ResponseEntity<EmployeeResponcesStatus<String>>(rs,HttpStatus.NOT_FOUND);
		
		
	}

}
