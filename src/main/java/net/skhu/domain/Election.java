package net.skhu.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class Election {
    private int idx;

    private int name;

    private LocalDate voteStartDate;

    private LocalDate voteEndDate;

    private int type;

    private LocalDate regStartDate;

    private LocalDate regEndDate;

    @Builder
    public Election(int idx,int name, LocalDate voteStartDate, LocalDate voteEndDate, int type, LocalDate regStartDate, LocalDate regEndDate) {
        this.idx=idx;
        this.name = name;
        this.voteStartDate = voteStartDate;
        this.voteEndDate = voteEndDate;
        this.type = type;
        this.regStartDate = regStartDate;
        this.regEndDate = regEndDate;
    }

}
