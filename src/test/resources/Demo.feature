Feature: Demo

@Smoke
Scenario: Verify that we can order
  Given The user wants to see payment gateway website
  When The user wants buy Elephant toy
  Then The  user wants to enter payment information as
       |CNumber    | 1224243575835653    |
       |EMonth     |   09                |
       |EYear      |  2026               |
       |CVVCode    |    425              |

  Then  The user wants pay now
  And The user wants to verify message  as "Payment successfull!"





