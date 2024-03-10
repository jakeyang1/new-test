package prj.repo;


import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;
import prj.model.Stock;

@Component
public interface StockPagingAndSortingRepo extends PagingAndSortingRepository<Stock, Integer> {

}
