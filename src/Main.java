import phonebook.Phonebook;
import phonebook.PhonebookRecord;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Phonebook ContactList= new Phonebook();
        ContactList.add(new PhonebookRecord("Joe","+212 3596 655"));
        ContactList.add(new PhonebookRecord("Joe","+212 3596 752"));
        ContactList.add(new PhonebookRecord("Phoebe","+212 3689 620"));
        ContactList.add(new PhonebookRecord("Phoebe","+212 2563 235"));
        ContactList.add(new PhonebookRecord("Ross","+332 3674 123"));
        ContactList.add(new PhonebookRecord("Monica","+332 7532 012"));
        ContactList.add(new PhonebookRecord("Rachel","+347 9852 741"));
        ContactList.add(new PhonebookRecord("Rachel","+347 388 700"));


        System.out.println(ContactList);

        PhonebookRecord foundContact=ContactList.find("Monica");
        if(foundContact!=null){
            System.out.println("Found contact: "+foundContact.getName()+" "+foundContact.getPhone());
        }else{
            System.out.println("I can't find the contact");
        }


        List<PhonebookRecord> findAllInfo=ContactList.findInfo("Phoebe");
        if(findAllInfo!=null){
            for (PhonebookRecord phonebookRecord : findAllInfo) {
                System.out.println("Found contact: "+ phonebookRecord.getName()+" "+ phonebookRecord.getPhone());
            }
        }else{
            System.out.println("I can't find the contact");
        }

    }

    public static int countOccurance(List<String>words,String target) {
        int count=0;
        for (String word:words) {
            if (word.equals(target))count++;
        }
        return count;
    }
    public static List<String>toList(String[]words){
        return Arrays.asList(words);
    }

    public static List<Integer>findUnique(List<Integer>numbers){
        List<Integer>unique=new ArrayList<>();
        for (Integer number : numbers) {
            if (!unique.contains(number))unique.add(number);
        }
        return unique;
    }
    public static void calcOccurance(List<String>words){
        List<String>collector=new ArrayList<>();
        for (String word : words) {
            if (collector.contains(word))continue;
            int counter=0;
            for (String w : words) {
                if(w.equals(words))counter++;
            }
            System.out.println(word+": "+counter);
            collector.add(word);
        }
    }
    public static List<String> findOccurance(List<String>words){
        List<String>result=new ArrayList<>();
        List<String>collect=new ArrayList<>();

        for (String word : words) {
            if (collect.contains(word))continue;
            int counter=0;
            for (String w : words) {
                if(w.equals(words))counter++;
            }
            result.add("name"+"\""+word+"\""+"occurance: "+counter);
            collect.add(word);
        }
        return result;
    }

    

}





