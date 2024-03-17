package donchipong.hoonlog.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class PostController {
    private final PostService postService;
    @GetMapping("/post/{id}")
    public Post post(@PathVariable("id")Long id){
        return postService.findById(id);
    }
}
