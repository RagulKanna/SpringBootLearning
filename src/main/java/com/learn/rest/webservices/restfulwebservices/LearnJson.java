package com.learn.rest.webservices.restfulwebservices;

public class LearnJson {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LearnJson{" +
                "message='" + message + '\'' +
                '}';
    }

    public LearnJson(String message) {
        this.message = message;
    }


}
