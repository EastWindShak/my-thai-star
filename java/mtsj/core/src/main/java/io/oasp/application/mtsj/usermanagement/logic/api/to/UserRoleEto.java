package io.oasp.application.mtsj.usermanagement.logic.api.to;

import io.oasp.application.mtsj.general.common.api.to.AbstractEto;
import io.oasp.application.mtsj.usermanagement.common.api.UserRole;

/**
 * Entity transport object of UserRole
 */
public class UserRoleEto extends AbstractEto implements UserRole {

  private static final long serialVersionUID = 1L;

  private String name;

  private boolean active;

  @Override
  public String getName() {

    return this.name;
  }

  @Override
  public void setName(String name) {

    this.name = name;
  }

  @Override
  public boolean getActive() {

    return this.active;
  }

  @Override
  public void setActive(boolean active) {

    this.active = active;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    UserRoleEto other = (UserRoleEto) obj;
    if (this.name == null) {
      if (other.name != null) {
        return false;
      }
    } else if (!this.name.equals(other.name)) {
      return false;
    }
    return true;
  }

}
