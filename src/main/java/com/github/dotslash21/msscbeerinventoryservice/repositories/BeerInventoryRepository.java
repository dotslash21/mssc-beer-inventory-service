package com.github.dotslash21.msscbeerinventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.dotslash21.msscbeerinventoryservice.domain.BeerInventory;

import java.util.List;
import java.util.UUID;

public interface BeerInventoryRepository extends JpaRepository<BeerInventory, UUID> {

    List<BeerInventory> findAllByBeerId(UUID beerId);
}
