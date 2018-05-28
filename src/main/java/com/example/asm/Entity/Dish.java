package com.example.asm.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Dish {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    private String id;
    private String name;
    private String category;
    private String description;
    private String img;
    private long price;
    private long startDate;
    private long updateDate;
    private int flgstatus;

    public Dish() {
    }

    public Dish(String name, String category, String description, String img, long price, long startDate, long updateDate, int flgstatus) {
        this.name = name;
        this.category = category;
        this.description = description;
        this.img = img;
        this.price = price;
        this.startDate = startDate;
        this.updateDate = updateDate;
        this.flgstatus = flgstatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getStartDate() {
        return startDate;
    }

    public void setStartDate(long startDate) {
        this.startDate = startDate;
    }

    public long getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(long updateDate) {
        this.updateDate = updateDate;
    }

    public int getFlgstatus() {
        return flgstatus;
    }

    public void setFlgstatus(int flgstatus) {
        this.flgstatus = flgstatus;
    }
}
