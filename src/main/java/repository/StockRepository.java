package repository;

import model.StockModel;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface StockRepository extends PagingAndSortingRepository<StockModel, Integer> {

    StockModel findByStockID(long stockID);
    List<StockModel> findAllByEdrpou(int erdpou, Pageable pageable);
}
