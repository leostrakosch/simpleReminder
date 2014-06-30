package de.leostrakosch.reminder.format;

import de.leostrakosch.reminder.common.Task;
import de.leostrakosch.reminder.common.IllegalLineFormatException;

/**
 * Created by leo on 05.06.14.
 */
public interface TaskFormat {
  String getString(Task t);

  Task getTask(String s) throws IllegalLineFormatException;
}