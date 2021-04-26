package finalproject.com.example.demo.Entity;


import javax.persistence.*;


@Entity
@Table(uniqueConstraints ={
        @UniqueConstraint(name = "final_ad",columnNames = "ad")
}
)
public class EntityFinal {
    @Id
    @SequenceGenerator(
            name = "finalid_generator",
            sequenceName = "finalid_generator",
            allocationSize = 1

    )


    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "finalid_generator"
    )
    private Integer final_id;
    @Column(unique = true)
    private String ad;
    private String soyad;
    private int boy;
    private int kilo;



    public Integer getFinal_id() {
        return final_id;
    }

    public void setFinal_id(Integer final_id) {
        this.final_id = final_id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public EntityFinal(Integer final_id, String ad, String soyad, int boy, int kilo) {
        this.final_id = final_id;
        this.ad = ad;
        this.soyad = soyad;
        this.boy = boy;
        this.kilo = kilo;
    }

    public EntityFinal() {

    }

    @Override
    public String toString() {
        return "EntityFinal{" +
                "final_id=" + final_id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", boy=" + boy +
                ", kilo=" + kilo +
                '}';
    }
}
