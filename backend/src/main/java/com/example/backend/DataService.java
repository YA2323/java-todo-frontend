package com.example.backend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataService {

    DataRepo dataRepo = new DataRepo();

    public void addData(Data data){
        data.setId(dataRepo.datas.size()+1);
        dataRepo.addData(data);
    }

    public List<Data> allData() {
        return dataRepo.allData();
    }

    public Data showTaskByID(int id) {
        return dataRepo.showTaskByID(id);
    }

    public void changeStatus(int id, Data task) {
        dataRepo.changeStatus(id, task);
    }

    public void deleteTaskByID(int id) {
        dataRepo.deleteTaskByID(id);
    }



    /*
    public DataService(DataRepo dataRepo) {
        this.dataRepo = dataRepo;
    }
    public Data getData(int id){
        return dataRepo.getData(id);
    }
    public List<Data>dataList(){
        return dataRepo.dataList();
    }
    //HIERR
    /*
    public void addTodo(Todo todo) {
//        Todo todo = new Todo(todoTxt, todoStatus);
        todoRepo.addTodo(todo);
    }

     */

}
