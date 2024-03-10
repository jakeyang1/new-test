package prj.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stock") //和Stock数据表关联
public class Stock {
	@Id //通过@Id定义主键
	private int ID;
    @Column(name = "name")
	private String name;
	@Column(name = "num")
	private int num;

    @Column(name = "description")
	private String description;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getDescription() {
        return description;
    }
}

