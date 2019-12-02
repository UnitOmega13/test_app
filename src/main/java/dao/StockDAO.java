package dao;

import model.Stock;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StockDAO {
    private static final Map<String, Stock> stockMap = new HashMap<String, Stock>();

    public Stock addStock(Stock stock) {
        stockMap.put(stock.getComment(), stock);
        return stock;
    }

    public Stock updateStock(Stock stock) {
        stockMap.put(stock.getComment(), stock);
        return stock;
    }

    public List<Stock> getAllStocks() {
        Collection<Stock> collection = stockMap.values();
        List<Stock> list = new ArrayList<Stock>();
        list.addAll(collection);
        return list;
    }
}
