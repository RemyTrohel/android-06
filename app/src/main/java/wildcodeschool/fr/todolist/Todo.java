package wildcodeschool.fr.todolist;

import java.util.Date;

public class Todo {
    private String description;
    private Date date;

    public Todo(String desription, Date date) {
        this.description = desription;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
