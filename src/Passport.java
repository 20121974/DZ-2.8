import java.util.HashMap;
import java.util.Map;

public class Passport {
    private String passportNumber;
    private String surname;//фамилия
    private String name;
    private String middleName;//отчество
    private String dateOfBirth;//дата рождения
    private static Map<String, Passport> passportMap = new HashMap<>();

    public Passport(Map<String, Passport> passportMap) {
        this.passportMap = passportMap;
    }

    public static Passport getPassportMap() {
        return (Passport) Passport.passportMap;
    }
    public void addPassport(){
        getPassportMap().put(passportMap.getOrDefault(getPassportNumber(), Passport.getPassportMap()));
    }

    private void put(Passport orDefault) {
    }

    public Object getPassportNumber() {
        return passportNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }
}
