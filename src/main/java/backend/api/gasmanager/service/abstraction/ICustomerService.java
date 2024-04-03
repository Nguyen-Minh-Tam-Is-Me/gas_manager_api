package backend.api.gasmanager.service.abstraction;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.model.dto.CustomerDTO;
import backend.api.gasmanager.response.CustomerRegisterResponse;

public interface ICustomerService {
    CustomerRegisterResponse addNewCustomer(CustomerModel request);
}
