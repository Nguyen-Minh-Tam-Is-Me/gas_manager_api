package backend.api.gasmanager.service.abstraction;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.response.CustomerResponse;

public interface ICustomerService {
    CustomerResponse addNewCustomer(CustomerModel request);
    CustomerResponse getAllCustomer();
}
