package behavior.mediator;

public class PhotoComponent extends Component {
    private String photo;

    public PhotoComponent(Mediator mediator, String userId) {
        super(mediator, userId);
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
