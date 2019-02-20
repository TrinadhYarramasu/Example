package user.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.models.ImageModel;
import user.services.ImageService;

import java.util.List;





@RestController
@RequestMapping("/productapi")
@CrossOrigin(origins="http://localhost:4200")

public class DisplayController {

//	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
 // getting all the products from the database.     
	@Autowired
	private ImageService imgservice;

	@GetMapping("/getData")
	public List<ImageModel> getData(){
		return imgservice.getAll();
	}

   
}


