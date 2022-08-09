package com.scaler.todo_withdb.tasks;

import org.springframework.lang.Nullable;

import java.util.Date;

public interface ITaskData {
    @Nullable
    Long getId();
    @Nullable
    String getName();
    @Nullable
    Date getDueDate();
    @Nullable
    Boolean getDone();
}
