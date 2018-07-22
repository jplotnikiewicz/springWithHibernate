package part5;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {


  @NotBlank(message="name can't left blank")
  @Size(min=2, max=20, message="name must have min length of 2, and max of 20")
  private String name;

  private Integer id;
  
  public User(){
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public void setId(Integer id) {
    this.id = id;
  }
  
  public Integer getId() {
    return id;
  }
}