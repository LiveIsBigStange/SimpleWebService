package solutions.javasoft.dao.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Product {
    @Id
    private String code;
    private String name;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<PriceList> priceList;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PriceList> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<PriceList> priceList) {
        this.priceList = priceList;
    }
}
