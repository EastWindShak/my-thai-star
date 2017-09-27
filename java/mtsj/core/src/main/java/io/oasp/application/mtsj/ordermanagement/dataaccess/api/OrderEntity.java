package io.oasp.application.mtsj.ordermanagement.dataaccess.api;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import io.oasp.application.mtsj.general.dataaccess.api.ApplicationPersistenceEntity;
import io.oasp.application.mtsj.ordermanagement.common.api.Order;

/**
 * The {@link io.oasp.application.mtsj.general.dataaccess.api.ApplicationPersistenceEntity persistent entity} for
 * {@link Order}.
 */
@Entity
@Table(name = "Orders")
public class OrderEntity extends ApplicationPersistenceEntity implements Order {

  private static final long serialVersionUID = 1L;

  private Long bookingId;

  private Long invitedGuestId;

  private List<OrderLineEntity> orderLines;

  /**
   * @return booking
   */
  @Column(name = "idBooking")
  public Long getBookingId() {

    return this.bookingId;
  }

  /**
   * @param booking new value of {@link #getbooking}.
   */
  @Override
  public void setBookingId(Long bookingId) {

    this.bookingId = bookingId;
  }

  /**
   * @return invitedGuest
   */
  @Column(name = "idInvitedGuest")
  public Long getInvitedGuestId() {

    return this.invitedGuestId;
  }

  /**
   * @param invitedGuest new value of {@link #getinvitedGuest}.
   */
  @Override
  public void setInvitedGuestId(Long invitedGuestId) {

    this.invitedGuestId = invitedGuestId;
  }

  /**
   * @return orderLines
   */
  @OneToMany(mappedBy = "order", fetch = FetchType.EAGER)
  public List<OrderLineEntity> getOrderLines() {

    return this.orderLines;
  }

  /**
   * @param orderLines new value of {@link #getorderLines}.
   */
  public void setOrderLines(List<OrderLineEntity> orderLines) {

    this.orderLines = orderLines;
  }

}
