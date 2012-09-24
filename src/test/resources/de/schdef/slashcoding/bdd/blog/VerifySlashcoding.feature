Feature: It should be possible to search for BDD at the slash coding website, slashcoding.blogspot.com

Scenario: Search for BDD

    Given I want to see the blog posts on slashcoding.blogspot.com
    When I search for BDD
    Then I should be able to get a list of minimum 2 blog posts