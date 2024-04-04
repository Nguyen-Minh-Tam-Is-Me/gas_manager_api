package backend.api.gasmanager.service.concretions;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.model.dto.CustomerDTO;
import backend.api.gasmanager.model.mapper.CustomerMapper;
import backend.api.gasmanager.repository.CustomerRepository;
import backend.api.gasmanager.response.CustomerResponse;
import backend.api.gasmanager.response.GenericResponse;
import backend.api.gasmanager.service.abstraction.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerMapper mapper;
    @Override
    public CustomerResponse addNewCustomer(CustomerModel request) {
        try{
            CustomerModel modelSaved = customerRepository.save(request);
            CustomerResponse response = new CustomerResponse(new GenericResponse("200", true), mapper.toDTO(modelSaved));
            return response;
        }catch (RuntimeException e){
            throw new RuntimeException(e.getCause());
        }

    }

    @Override
    public CustomerResponse getAllCustomer() {
        try{
            List<CustomerDTO> model = customerRepository.getAll();
            if(model.size()<1){
                throw new RuntimeException();
            }
            CustomerResponse response = new CustomerResponse(new GenericResponse("200", true), model);
            return response;
        }catch (RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }

    }
}
