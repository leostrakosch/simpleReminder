package de.leostrakosch.reminder.common;

import java.util.Date;

public class Task implements Comparable {

    private String name;
    private String description;
    private Date dueDate;
    private long id;

    protected Task(String name, String description, Date dueDate, long id) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.id = id;
    }

    protected Task(String name, Date dueDate, long id) {
        this.name = name;
        this.description = "";
        this.dueDate = dueDate;
        this.id = id;
    }

    public static Task create(String name, String description, Date dueDate, long id) {
        return new Task(name, description, dueDate, id);
    }

    public static Task create(String name, Date dueDate, long id) {
        return new Task(name, dueDate, id);
    }

    public final Date getDueDate() {
        return dueDate;
    }

    public final String getName() {
        return name;
    }

    public final String getDescription() {
        return description;
    }

    public final long getTaskID() {
        return id;
    }

    @Override
    public int compareTo(Object obj) {
        Task task;
        long difference;
        
        if (!(obj instanceof Task)) {
            throw new AssertionError("Task not compareable to " + obj);
        }
        
        task = (Task) obj;
        
        difference = this.id - task.id;

        if (difference > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;

        } else if (difference < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;

        } else {
            return (int) difference;
        }
    }
}
