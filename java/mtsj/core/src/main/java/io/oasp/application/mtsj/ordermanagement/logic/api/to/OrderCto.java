package io.oasp.application.mtsj.ordermanagement.logic.api.to;

import java.util.List;

import io.oasp.application.mtsj.bookingmanagement.logic.api.to.BookingEto;
import io.oasp.application.mtsj.bookingmanagement.logic.api.to.InvitedGuestEto;
import io.oasp.application.mtsj.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Order
 */
public class OrderCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private OrderEto order;

  private BookingEto booking;

  private InvitedGuestEto invitedGuest;

  private List<OrderLineCto> orderLines;

  public OrderEto getOrder() {

    return this.order;
  }

  public void setOrder(OrderEto order) {

    this.order = order;
  }

  public List<OrderLineCto> getOrderLines() {

    return this.orderLines;
  }

  public void setOrderLines(List<OrderLineCto> orderLines) {

    this.orderLines = orderLines;
  }

  /**
   * @return booking
   */
  public BookingEto getBooking() {

    return this.booking;
  }

  /**
   * @param booking new value of {@link #getbooking}.
   */
  public void setBooking(BookingEto booking) {

    this.booking = booking;
  }

  /**
   * @return invitedGuest
   */
  public InvitedGuestEto getInvitedGuest() {

    return this.invitedGuest;
  }

  /**
   * @param invitedGuest new value of {@link #getinvitedGuest}.
   */
  public void setInvitedGuest(InvitedGuestEto invitedGuest) {

    this.invitedGuest = invitedGuest;
  }

}
