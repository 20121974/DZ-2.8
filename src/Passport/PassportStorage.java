package Passport;

import java.util.HashMap;
import java.util.Map;

public class PassportStorage{//хранилище паспортов
    private static Map<String, PassportStorage> passportStorageMap= new HashMap<>();

    public PassportStorage(Map<String, PassportStorage> passportMap) {
        this.passportStorageMap = passportStorageMap;
    }

    public static Map<String, PassportStorage> getPassportStorageMap() {
        return passportStorageMap;
    }

    public void addPassport(PassportStorage PassportStorage){
        getPassportStorageMap().put(passportStorageMap.toString(), PassportStorage);
    }

}

