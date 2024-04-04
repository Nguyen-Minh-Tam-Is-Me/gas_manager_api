package backend.api.gasmanager.controller.customer;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.response.CustomerResponse;
import backend.api.gasmanager.service.abstraction.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/customer", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("getAll")
    public CustomerResponse getAllCustomer(){
        return customerService.getAllCustomer();
    }
}
