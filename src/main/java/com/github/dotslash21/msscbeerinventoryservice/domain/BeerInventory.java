package com.github.dotslash21.msscbeerinventoryservice.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class BeerInventory extends BaseEntity {

    @Builder
    public BeerInventory(
            UUID id,
            Long version,
            Timestamp createdDate,
            Timestamp lastModifiedDate,
            UUID beerId,
            String upc,
            Integer quantityOnHand) {

        super(id, version, createdDate, lastModifiedDate);
        this.beerId = beerId;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
    }

    private UUID beerId;
    private String upc;
    private Integer quantityOnHand = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BeerInventory that = (BeerInventory) o;
        return getId() != null && Objects.equals(getId(), that.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
