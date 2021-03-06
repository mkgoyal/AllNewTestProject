@tag
Feature: FaceBook Login

  @tag1
  Scenario: FaceBook
    Given Launch application and load URL
    When Enter given username and password
    Then Check if login success
