package net.engineeringdigest.journalApp.service;


import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {

    @Autowired
private JournalEntryRepository journalEntryRepository;
    @Autowired
    private UserService userService;

    public void saveEntry(JournalEntry journalEntry, String userName){

        User userFromDb=userService.findByUsername(userName);//give user from db
        JournalEntry saved = journalEntryRepository.save(journalEntry);//save journal entry in db and kept in local variable
        userFromDb.getJournalEntries().add(saved);//now user which we get so we saved journal entry added
        userService.saveEntry(userFromDb);//then saved in the user in db with new journa entry

    }
    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }
    public Optional<JournalEntry> getEntryById(ObjectId id){
        return journalEntryRepository.findById(id);
    }
    public void deleteById(ObjectId id){
        journalEntryRepository.deleteById(id);
    }
//   public JournalEntry updateEntry(ObjectId id, JournalEntry journalEntry){
//       journalEntryRepository.
//  }


}
