package Passport;

public class Passport {
    private static String passportNumber;
    private String surname;//фамилия
    private String name;
    private String middleName;//отчество
    private String dateOfBirth;//дата рождения


    private void put(Passport orDefault) {
    }

    public static Object getPassportNumber() {
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
