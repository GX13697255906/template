package helper;

public class QrtzCronTriggers {

    private String schedName;

    private String triggerName;

    private String triggerGroup;

    private String coneExpression;

    private String timeZoneId;

    public QrtzCronTriggers(String schedName, String triggerName, String triggerGroup, String coneExpression, String timeZoneId) {
        this.schedName = schedName;
        this.triggerName = triggerName;
        this.triggerGroup = triggerGroup;
        this.coneExpression = coneExpression;
        this.timeZoneId = timeZoneId;
    }

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public String getConeExpression() {
        return coneExpression;
    }

    public void setConeExpression(String coneExpression) {
        this.coneExpression = coneExpression;
    }

    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }
}
