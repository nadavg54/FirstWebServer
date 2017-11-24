package hello;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;

/**
 * Created by nad on 11/24/17.
 */
@Document(indexName = "expenses",type = "resturantExpenses")
public class ResturantExpenseEntity {

    @Id
    @GeneratedValue
    private long id;


}
