package jp.co.okasan.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/** The persistent class for the Users database table. */
@Getter
@Setter
@Entity
@Table(name = "USERS")
@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.TABLE)
  @Column(name = "USER_ID")
  @JsonProperty("USER_ID")
  private Integer userId;

  @Column(name = "USER_NAME")
  @JsonProperty("USER_NAME")
  private String userName;

  @Column(name = "EMAIL")
  @JsonProperty("email")
  private String email;

  @Column(name = "ROLE")
  @JsonProperty("role")
  private String role;

  public User() {}
}
