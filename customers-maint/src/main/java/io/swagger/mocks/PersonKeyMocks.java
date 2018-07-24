package io.swagger.mocks;

import io.swagger.model.PersonKey;

public class PersonKeyMocks {

  private final static String  BAWAG_ENTITY = "16000";
  private final static String  SPARDA_ENTITY = "10000";
  private final static String  EXTERNAL_ENTITY = "0100";


  public static PersonKey getPersonKeyBawag(){
     return new PersonKey("00000001", BAWAG_ENTITY);
  }

  public static PersonKey getPersonKeySparda(){
    return new PersonKey("00000002", SPARDA_ENTITY);
  }

  public static PersonKey getPersonKeyExternal(){
    return new PersonKey("00000003", EXTERNAL_ENTITY);
  }
}
