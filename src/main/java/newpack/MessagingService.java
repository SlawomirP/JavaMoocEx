package newpack;

import java.util.ArrayList;
import java.util.Objects;

public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService(){
        this.messages = new ArrayList<>();
    }

    public void add (Message message){
        if ((message.getSender().length() + message.getContent().length()) <= 280){
           this.messages.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return this.messages;
    }
}
