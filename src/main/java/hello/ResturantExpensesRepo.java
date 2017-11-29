package hello;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Created by nad on 11/24/17.
 */
public interface ResturantExpensesRepo extends ElasticsearchRepository<ResturantExpenseEntity,String> {
}
