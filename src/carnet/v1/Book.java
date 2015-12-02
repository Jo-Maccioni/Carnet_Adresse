
package carnet.v1;

public class Book {

    private static final int CONTACTS_SIZE = 10;
    private int currentIndex; 
    private Contact[] contacts;
    
    public Book(){
        contacts = new Contact[CONTACTS_SIZE];
    }
    
    public void addContact(Contact contact){
        contacts[currentIndex++] = contact;
    }
    
    public void removeContact(int index){
        contacts[index] = null;
    }
    
    public Contact[] getContacts() {
    return contacts;
    }
    
    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }
    
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < CONTACTS_SIZE ; ++i ){
            if(contacts[i] instanceof Contact)
            builder.append(contacts[i]).append("\n");
        }
        return builder.toString();
    }
}
