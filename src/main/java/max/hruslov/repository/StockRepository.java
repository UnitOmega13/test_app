package max.hruslov.repository;

import max.hruslov.model.Stock;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository extends PagingAndSortingRepository<Stock, Integer> {

    Stock findByStockID(long stockID);

    List<Stock> findAllByEdrpou(int erdpou, Pageable pageable);
}
