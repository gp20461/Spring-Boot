package net.techBuzz.journalApp.service;

import net.techBuzz.journalApp.entity.JournalEntry;
import net.techBuzz.journalApp.repository.JournalEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JournalEntryService {

@Autowired
public JournalEntryRepository journalEntryRepository;


public void saveEntry(JournalEntry journalEntry){
    journalEntryRepository.save(journalEntry);
}

public List<JournalEntry> getAll(){
    return journalEntryRepository.findAll();
}

}
