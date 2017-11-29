package hello;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



/**
 * Created by nad on 11/24/17.
 */
@Data
@Document(indexName = "expenses",type = "resturantExpenses")
public class ResturantExpenseEntity {

    @Id
    private String id;

    private String name;


}
