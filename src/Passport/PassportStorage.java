package Passport;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PassportStorage{//хранилище паспортов
    private Map<String, Passport> passportMap= new HashMap<>();

    public PassportStorage(Map<String, Passport> passportMap) {
        this.passportMap = passportMap;
    }

    public Map<String, Passport> getPassportMap() {
        return passportMap;
    }

    public void addPassport(Passport passport){
        getPassportMap().put(passportMap.toString(), passport);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassportStorage that = (PassportStorage) o;
        return passportMap.equals(that.passportMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportMap);
    }
}

