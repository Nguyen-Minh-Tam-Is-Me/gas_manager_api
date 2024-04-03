package backend.api.gasmanager.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class GenericResponse {
    private String code;
    private boolean success;
}
