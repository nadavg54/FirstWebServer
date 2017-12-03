package hello;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import javax.persistence.GeneratedValue;
import java.util.Date;


/**
 * Created by nad on 11/24/17.
 */
@Data
@Document(indexName = "expenses",type = "resturantExpenses")
public class ResturantExpenseEntity {

    @Id
    @GeneratedValue
    private String id;

    private String name;

    private Date date;

    private Short expense;


}
