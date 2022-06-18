package za.ac.cput.factory;
/*
        Student: Darryll Merkeur (220253595)
        Date: 18 June 2022
*/

import za.ac.cput.domain.Country;
import za.ac.cput.util.Helper;

public class CountryFactory {
    public static Country build(String countryId, String countryName){
        if (countryId==null|| countryId.isEmpty())
            throw new IllegalArgumentException("countryId is needed here!");
        if (countryName== null|| countryName.isEmpty())
            throw new IllegalArgumentException("countryName is needed here!");
        return new Country.Builder().countryId(countryId).countryName(countryName).build();
    }

    public static Country.CountryId build(Country country) {
        return new Country.CountryId(country.getCountryId());
    }

    public static Country bi(String countryId, String countryName) {
        if (Helper.isNullorEmpty(countryId) || Helper.isNullorEmpty(countryName))
            return null;
        return null;
        }

}

