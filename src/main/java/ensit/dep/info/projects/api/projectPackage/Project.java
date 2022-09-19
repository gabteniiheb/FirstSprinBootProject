package ensit.dep.info.projects.api.projectPackage;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table
public class Project {
@Id
    @SequenceGenerator(
            name="idSequence",
            sequenceName="idSequence",
            allocationSize=1)
 @GeneratedValue(strategy= GenerationType.SEQUENCE,
            generator="idSequence")

    Long id ;
    String Des;
    @Enumerated(EnumType.STRING)
    Type ProjectType;


    LocalDate date_begining;
    LocalDate date_finishing;

    Float Note_evaluation;
    Long groupeNumber;


    public Project() {
    }

    public Project(Long id, String des, LocalDate date_begining, LocalDate date_finishing, Long groupeNumber, Float note_evaluation, Type projectType) {
        this.id = id;
        Des = des;
        this.date_begining = date_begining;
        this.date_finishing = date_finishing;
        this.groupeNumber = groupeNumber;
        Note_evaluation = note_evaluation;
        ProjectType = projectType;
    }

    public Project(String des, LocalDate date_begining, LocalDate date_finishing, Long groupeNumber, Float note_evaluation, Type projectType) {
        Des = des;
        this.date_begining = date_begining;
        this.date_finishing = date_finishing;
        this.groupeNumber = groupeNumber;
        Note_evaluation = note_evaluation;
        ProjectType = projectType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

    public LocalDate getDate_begining() {
        return date_begining;
    }

    public void setDate_begining(LocalDate date_begining) {
        this.date_begining = date_begining;
    }

    public LocalDate getDate_finishing() {
        return date_finishing;
    }

    public void setDate_finishing(LocalDate date_finishing) {
        this.date_finishing = date_finishing;
    }

    public Long getGroupeNumber() {
        return groupeNumber;
    }

    public void setGroupeNumber(Long groupeNumber) {
        this.groupeNumber = groupeNumber;
    }

    public Float getNote_evaluation() {
        return Note_evaluation;
    }

    public void setNote_evaluation(Float note_evaluation) {
        Note_evaluation = note_evaluation;
    }

    public Type getProjectType() {
        return ProjectType;
    }

    public void setProjectType(Type projectType) {
        ProjectType = projectType;
    }
}
