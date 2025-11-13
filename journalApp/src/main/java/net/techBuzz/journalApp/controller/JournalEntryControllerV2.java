package net.techBuzz.journalApp.controller;

import net.techBuzz.journalApp.entity.JournalEntry;
import net.techBuzz.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2 {

    @Autowired
    public JournalEntryService journalEntryService;
    private Map<Long, JournalEntry> journalEntries = new HashMap<>();

    @GetMapping("/get")
        public List<JournalEntry> getAll(){
        return journalEntryService.getAll();

    }
    @PostMapping()
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryService.saveEntry(myEntry);
        return true;
    }

    @GetMapping("/id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable Long myId){
        return journalEntries.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){
        return journalEntries.remove(myId);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry myEntry ){
        return journalEntries.put(id,myEntry);
    }

}
