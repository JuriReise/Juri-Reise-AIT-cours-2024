package homework_22.address.address_appl;

public class Address {
    private static final int POSTCODE_LENGTH = 5;
    private String street;
    private int number;
    private String postCode;
    private String city;

    public Address(String street, int number, String postCode, String city) {
        setPostCode(postCode);
        this.number = number;
        this.street = street;
        setCity(city);
    }

    @Override
    public String toString() {
        return  "---------------------------------\n" +
                street + " " + number + "\n" +
                postCode + " " + city + "\n";
    }

    private void setCity(String city) {
        if (isCityValid(city)){
            this.city = city;
        } else  {
            System.out.println("City has wrong format");
        }
    }

    private boolean isCityValid(String city) {
        for (int i = 0; i < city.length(); i++) {
            char c = city.charAt(i);
            if(!Character.isAlphabetic(c)){
                return false;
            }
        }
        return true;
    }

    private void setPostCode(String postCode) {
        if (isPostCodeValid(postCode)) {
            this.postCode = postCode;
        } else {
            System.out.println("Post code is incorrect!");
        }
    }

    private boolean isPostCodeValid(String postCode) {
        if (postCode.length() == POSTCODE_LENGTH) {
            for (int i = 0; i < postCode.length(); i++) {
                char c = postCode.charAt(i);
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
