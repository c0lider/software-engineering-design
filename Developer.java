import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Developer {
    private String name;
    private Date birthDate;
    private List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();
    private boolean isEmployed;
    private ProgrammingLanguage favoriteProgrammingLanguage;

    public Developer(String name) {
        this.setName(name);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if (birthDate != null) {
            this.birthDate = birthDate;
        } else {
            throw new IllegalArgumentException("Birth date cannot be null");
        }
    }

    public List<ProgrammingLanguage> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void addProgrammingLanguage(ProgrammingLanguage lang) {
        if (!this.programmingLanguages.contains(lang)) {
            this.programmingLanguages.add(programmingLanguages);
        }
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public ProgrammingLanguage getFavoriteProgrammingLanguage() {
        return favoriteProgrammingLanguage;
    }

    public void setFavoriteProgrammingLanguage(ProgrammingLanguage favoriteProgrammingLanguage) {
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }
}