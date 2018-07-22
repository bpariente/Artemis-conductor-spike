package com.stratio.bawag.getentityworker.domain;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class GetEntityTest {

  public final GetEntity getEntity = new GetEntity();

  private static final String BAWAG_IBAN = "AT57 1600 0012 3456 7890";
  private static final String PSK_IBAN = "AT46 6000 0012 3456 7890";
  private static final String SPARDA_IBAN = "AT10 1000 0012 3456 7890";
  private static final String OTHER_IBAN = "AT09 1400 0012 3456 7890";
  private static final String INCORRECT_CHECKSUM_IBAN = "AT79 1400 0012 3456 7890";
  private static final String NOT_VALID_IBAN = "AT57 1600 0012 3456 789";

  @Test
  public void given_correctBawagIban_when_getEntity_return_bawagEntity(){
    Optional<String> result = getEntity.getEntity(BAWAG_IBAN);

    Assert.assertEquals(result.get(), "BAWAG");
  }

  @Test
  public void given_correctPskIban_when_getEntity_return_pskEntity(){
    Optional<String> result = getEntity.getEntity(PSK_IBAN);

    Assert.assertEquals(result.get(), "PSK");
  }

  @Test
  public void given_correctSardaIban_when_getEntity_return_SardaEntity(){
    Optional<String> result = getEntity.getEntity(SPARDA_IBAN);

    Assert.assertEquals(result.get(), "SPARDA");
  }

  @Test
  public void given_correctOtherIban_when_getEntity_return_OtherEntity(){
    Optional<String> result = getEntity.getEntity(OTHER_IBAN);

    Assert.assertEquals(result.get(), "EXTERNAL");
  }

  @Test
  public void given_IncorrrectIban_when_getEntity_return_EmptyOptional(){
    Optional<String> result = getEntity.getEntity(INCORRECT_CHECKSUM_IBAN);

    Assert.assertEquals(result, Optional.empty());
  }

  @Test
  public void given_NotValidIban_when_getEntity_return_EmptyOptional(){
    Optional<String> result = getEntity.getEntity(NOT_VALID_IBAN);

    Assert.assertEquals(result, Optional.empty());
  }

  @Test
  public void given_nullIban_when_getEntity_return_EmptyOptional(){
    Optional<String> result = getEntity.getEntity(null);

    Assert.assertEquals(result, Optional.empty());
  }
}
