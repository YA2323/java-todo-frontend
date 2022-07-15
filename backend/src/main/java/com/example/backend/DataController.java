package com.example.backend;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/todo")
public class DataController {

     DataService dataService = new DataService();

    @PostMapping()
    public void addNewTask(@RequestBody Data data) {
        dataService.addData(data);
    }
    @GetMapping()
    public List<Data> showAllTasks() {
        return dataService.allData();
    }
    @GetMapping("/{id}")
    public Data showTaskByID(@PathVariable int id){
        return dataService.showTaskByID(id);
    }
    @PutMapping("/{id}/update")
    public void changeStatus(@PathVariable int id, @RequestBody Data data){
        dataService.changeStatus(id, data);
    }
    @DeleteMapping("/{id}")
    public void deleteTaskByID(@PathVariable int id){
        dataService.deleteTaskByID(id);
    }


/*
    public DataController(DataService dataService) {
        this.dataService = dataService;
    }


    @GetMapping
    public List<Data> dataList(){
        return dataService.dataList();
    }



    //(path = "{id}")
    @GetMapping(path = "{id}")
    public Data getData(@PathVariable int id){  //@PathVariable int id
        Data data = dataService.getData(id);
        return data;
    }


 */
}
