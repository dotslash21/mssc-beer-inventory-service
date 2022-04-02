package xyz.arunangshu.msscbeerinventoryservice.web.mappers;

import org.mapstruct.Mapper;
import xyz.arunangshu.msscbeerinventoryservice.domain.BeerInventory;
import xyz.arunangshu.msscbeerinventoryservice.web.model.BeerInventoryDto;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
