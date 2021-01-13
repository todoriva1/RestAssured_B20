package pojo;

//we want to ignore any extra key that json has
// other then region_id, region_name
// anything unknown to this pojo class should be ignored

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // this is how we with annotation ignore some stuff
public class Region {

    private int region_id;
    private String region_name;

    //no constructor needed because we don't need deserialization, just practice


    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }

    @Override
    public String toString() {
        return "Region{" +
                "region_id=" + region_id +
                ", region_name='" + region_name + '\'' +
                '}';
    }
}
