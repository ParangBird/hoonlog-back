package donchipong.hoonlog.post;

import jakarta.persistence.*;

@Table(name = "POST")
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name ="CONTENT")
    private String content;
}
