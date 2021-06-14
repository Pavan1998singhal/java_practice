package com.crudwithjpa.apiwithjpa.model;

import javax.persistence.*;

@Entity
@Table(name = "TBM_WCMaster", schema = "dbo")
public class wcMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "WCId", nullable = false)
    private Integer id;

    public wcMaster() {
    }

    @Column(name = "WCName", nullable = false)
    private String name;

    @Column(name = "WCArea", nullable = false)
    private Integer area;

    public Integer getId() {
        return id;
    }

    public wcMaster(Integer id, String name, Integer area) {
        this.id = id;
        this.name = name;
        this.area = area;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "wcMaster [area=" + area + ", id=" + id + ", name=" + name + "]";
    }

}
