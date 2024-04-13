import java.time.LocalDateTime;
public class PersonController {
    private Person model;
    private PersonView view;

    public PersonController(Person model, PersonView view) {
        this.model = model;
        this.view = view;
    }

    public boolean login(String userName, String password) {
        if (userName.equals(model.getUserName()) && password.equals(model.getPassword())) {
            model.setLastSeen(LocalDateTime.now());
            return true;
        }
        return false;
    }

    public void updateView() {
        view.displayPerson(model);
    }

    public void setModel(Person model) {
        this.model = model;
    }

    public void setView(PersonView view) {
        this.view = view;
    }
}