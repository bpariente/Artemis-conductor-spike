package io.swagger.mocks;

import io.swagger.model.PersonShortInfo;

public class PersonShortInfoMocks {

  private final static String lipaAddress = "Lipa, Batangas";
  private final static String batangasAddress = "Batangas, Lipa";

  public static PersonShortInfo getPersonShortInfoBawagLipa() {
    return new PersonShortInfo(PersonKeyMocks.getPersonKeyBawag(), "Smith", "N",
        lipaAddress, "Hints", "11111111", "66666", true);
  }

  public static PersonShortInfo getPersonShortInfoBawagBatangas() {
    return new PersonShortInfo(PersonKeyMocks.getPersonKeyBawag(), "Smith", "N",
        batangasAddress, "Hints", "22222222", "55555", true);
  }

  public static PersonShortInfo getPersonShortInfoSpardaLipa() {
    return new PersonShortInfo(PersonKeyMocks.getPersonKeySparda(), "Smith", "N",
        lipaAddress, "Hints", "3333333", "44444", true);
  }

  public static PersonShortInfo getPersonShortInfoSpardaBatangas() {
    return new PersonShortInfo(PersonKeyMocks.getPersonKeySparda(), "Smith", "N",
        batangasAddress, "Hints", "4444444", "33333", true);
  }

  public static PersonShortInfo getPersonShortInfoExternalLipa() {
    return new PersonShortInfo(PersonKeyMocks.getPersonKeyExternal(), "Smith", "N",
        lipaAddress, "Hints", "5555555", "22222", true);
  }

  public static PersonShortInfo getPersonShortInfoExternalBatangas() {
    return new PersonShortInfo(PersonKeyMocks.getPersonKeyExternal(), "Smith", "N",
        batangasAddress, "Hints", "666666666", "11111", true);
  }
}
