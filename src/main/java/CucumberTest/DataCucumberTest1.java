package CucumberTest;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataCucumberTest1 {
    private static volatile DataCucumberTest1 instance;

    List<Integer> intList = new ArrayList<>();

    //private DataCucumberTest1(){}

    public static DataCucumberTest1 getInstance(){
        if(instance == null){
            synchronized (DataCucumberTest1.class){
                if(instance == null){
                    instance = new DataCucumberTest1();
                }
            }
        }
        return instance;
    }

    public List<Integer> getIntList() {
        return intList;
    }

    public void addTointList(Integer value) {
        this.intList.add(value);
    }
}
