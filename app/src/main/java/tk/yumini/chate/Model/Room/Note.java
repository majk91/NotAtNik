package tk.yumini.chate.Model.Room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "note_table")
public class Note {

    @PrimaryKey(autoGenerate = true)
    public Integer id;

    private String title;

    private String desc;

    //@ColumnInfo(name="pr_column")//custom column name
    private int priority;


    public Note(String title, String desc, int priority) {
        this.title = title;
        this.desc = desc;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getDesc() {
        return desc;
    }
    public int getPriority() {
        return priority;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
}
