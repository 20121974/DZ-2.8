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
        getPassportMap().put(passport.getPassportNumber(), passport);
    }
    public String passportSearchByNumber(String passportNumber) {
        passportMap.get(passportMap);
        return String.valueOf(passportMap);
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
    public static void main(String[] args) {
        Map<String, Integer> getPassportMap = new HashMap<>();
        getPassportMap.put("4554", 455113);
        getPassportMap.put("4553", 455114);
        getPassportMap.put("4552", 455115);
        System.out.println(getPassportMap.get("4554"));
        System.out.println(getPassportMap.get("4553"));
        System.out.println(getPassportMap.get("4552"));
    }
}

