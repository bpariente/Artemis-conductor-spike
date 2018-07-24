package io.swagger.mocks;

import io.swagger.model.SearchCustomerDataResponse;

public class SearchCustomerDataResponseMocks {

    public static SearchCustomerDataResponse getSearchCustomerDataOnlyExternal(){
      SearchCustomerDataResponse searchCustomerDataResponse = new SearchCustomerDataResponse(
          "currentDate",   "userId", "time");
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoExternalBatangas());
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoExternalLipa());
      return searchCustomerDataResponse;
    }

    public static SearchCustomerDataResponse getSearchCustomerDataOnlyBawag(){
      SearchCustomerDataResponse searchCustomerDataResponse = new SearchCustomerDataResponse(
          "currentDate",   "userId", "time");
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoBawagBatangas());
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoBawagLipa());
      return searchCustomerDataResponse;
    }

    public static SearchCustomerDataResponse getSearchCustomerDataOnlySparda(){
      SearchCustomerDataResponse searchCustomerDataResponse = new SearchCustomerDataResponse(
          "currentDate",   "userId", "time");
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoSpardaBatangas());
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoSpardaLipa());
      return searchCustomerDataResponse;
    }

    public static SearchCustomerDataResponse getSearchCustomerDataMix(){
      SearchCustomerDataResponse searchCustomerDataResponse = new SearchCustomerDataResponse(
          "currentDate",   "userId", "time");
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoSpardaBatangas());
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoBawagBatangas());
      searchCustomerDataResponse.addPersonsItem(PersonShortInfoMocks.getPersonShortInfoExternalLipa());
      return searchCustomerDataResponse;
    }
}
