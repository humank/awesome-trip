Business Need: for booking tickets
  Scenario: A passenger want to book an airflight to USA
    Given a passenger booked 1 ticket
    When the airflight is full
    Then the booking should be fail

