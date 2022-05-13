import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void everyStatementTest(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("#");

        List<String> resList = new ArrayList<>();
        resList.add("0");
        resList.add("#");
        resList.add("0");
        resList.add("0");
        resList.add("0");
        resList.add("#");
        resList.add("#");
        resList.add("0");
        resList.add("#");


        assertEquals(list, SILab2.function(resList));

        List<String> exList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList));

        List<String> exList2 = new ArrayList<>();



        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList2));
    }

    @Test
    void everyBranchTest(){
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("#");
        list.add("2");
        list.add("1");
        list.add("2");
        list.add("#");
        list.add("#");
        list.add("2");
        list.add("#");

        List<String> resList = new ArrayList<>();
        resList.add("0");
        resList.add("#");
        resList.add("0");
        resList.add("0");
        resList.add("0");
        resList.add("#");
        resList.add("#");
        resList.add("0");
        resList.add("#");


        assertEquals(list, SILab2.function(resList));

        List<String> exList = new ArrayList<>();
        list.add("0");
        list.add("#");
        list.add("0");


        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList));

        List<String> exList2 = new ArrayList<>();



        assertThrows(IllegalArgumentException.class, () -> SILab2.function(exList2));

    }




}