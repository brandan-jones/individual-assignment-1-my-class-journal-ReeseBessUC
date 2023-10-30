package edu.uc.cech.soit.myclassjournal.service;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class MyClassJournalImplementation implements IJournalService {
    private List<JournalEntry> entries = new ArrayList<>();

    @Override
    public void save(JournalEntry journalEntry) {
        entries.add(journalEntry);
    }

    @Override
    public List<JournalEntry> fetchAll() {
        return entries;
    }
}