package Model;

import java.util.Date;

public class Report implements Comparable<Report> {
    private String type;
    private String title;
    private String description;
    private String contact;
    private int urgency;
    private int severity;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Date date;

    @Override
    public int compareTo(Report o) {
        int c;
        if ((c = Integer.compare(urgency, o.urgency)) == 0) {
            if ((c = Integer.compare(severity, o.severity)) == 0) {
                return date.compareTo(o.date);
            }
        }
        return c;
    }

    @Override
    public String toString() {
        return "Report{" +
                "type='" + type + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", contact='" + contact + '\'' +
                ", urgency=" + urgency +
                ", severity=" + severity +
                ", date=" + date +
                '}';
    }
}