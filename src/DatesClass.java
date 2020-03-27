import java.util.Date;


public class DatesClass {

  private Date currentDate = new Date();
  private Date modifiedDate;

  public Date getCurrentDate() {
    return currentDate;
  }

  public Date getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }
}
