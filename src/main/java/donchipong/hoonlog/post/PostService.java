package donchipong.hoonlog.post;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class PostService {
    private final PostRepository postRepository;
    public Post findById(Long id){
        return postRepository.findById(id).get();
    }
}
