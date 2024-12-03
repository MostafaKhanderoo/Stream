package entity;

import base.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity<Integer> {
    private String firstname;
    private String lastname;


    public User(Integer t,String firstname,String lastname){
super(t);
this.firstname =firstname;
this.lastname =lastname;
   }
}
