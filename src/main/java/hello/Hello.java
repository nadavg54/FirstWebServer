package hello;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nad on 10/24/17.
 */
@Data
@RestController
public class Hello {

    @Autowired
    private ResturantExpensesRepo repo;

    @RequestMapping(value = "/nadi",method = RequestMethod.GET)
    @ResponseBody
    public void hello()
    {
        Logger logger = LoggerFactory.getLogger("a");
        logger.info("got a request");
        //return "its nadav first web server";
        ResturantExpenseEntity resturantExpenseEntity = new ResturantExpenseEntity();
        resturantExpenseEntity.setId("1234");
        resturantExpenseEntity.setName("nadiAndJessica22222");
        repo.save(resturantExpenseEntity);
    }
}
