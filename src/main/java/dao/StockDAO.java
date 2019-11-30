package dao;

import model.StockModel;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class StockDAO {
    private static final Map<String, StockModel> stockMap = new HashMap<String, StockModel>();

    public StockModel addStock(StockModel stock) {
        stockMap.put(stock.getComment(), stock);
        return stock;
    }

    public StockModel updateStock(StockModel stock) {
        stockMap.put(stock.getComment(), stock);
        return stock;
    }

    public List<StockModel> getAllStocks() {
        Collection<StockModel> collection = stockMap.values();
        List<StockModel> list = new ArrayList<StockModel>();
        list.addAll(collection);
        return list;
    }
}
