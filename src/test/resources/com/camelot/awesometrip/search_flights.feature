Business Need: for searching a flight
  Scenario: Search flight from TPE to HKD
    Given a passenger want to book a flight from TPE to HKD
    When searching for depart_day as "2021-11-11"
    Then the flowing flights will show up
      | Flight number | Depart              | From     | To        | Price |
      | CI0220        | 2021-11-11 03:30:00 | 桃園(TPE) | 函館(HKD) | 1800  |
      | CI0220        | 2021-11-11 18:30:00 | 桃園(TPE) | 函館(HKD) | 2120  |

