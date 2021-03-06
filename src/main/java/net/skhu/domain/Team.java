/*
minsub
 */
package net.skhu.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Getter
@NoArgsConstructor
public class Team {
    Integer idx;
    String name;
    String name1;
    String name2;
    int candidate1idx;
    int candidate2idx;
    String pledge;
    String reccoPhotoUrl;
    String electioneeringFileUrl;
    String teamPhotoUrl;
    String oathPhotoUrl;
    int electionIdx;
    String candidate1CertiUrl;
    String candidate2CertiUrl;
    int typeChk;
    String department;

    String profileUrl1;//정후보사진
    String profileUrl2;//부후보사진

    @Builder
    public Team(int idx, String name, int candidate1idx, int candidate2idx, String pledge, String reccoPhotoUrl,
                String electioneeringFileUrl, String teamPhotoUrl, String oathPhotoUrl, int electionIdx,
                String candidate1CertiUrl, String candidate2CertiUrl, int typeChk,String department) {

        this.idx = idx;
        this.name=name;
        this.candidate1idx = candidate1idx;
        this.name = name;
        this.candidate2idx = candidate2idx;
        this.pledge =pledge;
        this. reccoPhotoUrl =reccoPhotoUrl;
        this.electioneeringFileUrl =electioneeringFileUrl;
        this.teamPhotoUrl =teamPhotoUrl;
        this.oathPhotoUrl =oathPhotoUrl;
        this.electionIdx =electionIdx;
        this.candidate1CertiUrl =candidate1CertiUrl;
        this.candidate2CertiUrl =candidate2CertiUrl;
        this.typeChk = typeChk;
        this.department =department;


    }



    @Override
    public String toString() {
        return "Team{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", name1='" + name1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", candidate1idx=" + candidate1idx +
                ", candidate2idx=" + candidate2idx +
                ", pledge='" + pledge + '\'' +
                ", reccoPhotoUrl='" + reccoPhotoUrl + '\'' +
                ", electioneeringFileUrl='" + electioneeringFileUrl + '\'' +
                ", teamPhotoUrl='" + teamPhotoUrl + '\'' +
                ", oathPhotoUrl='" + oathPhotoUrl + '\'' +
                ", electionIdx=" + electionIdx +
                ", candidate1CertiUrl='" + candidate1CertiUrl + '\'' +
                ", candidate2CertiUrl='" + candidate2CertiUrl + '\'' +
                ", typeChk=" + typeChk + '\'' +
                ", department=" + department + '\'' +
                ", profileUrl1=" + profileUrl1 + '\'' +
                ", profileUrl2=" + profileUrl2 +
                '}';
    }
}
