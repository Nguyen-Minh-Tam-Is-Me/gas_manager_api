package backend.api.gasmanager.model.mapper;

import backend.api.gasmanager.model.CustomerModel;
import backend.api.gasmanager.model.dto.CustomerDTO;
import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {
    public CustomerDTO toDTO(CustomerModel model){
        CustomerDTO dto = CustomerDTO.builder()
                .id(model.getId())
                .name(model.getName())
                .phone(model.getPhone())
                .isMen(model.isMen())
                .address(model.getAddress())
                .avatar(model.getAvatar())
                .build();
        return dto;
    }
    public CustomerModel toModel(CustomerDTO dto){
        if(dto.getAvatar() == null){
            CustomerModel model = CustomerModel.builder()
                    .id(dto.getId())
                    .address(dto.getAddress())
                    .name(dto.getName())
                    .isMen(dto.isMen())
                    .phone(dto.getPhone())
                    .build();
            return model;
        }
        else{
            CustomerModel model = CustomerModel.builder()
                    .id(dto.getId())
                    .address(dto.getAddress())
                    .name(dto.getName())
                    .isMen(dto.isMen())
                    .avatar(dto.getAvatar())
                    .phone(dto.getPhone())
                    .build();
            return model;
        }
    }
}
