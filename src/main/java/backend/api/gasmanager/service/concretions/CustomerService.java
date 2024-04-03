package backend.api.gasmanager.service.concretions;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.model.dto.CustomerDTO;
import backend.api.gasmanager.model.mapper.CustomerMapper;
import backend.api.gasmanager.repository.CustomerRepository;
import backend.api.gasmanager.response.CustomerRegisterResponse;
import backend.api.gasmanager.response.GenericResponse;
import backend.api.gasmanager.service.abstraction.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper mapper;
    @Override
    public CustomerRegisterResponse addNewCustomer(CustomerModel request) {
        CustomerModel modelSaved = customerRepository.save(request);
        CustomerRegisterResponse response = new CustomerRegisterResponse(new GenericResponse("200", true), mapper.toDTO(modelSaved));
        return response;
    }
}
