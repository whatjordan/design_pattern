package creational.prototype;

public class ShallowCopyReportPrototype implements ReportPrototype {

    private String message;
    private Attachment attachment;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    //Shallow copy
    @Override
    public ShallowCopyReportPrototype clone() throws CloneNotSupportedException {
        return (ShallowCopyReportPrototype) super.clone();
    }
}
