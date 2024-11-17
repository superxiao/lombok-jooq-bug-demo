/*
 * This file is generated by jOOQ.
 */
package generated.udt.paths;


import javax.annotation.processing.Generated;

import org.jooq.Binding;
import org.jooq.Comment;
import org.jooq.DataType;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.RecordQualifier;
import org.jooq.UDTField;
import generated.udt.Task;
import generated.udt.records.TaskRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.UDTPathTableFieldImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.19.15",
        "schema version:1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TaskPath<R extends Record, T> extends UDTPathTableFieldImpl<R, TaskRecord, T> {

    private static final long serialVersionUID = 1L;

    /**
     * The attribute <code>public.task.id</code>.
     */
    public final UDTField<TaskRecord, Integer> ID = Internal.createUDTPathField(DSL.name("id"), SQLDataType.INTEGER, this, "", UDTField.class);

    /**
     * The attribute <code>public.task.name</code>.
     */
    public final UDTField<TaskRecord, String> NAME = Internal.createUDTPathField(DSL.name("name"), SQLDataType.CLOB, this, "", UDTField.class);

    /**
     * The attribute <code>public.task.completed</code>.
     */
    public final UDTField<TaskRecord, Boolean> COMPLETED = Internal.createUDTPathField(DSL.name("completed"), SQLDataType.BOOLEAN, this, "", UDTField.class);

    public TaskPath(Name name, DataType<T> type, RecordQualifier<R> qualifier, Comment comment, Binding<?, T> binding) {
        super(name, type, qualifier, Task.TASK, comment, binding);
    }
}