package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook  {
    private List<PhonebookEntry> contactInfo;

    public Phonebook() {
        contactInfo =new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Contact: " + contactInfo;
    }

    public void add(PhonebookEntry phonebookEntry){
        contactInfo.add(phonebookEntry);
    }
    public PhonebookEntry find(String name){
        for (PhonebookEntry phonebookEntry: contactInfo) {
            if (phonebookEntry.getName().equals(name)){
                return phonebookEntry;
            }
            
        }
        return null;
    }

    public List<PhonebookEntry>  findInfo(String name) {
        List<PhonebookEntry> contact = new ArrayList<>();
        for (PhonebookEntry phonebookEntry : contactInfo){
        if (phonebookEntry.getName().equalsIgnoreCase(name))contact.add(phonebookEntry);
            }
        if (contact.isEmpty())return null;

        return contact;
    }


}







