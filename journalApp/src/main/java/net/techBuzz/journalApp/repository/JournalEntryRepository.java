package net.techBuzz.journalApp.repository;

import net.techBuzz.journalApp.entity.JournalEntry;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry,String> {
}
