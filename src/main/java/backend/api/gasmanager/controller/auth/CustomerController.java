package backend.api.gasmanager.controller.auth;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.response.CustomerRegisterResponse;
import backend.api.gasmanager.service.abstraction.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @PostMapping
    public CustomerRegisterResponse addNewCustomer(@RequestBody CustomerModel model){
        return customerService.addNewCustomer(model);
    }
}
