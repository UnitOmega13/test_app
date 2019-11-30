package controller;

import dao.StockDAO;
import model.StockModel;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/database")
public class StockController {

    @Autowired
    StockRepository stockRepository;

    @Autowired
    StockDAO stockDAO;

    @PostMapping("/stock/create")
    @ResponseBody
    public StockModel create(@RequestBody StockModel request){

        return stockDAO.addStock(request);
    }

    @PutMapping("/stock/update")
    @ResponseBody
    public StockModel update(@RequestBody StockModel request){
        stockRepository.save(request);
        return stockDAO.updateStock(request);
    }

    @RequestMapping("/allStock")
    @ResponseBody
    public List<StockModel> getAll(@RequestBody StockModel request){
        List<StockModel> stocks = stockDAO.getAllStocks();
        return stocks;
    }

    @RequestMapping("/allStocks/{erdpou}")
    @ResponseBody
    public List<StockModel> getStockByERDPOU(@PathVariable("erdpou") int erdpou, int page, int size){
        List<StockModel> stocks = stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size));
        return stocks;
    }

    @RequestMapping("/allStocks/{erdpou}/{stockID}")
    @ResponseBody
    public StockModel getStockByERDPOUandID(@PathVariable("erdpou") int erdpou, int stockID, int page, int size){
        StockModel stocks = stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size)).get(stockID);
        return stocks;
    }

    @RequestMapping("/allStocks/{erdpou}/sortedBy")
    @ResponseBody
    public List<StockModel> getStockByERDPOUSorted(@PathVariable("erdpou") int erdpou, String sortArgument, int page, int size){
        List<StockModel> stocks = stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size, Sort.by(sortArgument)));
        return stocks;
    }

    @RequestMapping("/allstocks/{stockID}")
    @ResponseBody
    public StockModel getStockByID(@PathVariable("stockID") long stockID, int page, int size){
        StockModel stocks = stockRepository.findByStockID(stockID);
        return stocks;
    }
}
