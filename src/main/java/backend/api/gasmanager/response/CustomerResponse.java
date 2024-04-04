package backend.api.gasmanager.response;

import backend.api.gasmanager.model.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class CustomerResponse {
    GenericResponse response;
    CustomerDTO data;
    List<CustomerDTO> listData;

    public CustomerResponse(GenericResponse response, CustomerDTO data) {
        this.response = response;
        this.data = data;
    }

    public CustomerResponse(GenericResponse response, List<CustomerDTO> listData) {
        this.response = response;
        this.listData = listData;
    }

    public CustomerResponse(GenericResponse response) {
        this.response = response;
    }
}
