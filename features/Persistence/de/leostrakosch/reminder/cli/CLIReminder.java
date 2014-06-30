package de.leostrakosch.reminder.cli;

import java.io.IOException;
import java.util.List;

import de.leostrakosch.reminder.persistence.DataManager;

public class CLIReminder {
  
  private DataManager manager = DataManager.getInstance();
  
  @Override
  public List getTasks() {
    return manager.getTasks();
  }
  
  private boolean commit(List tasks) {
    try {
      manager.save(tasks);
      
    } catch (IOException e) {
      error("Error while committing: " + e.getMessage() +"\nContinuing with commit.");
      original(tasks);
      return false;
    }
    
    return original(tasks);
  }
}