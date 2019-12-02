package max.hruslov.controller;

import max.hruslov.model.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import max.hruslov.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/database")
public class StockController {

    @Autowired
    StockRepository stockRepository;

    @PostMapping("/stock/create")
    @ResponseBody
    public Stock create(@RequestBody Stock request){
        return stockRepository.save(request);
    }

    @PutMapping("/stock/update")
    @ResponseBody
    public Stock update(@RequestBody Stock request){
        return stockRepository.save(request);
    }

    @RequestMapping("/allStock")
    @ResponseBody
    public Page<Stock> getAll(){
        return stockRepository.findAll(new PageRequest(0, 20));
    }

    @RequestMapping("/allStocks/{erdpou}")
    @ResponseBody
    public List<Stock> getStockByERDPOU(@PathVariable("erdpou") int erdpou, int page, int size){
        return stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size));
    }

    @RequestMapping("/allStocks/{erdpou}/{stockID}")
    @ResponseBody
    public Stock getStockByERDPOUandID(@PathVariable("erdpou") int erdpou, @PathVariable("stockID") int stockID, int page, int size){
        return stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size)).get(stockID);
    }

    @RequestMapping("/allStocks/{erdpou}/sortedBy")
    @ResponseBody
    public List<Stock> getStockByERDPOUSorted(@PathVariable("erdpou") int erdpou, String sortArgument, int page, int size){
        return stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size, Sort.by(sortArgument)));
    }

    @RequestMapping("/allstocks/{stockID}")
    @ResponseBody
    public Stock getStockByID(@PathVariable("stockID") long stockID){
        return stockRepository.findByStockID(stockID);
    }

}
