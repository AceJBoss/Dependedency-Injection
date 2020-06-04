package com.jboss.dependencyinjectiondemo;

import org.springframework.stereotype.Component;

@Component
public class Technologies {
    private int id;
    private String techName;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public void tech(){
        System.out.println("Completed");
    }


}
