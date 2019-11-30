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
    List<StockModel> findAllByComment(String comment, Pageable pageable);
    List<StockModel> findAllByAuthorizedCapital(int authrizedCapital, Pageable pageable);
    List<StockModel> findAllByEdrpou(int erdpou, Pageable pageable);
    List<StockModel> findAllByAmount(int amount, Pageable pageable);
    List<StockModel> findAllByFullNominalCost(double fullNominalCost, Pageable pageable);
    List<StockModel> findAllByNominalCost(double nominalCost, Pageable pageable);
    List<StockModel> findAllByDutyPaid(double dutyPaid, Pageable pageable);
    List<StockModel> findAllByProdactionDate(Date productionData, Pageable pageable);
}
