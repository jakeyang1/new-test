package prj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import prj.model.Stock;
import prj.service.StockForTransService;
import prj.service.StockPagingAndSortingService;
import prj.service.StockService;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    StockService stockService;

    @RequestMapping("/getStockByName/{name}")
    public List<Stock> getStockByName(@PathVariable String name){
        return stockService.findByName(name);
    }

    @RequestMapping("/getAllStocks")
    public List<Stock> getAllStocks(){
        return stockService.getAllStock();
    }

    @RequestMapping("/deleteStock")
    public void deleteStock(){
         stockService.delete();
    }

    @RequestMapping("/deleteStockByID/{ID}")
    public void deleteStockByID(@PathVariable String  ID){
        stockService.deleteStockByID(Integer.valueOf(ID));
    }

    @RequestMapping("/insertStock")
    public Stock insertStock(){
        return stockService.insertStock();
    }
    //修改库存信息
    @RequestMapping("/updateStock")
    Stock updateStock(){
        return stockService.updateStock();
    }





    @Autowired
    private StockPagingAndSortingService stockPagingAndSortingService;
    @RequestMapping("/sortByName")
    List<Stock> sortByName(){
        return stockPagingAndSortingService.sortByName();
    }

    @RequestMapping("/splitPage")
    List<Stock> splitPage(){
        return stockPagingAndSortingService.splitPage();
    }

    @RequestMapping("/getStockByDesc/{desc}")
    List<Stock> getStockByDesc(@PathVariable String  desc){
        return stockService.getStockByDesc(desc);
    }

    @Autowired
    StockForTransService stockForTransService;
    @RequestMapping("/transOK")
    void transOK(){
        stockForTransService.updateStockOK();
    }

    @RequestMapping("/transError")
    void transError(){
        stockForTransService.updateStockError();
    }
}
