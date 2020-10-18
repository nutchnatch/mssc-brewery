package guru.springframework.msscbrewery.web.mappers;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper
public interface BeenMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtpToBeer(BeerDto beerDto);
}
