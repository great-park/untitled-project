package park.waiting.domain.store.entity;

import lombok.*;
import park.waiting.common.entity.BaseEntity;
import park.waiting.domain.store.dto.StoreResponse;
import park.waiting.domain.store.status.OpenStatus;

import javax.persistence.Entity;

@Data
@Setter(AccessLevel.NONE)
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Store  extends BaseEntity {

    private String name;

    private String phoneNumber;

    private OpenStatus openStatus;

    private String openHours;

    private String address;

    public StoreResponse toResponse() {
        return StoreResponse.builder()
                .storeId(getId())
                .name(name)
                .phoneNumber(phoneNumber)
                .openStatus(String.valueOf(openStatus))
                .openHours(openHours)
                .address(address)
                .build();
    }

}
