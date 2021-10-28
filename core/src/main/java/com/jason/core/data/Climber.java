package com.jason.core.data;

//import javax.persistence.*;

//@Entity
//@Table(name = "climber_profile")
public class Climber {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private int id;
//    @Column(name = "name")
    private String name;
//    @Column(name = "points")
    private int points;


    public Climber(int id, String name, int points){
        this.id = id;
        this.name = name;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
