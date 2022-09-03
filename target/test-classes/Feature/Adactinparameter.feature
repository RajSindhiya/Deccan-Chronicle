Feature: Verifying Adactin hotelapp page

  Scenario Outline: Verifying Adactin hotelapp page with valid credentials
    Given User is on the Adactin login page
    When User should login with "<username>","<Password>"
    And User should search hotel using details "<Location>", "<Hotels>","<Roomtype>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>" and "<ChildrenPerRoom>"
    And User should select hotel
    And User should book hotel using details "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo>","<CreditCardType>","<ExpiryMonth>","<ExpiryYear>" and "<CVVNumber>"
    Then User should print booking order Id

    Examples: 
      | username    | Password     | Location | Hotels         | Roomtype | NumberOfRooms | CheckInDate | CheckOutDate | AdultsPerRoom | ChildrenPerRoom | FirstName | LastName | BillingAddress | CreditCardNo     | CreditCardType | ExpiryMonth | ExpiryYear | CVVNumber |
      | Sindhiya    | XQSB78       | Paris    | Hotel Sunshine | Double   | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | RenukaGowri | Renugopal@30 | London   | Hotel Creek    | Standard | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Renuka    | Gowri    | Bengaluru      | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | Sindhiya    | XQSB78       | Paris    | Hotel Sunshine | Double   | 1 - One       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | Sindhiya    | XQSB78       | Paris    | Hotel Creek    | Double   | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | Sindhiya    | XQSB78       | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | RenukaGowri | Renugopal@30 | London   | Hotel Sunshine | Double   | 1 - One       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Renuka    | Gowri    | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | Sindhiya    | XQSB78       | Paris    | Hotel Sunshine | Double   | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | Sindhiya    | XQSB78       | Paris    | Hotel Creek    | Double   | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | RenukaGowri | Renugopal@30 | Paris    | Hotel Sunshine | Double   | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Renuka    | Gowri    | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | Sindhiya    | XQSB78       | Sydney   | Hotel Sunshine | Standard | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
      | Sindhiya    | XQSB78       | Paris    | Hotel Sunshine | Double   | 2 - Two       | 17/08/2022  | 18/08/2022   | 2 - Two       | 2 - Two         | Sindhiya  | Samuel   | Chennai        | 1234567890123456 | VISA           | May         |       2022 |       111 |
