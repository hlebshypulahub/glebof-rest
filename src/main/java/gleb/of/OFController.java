package gleb.of;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class OFController {

    @PostMapping("/v1/notify")
    public ResponseEntity<String> notifyAfterSuccess(
            @RequestParam("MERCHANT_ID") String MERCHANT_ID,
            @RequestParam("AMOUNT") String AMOUNT,
            @RequestParam("intid") String intid,
            @RequestParam("MERCHANT_ORDER_ID") String MERCHANT_ORDER_ID,
            @RequestParam("P_EMAIL") String P_EMAIL,
            @RequestParam("P_PHONE") String P_PHONE,
            @RequestParam("CUR_ID") String CUR_ID,
            @RequestParam("SIGN") String SIGN,
            @RequestParam("payer_account") String payer_account,
            @RequestParam("commission") String commission
    ) {
        System.out.println(MERCHANT_ID);
        return new ResponseEntity<>("YES", HttpStatus.OK);
    }
}
