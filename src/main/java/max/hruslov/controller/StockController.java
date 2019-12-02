package max.hruslov.controller;

import lombok.RequiredArgsConstructor;
import max.hruslov.model.Stock;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import max.hruslov.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/database")
public class StockController {

    private final StockRepository stockRepository;

    @PostMapping("/stock/create")
    public Stock create(@RequestBody Stock request){
        return stockRepository.save(request);
    }

    @PutMapping("/stock/update")
    public Stock update(@RequestBody Stock request){
        return stockRepository.save(request);
    }

    @RequestMapping("/allStock")
    public Iterable<Stock> getAll(){
        return stockRepository.findAll();
    }

    @RequestMapping("/allStocks/{erdpou}")
    public List<Stock> getStockByERDPOU(@PathVariable("erdpou") int erdpou, int page, int size){
        return stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size));
    }

    @RequestMapping("/allStocks/{erdpou}/{stockID}")
    public Stock getStockByERDPOUandID(@PathVariable("erdpou") int erdpou, @PathVariable("stockID") int stockID, int page, int size){
        return stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size)).get(stockID);
    }

    @RequestMapping("/allStocks/{erdpou}/sortedBy")
    public List<Stock> getStockByERDPOUSorted(@PathVariable("erdpou") int erdpou, String sortArgument, int page, int size){
        return stockRepository.findAllByEdrpou(erdpou, PageRequest.of(page, size, Sort.by(sortArgument)));
    }

    @RequestMapping("/allstocks/{stockID}")
    public Stock getStockByID(@PathVariable("stockID") long stockID){
        return stockRepository.findByStockID(stockID);
    }

}
