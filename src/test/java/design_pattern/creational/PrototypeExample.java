package design_pattern.creational;

import creational.prototype.Attachment;
import creational.prototype.DeepCopyReportPrototype;
import creational.prototype.ShallowCopyReportPrototype;
import org.junit.Test;

public class PrototypeExample {
    @Test
    public void test() throws CloneNotSupportedException {
        Attachment attachment = new Attachment();
        attachment.setContent("abc");
        DeepCopyReportPrototype deepCopyReportPrototype = new DeepCopyReportPrototype();
        deepCopyReportPrototype.setAttachment(attachment);
        DeepCopyReportPrototype cloneDeepCopy = deepCopyReportPrototype.clone();
        ShallowCopyReportPrototype shallowCopyReportPrototype = new ShallowCopyReportPrototype();
        shallowCopyReportPrototype.setAttachment(attachment);
        ShallowCopyReportPrototype cloneShallowCopy = shallowCopyReportPrototype.clone();
        System.out.println(cloneDeepCopy == deepCopyReportPrototype);
        System.out.println(cloneDeepCopy.getAttachment() == deepCopyReportPrototype.getAttachment());
        System.out.println(cloneShallowCopy == shallowCopyReportPrototype);
        System.out.println(cloneShallowCopy.getAttachment() == shallowCopyReportPrototype.getAttachment());
    }
}
