//package net.engineeringdigest.journalApp.controller;
//
//import net.engineeringdigest.journalApp.entity.JournalEntry;
//import org.bson.types.ObjectId;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("journal")
//public class JournalEntryController {
//
//      Map<ObjectId, JournalEntry> journalEntries = new HashMap<>();
//    //all the methods inside controller should ba public so that
//
//
//@GetMapping
//    public List<JournalEntry> getJournalEntries() {
//        return new ArrayList<>(journalEntries.values());
//
//    }
//
//    @GetMapping("/id/{myId}")
//public JournalEntry getJournalEntryById(@PathVariable long myId) {
//    return journalEntries.get(myId);
//}
//
//    @PostMapping
//    public boolean createEntry(@RequestBody JournalEntry myEntry){
// journalEntries.put(myEntry.getId(),myEntry);
//        System.out.println("hiiii");
//return true;
//    }
//
//    @DeleteMapping("id/{myId}")
//    public JournalEntry deleteEntry(@PathVariable long myId){
//    return journalEntries.remove(myId);
//    }
//
//    @PutMapping("/id/{myId}")
//    public JournalEntry updateJournalEntry(@PathVariable ObjectId myId, @RequestBody JournalEntry myEntry){
//    return journalEntries.put(myId,myEntry);
//
//    }
//}
