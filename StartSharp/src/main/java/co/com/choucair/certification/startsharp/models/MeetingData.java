package co.com.choucair.certification.startsharp.models;

public class MeetingData {
    private String timeStart;
    private String timeEnd;
    private String reporter;
    private String number;
    private String name;
    private String organizedBy;
    private String location;
    private String type;
    private String attendeeList;
    private String attendeeType;
    private String attendeeStatus;

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizedBy() {
        return organizedBy;
    }

    public void setOrganizedBy(String organizedBy) {
        this.organizedBy = organizedBy;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAttendeeList() {
        return attendeeList;
    }

    public void setAttendeeList(String attendeeList) {
        this.attendeeList = attendeeList;
    }

    public String getAttendeeType() {
        return attendeeType;
    }

    public void setAttendeeType(String attendeeType) {
        this.attendeeType = attendeeType;
    }

    public String getAttendeeStatus() {
        return attendeeStatus;
    }

    public void setAttendeeStatus(String attendeeStatus) {
        this.attendeeStatus = attendeeStatus;
    }
}
