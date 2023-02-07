package peaksoft.repository;

import peaksoft.entity.Country;

public interface CountryRepo {

    void saveCountry(Country country);
    String saveAllCountry(Country country);
    void getAllByCountry();
    void findCountryById();
    String removeCountryById();
    void removeAllByCountry();
    String updateCountry();




}
