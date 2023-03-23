package kr.co.Toy1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity(name = "board")
public class Board extends BaseTimeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String title;
    private String contents;
    private String userYn;
    private Long modifyId;

    @Builder
    public Board(Long id, String title, String contents, String userYn, Long registerId, Long modifyId) {
        this.id = id;
        this.title = title;
        this.contents = contents;
        this.userYn = userYn;
        this.registerId = registerId;
        this.modifyId = modifyId;

    }
}
