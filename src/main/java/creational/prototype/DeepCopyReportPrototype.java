package creational.prototype;

import java.io.*;

public class DeepCopyReportPrototype implements ReportPrototype, Serializable {

    private static final long serialVersionUID = -4241288382469341686L;
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

    //Deep copy
    @Override
    protected DeepCopyReportPrototype clone() throws CloneNotSupportedException {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (DeepCopyReportPrototype) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new CloneNotSupportedException();
        }
    }
}
