package backend.api.gasmanager.controller.auth;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.response.CustomerResponse;
import backend.api.gasmanager.service.abstraction.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class AuthController {
    @Autowired
    private ICustomerService customerService;
    @PostMapping(path = "customer")
    public CustomerResponse addNewCustomer(@RequestBody CustomerModel model){
        return customerService.addNewCustomer(model);
    }

}
