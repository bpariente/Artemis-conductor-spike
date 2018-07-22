package com.stratio.bawag.getentityworker.domain;

import java.util.Optional;

public class GetEntity {

  public Optional<String> getEntity(String iban) {

    Optional<String> result = Optional.empty();
    if (IbanCalculations.isValidIBAN(iban)) {
      Optional<String> bankCode = Optional.ofNullable(IbanCalculations.extractAustrianBankCode(iban));
      result = Optional.ofNullable(EntityEnum.getEntityfromString(bankCode.get()).name());
    }
    return result;
  }
}
