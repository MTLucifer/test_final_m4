package service;

import model.Country;

public interface CountryService {
    Iterable<Country> findAll();

    Country findById(Long id);

    void save(Country country);

    void remove(Long id);
}
