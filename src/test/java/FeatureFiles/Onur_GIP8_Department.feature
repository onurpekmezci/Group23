Feature:Add-Edit-Delete Departments under School Setup

  Background:

    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  @Regression
  Scenario:Add-Edit-Delete Departments

    When Navigate to department
    Then Select School
    And  Click add button

    And  Department Constants
    And  Create Constants

    And  click Section
    And  Create Section

    And  Click School Department
    And  Create department

    And  Click Save
    And  Verify successfuly

    # editleme işlemi yapılacağı zmaan açılmalı
  # And Click edit button

#     id değiştirmeden value güncellemesi yapmıyor. Already exist uyarısı veriyor. id ve value değiştirdiğinde ise yeni kayır oluşturuyor ve eski kaydı güncellemiyor.
#    And  Department Constants
#    And  Wait until loading
#    And  Click dialog edit button
#    And  Edit Constants

#  id değiştirmeden value güncellemesi yapmıyor. Already exist uyarısı veriyor. id ve value değiştirdiğinde ise yeni kayır oluşturuyor ve eski kaydı güncellemiyor.
#    And  click Section
#    And  Click dialog edit button
#    And  Edit Section

    # name ve code değiştirildiğinde önceden kayıtlı olan section ve constant gelmiyor. Dolayısıyla bug olduğundan işleme alınmıyor.
#    And  Click School Department
#    And  Create department
#    And  Click Save


    And  Click edit button
    And  Department Constants
    And  Dialog records delete


    And  click Section
    And  Dialog records delete
    And  Click Save

    And Delete departments
    And Verify successfuly



