package com.scaler.todo_withdb.tasks;

import com.scaler.todo_withdb.common.BaseEntity;
import com.scaler.todo_withdb.notes.NoteEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity(name = "tasks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
<<<<<<< HEAD
public class TaskEntity extends BaseEntity implements ITaskData {
    @Column(name="name", nullable = false)
=======
public class TaskEntity extends BaseEntity {
    @Column(name = "name", nullable = false)
>>>>>>> 837c8b2b4abe219460ae4ee151a14edcbfed645c
    String name;

    @Column(name = "due_date", nullable = false)
    Date dueDate;

    @Column(name = "done", nullable = false, columnDefinition = "boolean default false")
    Boolean done;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL)
    @ToString.Exclude
    List<NoteEntity> notes;

    public void setNotes(List<NoteEntity> notes) {
        this.notes = notes;
    }

}
