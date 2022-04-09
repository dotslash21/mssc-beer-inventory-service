package com.github.dotslash21.msscbeerinventoryservice.web.mappers;

import org.mapstruct.Mapper;
import com.github.dotslash21.msscbeerinventoryservice.domain.BeerInventory;
import com.github.dotslash21.msscbeerinventoryservice.web.model.BeerInventoryDto;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
