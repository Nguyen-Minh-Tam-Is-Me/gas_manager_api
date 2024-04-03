package backend.api.gasmanager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTO {
    private UUID id;
    private String name;
    private String phone;
    private String address;
    private boolean isMen;
    private String avatar;

}
