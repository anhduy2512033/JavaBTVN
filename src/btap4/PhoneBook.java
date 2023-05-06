package btap4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class  PhoneBook extends Phone {
    private List<PhoneNumber> phoneList;

    public PhoneBook() {
        phoneList = new ArrayList<>();
    }

    @Override
    public void insertPhone(String name, String phone) {
        PhoneNumber phoneNumber = findPhoneNumberByName(name);
        if (phoneNumber != null) {
            List<String> phones = phoneNumber.getPhone();
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
        } else {
            PhoneNumber newPhoneNumber = new PhoneNumber(name, new ArrayList<String>());
            newPhoneNumber.getPhone().add(phone);
            phoneList.add(newPhoneNumber);
        }
    }

    @Override
    public void removePhone(String name) {
        PhoneNumber phoneNumber = findPhoneNumberByName(name);
        if (phoneNumber != null) {
            phoneList.remove(phoneNumber);
        }
    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        PhoneNumber phoneNumber = findPhoneNumberByName(name);
        if (phoneNumber != null) {
            List<String> phones = phoneNumber.getPhone();
            if (phones.contains(oldPhone)) {
                phones.set(phones.indexOf(oldPhone), newPhone);
            }
        }
    }

    @Override
    public PhoneNumber searchPhone(String name) {
        return findPhoneNumberByName(name);
    }

    @Override
    public void sort() {
        Collections.sort(phoneList, Comparator.comparing(PhoneNumber::getName));
    }

    private PhoneNumber findPhoneNumberByName(String name) {
        for (PhoneNumber phoneNumber : phoneList) {
            if (phoneNumber.getName().equals(name)) {
                return phoneNumber;
            }
        }
        return null;
    }
}

