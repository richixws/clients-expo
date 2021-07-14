package pe.alicorp.skn.services.exp.clients.clients.model.api;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Clients implements Serializable{

  private static final long serialVersionUID = 8799656478674716638L;

  private String clientId;

  private String name;

  private String contactName;

  private String address;

  private String phoneNumber;

  private String businessRuc;

  private String businessName;

  private String segment;

  private Integer availableBalance;

  private Integer totalDebt;

  private Integer clientDebt;

  private Integer advanceSale;

  private String photo;

  private String status;


}