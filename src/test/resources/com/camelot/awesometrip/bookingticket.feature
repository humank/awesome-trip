Business Need: for booking a flight
  Scenario: booking a flight from TPE to HKD, seats are available for booking
    Given given passengers' information
      | passportId | Identity   | email       | phoneNumber   |
      | 2345678901 | A123456789 | 234@abc.com | +886919122334 |
      | 3456789012 | B123456789 | 456@abc.com | +886970123456 |
    When book for flight with flightInformation
      | flightNumber | departFrom | arriveTo | departTime          | returnTime       |  seatClass | isRoundTrip |
      | CI2021       | TPE        | HKD      | 2021-11-11 08:00:00 | 2021-11-15 18:00 |  classic   | true        |
    And need to check-in luggage for
      | weight |
      | 20     |
      | 35     |
    Then there should have 2 flightTickets be booked
