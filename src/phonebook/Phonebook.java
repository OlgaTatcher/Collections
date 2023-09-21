package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook  {
    private List<PhonebookRecord> contactInfo;

    public Phonebook() {
        contactInfo =new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Contact: " + contactInfo;
    }

    public void add(PhonebookRecord phonebookRecord){
        contactInfo.add(phonebookRecord);
    }
    public PhonebookRecord find(String name){
        for (PhonebookRecord phonebookRecord : contactInfo) {
            if (phonebookRecord.getName().equals(name)){
                return phonebookRecord;
            }
            
        }
        return null;
    }


    public List<PhonebookRecord>  findInfo(String name) {
        List<PhonebookRecord> contact = new ArrayList<>();
        for (PhonebookRecord phonebookRecord : contactInfo){
        if (phonebookRecord.getName().equalsIgnoreCase(name))contact.add(phonebookRecord);
            }
        if (contact.isEmpty())return null;

        return contact;
    }


}







