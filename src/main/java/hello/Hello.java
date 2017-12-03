package hello;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by nad on 10/24/17.
 */
@Data
@RestController
public class Hello {

    @Autowired
    private ResturantExpensesRepo repo;

    @RequestMapping(value = "/expenses/restaurants",method = RequestMethod.POST,consumes ="application/json")
    @ResponseBody
    public void hello(@RequestBody ResturantExpenseDto dto)
    {
        Logger logger = LoggerFactory.getLogger("a");
        logger.info("got a request");

        ResturantExpenseEntity resturantExpenseEntity = new ResturantExpenseEntity();
        resturantExpenseEntity.setDate(new Date(System.currentTimeMillis()));
        resturantExpenseEntity.setName(dto.getName());
        resturantExpenseEntity.setExpense(dto.getExpense());
        repo.save(resturantExpenseEntity);
    }
}
