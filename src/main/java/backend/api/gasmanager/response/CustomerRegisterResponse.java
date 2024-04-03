package backend.api.gasmanager.response;

import backend.api.gasmanager.model.dto.CustomerDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CustomerRegisterResponse {
    GenericResponse response;
    CustomerDTO data;
}
