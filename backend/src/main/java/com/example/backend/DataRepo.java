package com.example.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@Repository
public class DataRepo {

    Map<Integer, Data> datas = new HashMap<>();

    public void addData(Data data){
        datas.put(data.getId(),data);
    }

    @Override
    public String toString() {
        return "DataRepo{" +
                "data=" + datas +
                '}';
    }

    public List <Data> allData() {
        List<Data> list = new ArrayList<>();
        for (Map.Entry<Integer, Data> entry: datas.entrySet()
        ) {
            list.add(entry.getValue());
        }
        return list;
    }

    public Data showTaskByID(int id) {
        return datas.get(id);
    }

    public void changeStatus(int id, Data task) {
        datas.put(id, task);
    }

    public void deleteTaskByID(int id) {
        datas.remove(id);
    }

/*
    private final Map<Integer,Data> toDoData = Map.of(
            1, new Data("Java learning",OPEN),
            2, new Data("Css Learning",IN_PROGRESS),
            3, new Data("JS Learning",DONE),
            4, new Data("PHP Learning",DONE)
                    );
    public Data getData(int id){
        Data data = toDoData.get(id);
        return data;
    }
    public List<Data> dataList(){
        return new ArrayList<>(toDoData.values());
    }

     */
}
