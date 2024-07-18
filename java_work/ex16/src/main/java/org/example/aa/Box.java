package org.example.aa;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString

public class Box {

    private String conts;
    /*
    public Box(String cont){
        this.conts=cont;
    }
    public String toString(){
        return "내가 바꾸기 Box{"+"conts='"+conts+'\''+'}';
    }
     */
}
