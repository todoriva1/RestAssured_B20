package pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

//@Getter  @Setter
@AllArgsConstructor
@NoArgsConstructor
// @ToString
@Data // ova annotacija ukljucuje getter,setter, argConstructor, toString, tako da je ovo gore comment out jer dovoljna je samo @Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Department {


    private int department_id;
    private String department_name;
    private int manager_id;
    private int location_id;


}
