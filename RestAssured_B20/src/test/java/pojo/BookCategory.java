package pojo;

// we want to be able to name the fields any name we want
//rather then being limited to use same name as json object key
//but we need to tell Jackson data-bind
//which json key map to which pojo class field
//we use annotation @JsonProperties for this

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookCategory {

    @JsonProperty("id")
    private String category_id;  // we want to give the name we want, that's why we put annotation @JsonProperty ("id") and ("name)
    @JsonProperty("name")       // because the response have only "id" and "name" and we want to map this with name we want to put, that's why annotation
    private String category_name; // annotation point the below line, each of them
                                 //for example
                                //          @JsonProperty("id")  --> this point that below
                                //          private String category_id;



    public BookCategory() {

    }

    public String getId() {
        return category_id;
    }

    public void setId(String id) {
        this.category_id = id;
    }

    public String getName() {
        return category_name;
    }

    public void setName(String name) {
        this.category_name = name;
    }

    @Override
    public String toString() {
        return "BookCategory{" +
                "id='" + category_id + '\'' +
                ", name='" + category_name + '\'' +
                '}';
    }
}