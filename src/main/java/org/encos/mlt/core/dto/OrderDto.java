package org.encos.mlt.core.dto;

/**
 * @author Enrico Costanzi
 */
public class OrderDto {

    private Long id;
    private String item;

    public OrderDto(Long id, String item) {
        this.id = id;
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

}
