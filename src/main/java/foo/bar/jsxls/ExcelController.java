package foo.bar.jsxls;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author eglowc<eglowc@gmail.com>
 */
@RestController
public class ExcelController {

    @PostMapping("/upload")
    public void upload(@RequestBody List<SampleModel> jsonarray) {
        jsonarray.forEach(System.out::println);
    }
}
