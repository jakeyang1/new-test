package prj.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import prj.model.Stock;

import java.util.List;

//用@Conponent注解，放入Spring容器中
@Component
public interface StockRepo extends JpaRepository<Stock, Integer> {
    //JPA将根据这个方法自动拼装查询语句
    public List<Stock> findByName(String name);
    //删除库存信息
    @Override
    public void delete(Stock stock);
    @Override
    void deleteById(Integer id);
    //新增或更新库存
    @Override
    public Stock save(Stock stock);

    @Query("select s from Stock s where s.description like ?1%")
    public List<Stock> getStockByDesc(String desc);

}
